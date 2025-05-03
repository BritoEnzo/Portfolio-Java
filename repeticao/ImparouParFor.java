package repeticao;

import java.util.Scanner;

public class ImparouParFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,max =5, par, impar, num;
		Scanner sc = new Scanner(System.in);
		
		for (i=0;i<max;i++) {
			
			System.out.println("Digite o valor de um número para verificar se o mesmo é par ou impar");
			num = sc.nextInt();
			
			if (num % 2 == 0) {
	            System.out.println(num + " é par.");
				
			} else {    System.out.println(num + " é impar.");
				
			}
			
		}
		System.out.println("Fim do programa");
	}

}
