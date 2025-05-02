//Enzo Rafael Oliveira Brito 1°DS
package ListadeExerciciosJ;

import javax.swing.JOptionPane;

public class J7 {

	public static void main(String[] args) {
		double voto1=0,voto2=0,tot_voto,por_voto1,por_voto2;
		int opc;
		Object[] cod = {"Fujiro NaKomb", "Takaro Né"};
		int opc2 = 0;
		Object[] cod2 = {"Sim","Não"};
		
		
		while(opc2 == 0) {
			opc = JOptionPane.showOptionDialog(null, "Vote em um dos candidatos", "ENTRADA", 0, JOptionPane.QUESTION_MESSAGE, null, cod, cod[0]);
			
			if(opc == 0) {
				voto1++;
			}
			else {
				voto2++;
			}
		
			opc2 = JOptionPane.showOptionDialog(null, "Há mais alguma pessoa", "ENTRADA", 0, JOptionPane.QUESTION_MESSAGE, null, cod2, cod2[0]);
			if(opc2 == 1) {
				if(voto1 == voto2) {
					JOptionPane.showMessageDialog(null,"Houve um empate. Um voto extra será pedido para o desempate.");
					opc = JOptionPane.showOptionDialog(null, "Vote em um dos candidatos", "ENTRADA", 0, JOptionPane.QUESTION_MESSAGE, null, cod, cod[0]);
					if(opc == 0) {
						voto1++;
					}
					else {
						voto2++;
					}
					tot_voto = (voto1+voto2);
					por_voto1 = (voto1/tot_voto)*100;
					por_voto2 = (voto2/tot_voto)*100;
					JOptionPane.showMessageDialog(null, "O total de votos foi de: "+tot_voto+". a porcentagem de votos de Fujiro NaKomb foi de: "+por_voto1+"%. E a porcentagem de votos de Takaro Né foi de: "+por_voto2+".","Saida", JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					tot_voto = (voto1+voto2);
					por_voto1 = (voto1/tot_voto)*100;
					por_voto2 = (voto2/tot_voto)*100;
					JOptionPane.showMessageDialog(null, "O total de votos foi de: "+tot_voto+". a porcentagem de votos de Fujiro NaKomb foi de: "+por_voto1+"%. E a porcentagem de votos de Takaro Né foi de: "+por_voto2+".","Saida", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
		}

	}

}
