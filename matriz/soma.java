package matriz;

public class soma {

	static int [][] soma(int [][]A, int[][]B ){
		int linhas = A.length; 
		int colunas = B.length;
		int [][] S = new int [linhas][colunas];
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j < A.length; j++) {
				S[i][j]=A[i][j]+B[i][j];
			}
		}
		return S;
	}
	
}
