//Enzo Rafael Oliveira Brito 1°DS
package ListadeExerciciosJ;

import java.util.Scanner;

public class J1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double contador = 1;
		int trocar = 0;
		
		while(contador <= 100 && trocar == 0) {
			System.out.println(contador);
			contador++;
			if(contador == 100) {
				trocar = 1;
			}
		}
		while(contador >= 0 && trocar == 1) {
			System.out.println(contador);
			contador--;
		}
		
	}

}
