package atividadesp1;

import java.util.Scanner;

public class Ex1118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
		
		double a , b, media, ncalculo=0;
		
		
		do {
			do {
				a = sc.nextDouble();
				if (a < 0 || a > 10) {
					System.out.println("nota invalida");
				}
				
			} while (a < 0 || a > 10);
			
			
			do {
				b = sc.nextDouble();
				if (b < 0 || b > 10) {
					System.out.println("nota invalida");
				}
				
			} while (b < 0 || b > 10);
			
			
			media = (a+b)/2;
			
			if (a > 0 || a <= 10 && b > 0 || b <= 10) {
				System.out.printf("media = %.2f\n",media);
			}
			do {
				System.out.println("novo calculo (1-sim 2-nao)");
				ncalculo = sc.nextDouble();
				if (ncalculo == 2 ) {
					break;
				}
			} while (ncalculo != 1);
			
		} while (a < 0 || a > 10 && b < 0 || b > 10 || ncalculo == 1);

 

	}

}
