package listaA;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float preco,desconto,vista;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do preço do produto");
		preco = sc.nextFloat();
		
		desconto = (preco * 10/100);
				
		vista = (preco-desconto);
		
		System.out.println("o preço a vista desse produto será"+vista);
		

	}

}
