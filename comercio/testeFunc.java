package comercio;

import java.util.Scanner;

public class testeFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		double desconto;
		double inss;
		
		func f = new func();
		f.Nome ="Gabriel Lindinho";
		f.codigoFunc =13;
		f.Cargo ="Catador de latinha";
		f.salarioBruto = 1000;
		
		System.out.println("Digite o valor do percentual de desconto do inss:");
		inss = sc.nextInt();
		
		desconto = (inss/100) * f.salarioBruto;
				
		
	
		
		System.out.println("Seus dados são :" +f.mostrarDados());
		
		System.out.println("O valor do seu salário Liquido é de: "+f.calcularSalarioLiquido(desconto));
	

	}

}
