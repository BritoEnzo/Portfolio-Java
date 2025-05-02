package listaA;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float raio,altura,volume;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio do cilindro");
		raio = sc.nextFloat();

		System.out.println("Digite o valor da altura do cilindro");
		altura = sc.nextFloat();
		
		volume = (float) (3.14159*raio*raio*altura);
		System.out.println("O volume do cilindro é "+volume);
		

	}

}
