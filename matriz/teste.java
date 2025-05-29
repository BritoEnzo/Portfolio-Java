package matriz;

public class teste {
	
	public static void imprimirMatriz(int m[][]) {
		for (int i = 0; i < m.length; i ++ ) {
			for (int j = 0; j <m.length; j++) {
				System.out.println(m[i][j]+ "\t");
			}
			System.out.println();
		}
			
		
		}
	public static void main(String[]args) {
		
		int m [][] = {{0,1,2},{2,4,5},{9,7,5}};
			imprimirMatriz(m);
			
		}
			
}



