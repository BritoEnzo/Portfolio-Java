package listaA;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1,n2,n3,n4,soma,media;//Declaração de variaveis
		Scanner sc = new Scanner(System.in);//Declaração do objeto sc, do tipo scanner, para
		
		
		System.out.println("Digite o Valor do primeiro número");//Escreve o número krai
		n1 = sc.nextFloat();//Leia 
		
		System.out.println("Digite o Valor do segundo número");//Escreve o número krai
		n2 = sc.nextFloat();//Leia 
		
		System.out.println("Digite o Valor do terceiro número");//Escreve o número krai
		n3 = sc.nextFloat();//Leia 
		
		System.out.println("Digite o Valor do quarto número");//Escreve o número krai
		n4 = sc.nextFloat();//Leia 
		
		soma = (n1+n2+n3+n4);//a soma dos números krai
		
		media = (soma/4);//a media dos números krai
		System.out.println("O valor da média dos números é "+media+".");
	}

}
