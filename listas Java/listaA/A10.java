package listaA;

import java.util.Scanner;

public class A8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a1,a2,b1,b2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A");
		a1 = sc.nextFloat();
		
		System.out.println("Digite o valor de B");
		b1 = sc.nextFloat();
		
		a2 = a1;
		b2 = b1;
		a1 = b2;
		b1 = a2;
		
		System.out.println("o valor de A é igual a "+a1+" e o valor de B é igual a "+b1);
				
	}

}
