package repeticao;

import java.util.Scanner;

public class Sorteio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double aleatorio=Math.random();
		aleatorio=aleatorio*11;
		int palpite =0; 
		int meta = (int)aleatorio;
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("Digite um palpite de um número entre 0 a 10: ");
		palpite = sc.nextInt();
		
		if (palpite == meta) {
			System.out.println("Parabéns, você acertou o número sorteado");
			System.out.println("O número inteiro é:" +meta);
		}else {
			System.out.println("Infelizmente, você errou o número,digite outro número e tente novamente");
		}
		}while (palpite != meta);
		

		
		
	}

}
