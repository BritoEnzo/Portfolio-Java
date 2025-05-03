package atividadesp1;

import java.util.Scanner;

public class Ex1006 {

	public static void main(String[] args) {

		double a=0,b=0,c=0,media;
		
		Scanner sc = new Scanner(System.in);
		
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		
		a = (a * 2);
		b = (b * 3);
		c = (c * 5);
		
		media = (a+b+c)/10;
		
		System.out.printf("MEDIA = %.1f\n", media);
		
	}

}
