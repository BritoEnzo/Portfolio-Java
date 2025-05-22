package imposto;

import java.lang.reflect.Array;
import java.util.Scanner;

public class AtvArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double array1 [] = {5,1,5};
		double array2 [] = {10,3,10};
		double array3 [] = new double [3];
		
		
		
		for (int i = 0; i < array1.length; i ++) {
			array3[i] = array1[i] + array2[i];
		}
			System.out.println("valores do 1 vetor : ");
			for (double registros : array1) {
				System.out.println(registros);
			}
			System.out.println("valores do 2 vetor : ");
			for (double registros : array2) {
				System.out.println(registros);
			}
			System.out.println("Soma dos 2 vetores : ");
			for (double registros : array3) {
				System.out.println(registros);
			}
			System.out.println("registros impares do 3° vetor");
			for (double registros : array3) {
				if (registros % 2 != 0) {
					System.out.println(registros);
				}
			}


	}

}
