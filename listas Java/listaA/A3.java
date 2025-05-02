package listaA;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float cgraus,fgraus;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da temperatura em graus Celsius portioli.");
		cgraus = sc.nextFloat();
		
		fgraus = (cgraus* 9/5)+32;
		System.out.println("O valor em Fahrenheit é igual a: "+ fgraus);
		
	}

}
