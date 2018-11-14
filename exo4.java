package multi;

import util.Table;

public class exo4 {
	public static void main(String[] args) {
		int[][] tab = Table.creatTableMulti(12, 8);
		int max = Integer.MIN_VALUE;
		
		
		for(int i=0;i<tab.length; i++) {
			for(int j=0;j<tab[i].length;j++){
				if(tab[i][j]>max) {
					max = tab[i][j];
				}
			}
		}
		
		Table.displayTableMulti(tab);
		System.out.println(max);
	}
}
