//Enzo Rafael Oliveira Brito 1�DS
package listaK;

import javax.swing.JOptionPane;

public class K5 {

	public static void main(String[] args) {
		int opc;
		double	 matrix = 0,senhor_dos_aneis = 0, saga_vencedora;
		String vencedor;		
		int opc1;
		boolean empate;
		Object[] cod = {"matrix", "senhor dos aneis"};
		int opc2 = 0;
		Object[] cod2 = {"Sim","N�o"};
		int opc3;
		Object[] cod3 = {"Sim","N�o"};
		
		
		while(opc2 == 0) {
			opc1 = JOptionPane.showOptionDialog(null, "Escolha sua saga de filmes predileta.", null, 0, JOptionPane.QUESTION_MESSAGE, null, cod, cod[0]);
			if(opc1 == 0) {
				matrix ++;
			}
			else {
				senhor_dos_aneis++;
		
			}
			opc2 = JOptionPane.showOptionDialog(null, "H� mais alguma pessoa", "ENTRADA", 0, JOptionPane.QUESTION_MESSAGE, null, cod2, cod2[0]);
			if(opc2 == 1) {
				
				 if (matrix > senhor_dos_aneis) {
	                    vencedor = "Matrix";
	                    saga_vencedora = matrix;
	                } else if (senhor_dos_aneis > matrix) {
	                    vencedor = "Senhor dos An�is";
	                    saga_vencedora = senhor_dos_aneis;
	                } else {
	                    vencedor = "Empate";
	                    saga_vencedora = matrix;
	                }
			
		
				JOptionPane.showMessageDialog(null, "A saga vencedora foi: " + vencedor +  ", O numero de votos na saga matrix foi de : " + matrix + ". O numero de votos na saga senhor dos an�is foi de : " + senhor_dos_aneis + ".","Saida", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}