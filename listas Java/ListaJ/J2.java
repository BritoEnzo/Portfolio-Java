//Enzo Rafael Oliveira Brito 1°DS
package ListadeExerciciosJ;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class J2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, contador = 0;
		
		num = Integer.parseInt((JOptionPane.showInputDialog(null, "Digite um número", "Entrada", JOptionPane.QUESTION_MESSAGE)));
		
		while (contador != num+1) {
			System.out.println(contador);
			if (contador % 2 == 0) {
				System.out.println("é numero par");
					
				}
			else {
				System.out.println("é numero impar");
			}
			
			contador ++;
		}
		
			
		}
	}



