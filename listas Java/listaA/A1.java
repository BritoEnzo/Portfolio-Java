package listaA;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1,n2,n3,n4,soma,media;//Declara��o de variaveis
		Scanner sc = new Scanner(System.in);//Declara��o do objeto sc, do tipo scanner, para
		
		
		System.out.println("Digite o Valor do primeiro n�mero");//Escreve o n�mero krai
		n1 = sc.nextFloat();//Leia 
		
		System.out.println("Digite o Valor do segundo n�mero");//Escreve o n�mero krai
		n2 = sc.nextFloat();//Leia 
		
		System.out.println("Digite o Valor do terceiro n�mero");//Escreve o n�mero krai
		n3 = sc.nextFloat();//Leia 
		
		System.out.println("Digite o Valor do quarto n�mero");//Escreve o n�mero krai
		n4 = sc.nextFloat();//Leia 
		
		soma = (n1+n2+n3+n4);//a soma dos n�meros krai
		
		media = (soma/4);//a media dos n�meros krai
		System.out.println("O valor da m�dia dos n�meros � "+media+".");
	}

}
