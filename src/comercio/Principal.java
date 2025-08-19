package comercio;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String menu= "\n1.Mostrar dados do produto \n2.Calcular total da compra. \n3.Mostrar dados do funcionário.\n4.Calcular salário líquido do funcionário.\n0.Sair. \n Digite a opção desejada: ";
		String entrada;
		int op=0;
		Produto p= new Produto(12,"Café",35);
		Funcionario f = new Funcionario(1, "Gabriel", "Bixeiro", 1000);
		do {
			entrada= JOptionPane.showInputDialog(menu);
			op=Integer.parseInt(entrada);
			switch(op) {
			case 1: JOptionPane.showMessageDialog(null, p.mostrarDados());
			  break;
			case 2: JOptionPane.showMessageDialog(null, p.calcularTotal(12));
			  break;
			case 3: JOptionPane.showMessageDialog(null, f.mostrarDadosfunc());
			  break;  
			case 4: JOptionPane.showMessageDialog(null, f.calculaSalarioLiquido(5));
			  break;  
			}
				
		}while(op!=0);
		
		
				
	}
	
}
