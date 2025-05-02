//Enzo Rafael Oliveira Brito 1°DS
package ListadeExerciciosJ;

import javax.swing.JOptionPane;

import java.util.Scanner;

public class J10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		int loop = 0;
		Object[] y_n = {"Sim", "Não"};
		

		while (loop == 0) {
			int numero; 
			long fatorial = 1;
			int conversor = 1;
			numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número para o fatorial"));
			while (conversor <= numero) {
				fatorial = fatorial * conversor;
				conversor += 1;
			}
			JOptionPane.showMessageDialog(null, "O fatorial do número " + numero + " é: " + fatorial);
			loop = JOptionPane.showOptionDialog(null, "Há mais alguma conversão?", "ENTRADA", 0, JOptionPane.QUESTION_MESSAGE, null, y_n, y_n[0]);
		}
	}
}

