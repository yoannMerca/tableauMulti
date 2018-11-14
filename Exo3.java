package multi;

public class Exo3 {

	public static void main(String[] args) {
		/*Quel résultat produira cet algorithme ?
			Tableau tableau(4, 2) en Entier
			Variables i, j, valeur en Entier
			Début
			Pour i ← 3 à 0 pas de -1
			Pour j ← 1 à 0 pas de -1
			tableau[i, j] ← j
			Fin Pour
			Fin Pour
			Pour i ← 0 à 3
			Pour j ← 0 à 1
			Ecrire tableau[i, j]
			Fin Pour
			Fin Pour
			Fin
		*/
		
		int[][] tab = new int[4][2];
		
		for(int i=3;i>=0;i--) {
			for(int j=1;j>=0;j--) {
				tab[i][j] =j;
				
			}
			
		}
		
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=1;j++) {
				System.out.print("["+tab[i][j]+"]");
			}
			System.out.println("");
		}	
	}

}
