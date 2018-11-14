package multi;

public class Exo2 {

	public static void main(String[] args) {
		/*	Quel résultat produira cet algorithme ?
			Tableau tableau(2, 3) en Entier
			Variables i, j, valeur en Entier
			Début
			valeur ← 0
			Pour i ← 0 à 1 pas de 1
			Pour j ← 0 à 2 pas de 1
			tableau[i, j] ← valeur
			valeur← valeur + 1
			Fin Pour
			Fin Pour
			Pour i ← 0 à 1
			Pour j ← 0 à 2
			Ecrire tableau[i, j]
			Fin Pour
			Fin Pour
			Fin
		*/
		
		int[][] tab= new int[2][3];
		int valeur = 0;
		
		for(int i = 0;i<tab.length;i++) {
			for(int j=0 ;j<tab[0].length;j++) {
				tab[i][j] = valeur;
				valeur++;
				
			}
		}
		for(int i = 0;i<tab.length;i++) {
			for(int j=0 ;j<tab[0].length;j++) {
				System.out.print(tab[i][j]+"|");
			}
		}

	}

}
