package matriz;

import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		soma som = new soma();
		teste fun = new teste();
		
		int [][] A = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int [][] B = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int [][] C;
		
		C=som.soma(A,B);
		fun.imprimirMatriz(A);
		fun.imprimirMatriz(B);
		fun.imprimirMatriz(C);

	}

}
