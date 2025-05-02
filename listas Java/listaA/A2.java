package listaA;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float lado1,lado2,area;
		Scanner sc1 = new Scanner(System.in);//Declaração do objeto sc, do tipo scanner, para
		
		System.out.println("Digite a largura do retângulo");
		lado1 = sc1.nextFloat();//Leia 
		
		System.out.println("Digite a altura do retângulo");
		lado2 = sc1.nextFloat();//Leia
		
		area = (lado1 * lado2);
		
		System.out.println("A área do seu retangulo é: "+ area);

		
		
		
		
		
		
		
		

	}

}
