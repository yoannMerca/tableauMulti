package multi;

import java.util.Scanner;

import util.Table;
import utilTable.UtilTable;

public class Damier {

	public static void main(String[] args) {
		int positionI = 0;
		int positionJ = 0;
		boolean fin = false;	
		int[][] tab = Table.createTableDamier();
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[0].length; j++) {
				if (tab[i][j] == 1) {
					positionJ = j;
					positionI = i;
				}
			}
		}

		while (fin != true) {
			System.out.println("quel mouvement voulez-vous effectuer : 0 (en haut à gauche), 1(en haut à droite), "
					+ "2 (en bas à gauche), 3 (en bas à droite), 4 (arrêt du jeu)");

			int deplacement = sc.nextInt();

			switch (deplacement) {
			case 4:
			default:
				fin = true;
				break;
			case 1:
				tab[positionI][positionJ] = 0;
				tab[(positionI + 9) % 10][(positionJ + 11) % 10] = 1;
				positionJ = (positionJ + 11) % 10;
				positionI = (positionI + 9) % 10;
				break;
			case 0:
				tab[positionI][positionJ] = 0;
				tab[(positionI + 9) % 10][(positionJ + 9) % 10] = 1;
				positionJ = (positionJ + 9) % 10;
				positionI = (positionI + 9) % 10;
				break;
			case 3:
				tab[positionI][positionJ] = 0;
				tab[(positionI + 11) % 10][(positionJ + 11) % 10] = 1;
				positionJ = (positionJ + 11) % 10;
				positionI = (positionI + 11) % 10;
				break;
			case 2:
			
				tab[positionI][positionJ] = 0;
				tab[(positionI + 11) % 10][(positionJ + 9) % 10] = 1;
				positionJ = (positionJ + 9) % 10;
				positionI = (positionI + 11) % 10;		
			}
			//affiche le tableau a deux dimension
			Table.displayTableMulti(tab);
		}
		sc.close();
	}

}
