package listaA;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float ht,vh,pd,sb,td,sl;
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Digite as horas trabalhadas no mês");
		ht = sc.nextFloat();
		
		System.out.println("Digite o valor da hora de trabalho");
		vh = sc.nextFloat();
		
		System.out.println("Digite o percentual de desconta");
		pd = sc.nextFloat();
		
		sb = (ht * vh);
		td = (pd/100*sb);
		sl = (sb-td);
		
		System.out.println("O salario bruto é"+sb+"o desconto é"+td+"o salario liquido é"+sl);
	}

}
