package bancoSegundoDSM;

import java.util.Scanner;

import javax.swing.JOptionPane;

import comercio.Funcionario;
import comercio.Produto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String menu= "\n1.Realizar depósito \n2.Realizar saque. \n3.Verificar Saldo restante.\n0.Sair. \n Digite a opção desejada: ";
		String entrada;
		int op=0;
		conta c = new conta(200,500,0);
		do {
			entrada= JOptionPane.showInputDialog(menu);
			op=Integer.parseInt(entrada);
			switch(op) {
			case 1: JOptionPane.showMessageDialog(null, c.deposito(c.deposito));
			  break;
			case 2: JOptionPane.showMessageDialog(null, c.sacar(c.saque));
			  break;
			case 3: JOptionPane.showMessageDialog(null, c.mostrarSaldo());
			  break;   
			}

		}while (op != 0);

	}
}
