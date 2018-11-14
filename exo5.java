package multi;

import util.Table;

public class exo5 {

	public static void main(String[] args) {
		int[][] tab = Table.creatTableMulti(4, 3);
		int moyenneTotale =0;
		int sommeTotale = 0;
		for (int i = 0; i < tab.length; i++) {
			int somme = 0;
			for (int j = 0; j < tab[i].length; j++) {
				somme = somme + tab[i][j];
			}
			int moyenne = somme/tab[0].length;
			System.out.println("la moyenne du trimestre est de " + moyenne);	
			sommeTotale += moyenne;
		}
		 moyenneTotale = sommeTotale/tab.length;
		 System.out.println("la moyenne de toutes les moyennes est de " + moyenneTotale);
		 Table.displayTableMulti(tab);
	}

}
