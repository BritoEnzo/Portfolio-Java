package repeticao;

import java.util.Scanner;

public class ComandoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int chute=0;
		
		while (chute != 10) {
			System.out.println("Digite um número inteiro entre 0 e 10:");
			chute = sc.nextInt();
			
			if (chute == 10) {
				System.out.println("Você acertou");
			}else {
				System.out.println("Você errou");
			}
		}
	}

}
