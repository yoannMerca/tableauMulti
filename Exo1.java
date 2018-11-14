package multi;

public class Exo1 {

	public static void main(String[] args) {
		// Écrivez un algorithme remplissant un tableau de 6 sur 13, avec des zéros.
		
		int[][] tab = new int[6][13];
		
		for(int i =0;i<tab.length;i++){
			for(int j =0;j<tab[0].length;j++) {
				tab[i][j] = 0;
			}
			
		}
		
	}

}
