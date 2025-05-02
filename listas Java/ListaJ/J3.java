//Enzo Rafael Oliveira Brito 1°DS
package ListadeExerciciosJ;

import javax.swing.JOptionPane;

public class J3 {

	public static void main(String[] args) {
		int nao_fem=0,nao_masc=0;
		double fem_sim,masc_nao=0,sim_fem=0,fem=0,masc=0,sim_masc=0,sim,nao;
		int opc;
		Object[] cod = {"Homem", "Mulher"};
		int opc2 = 0;
		Object[] cod2 = {"Sim","Não"};
		int opc3;
		Object[] cod3 = {"Sim","Não"};
		
		
		while(opc2 == 0) {
			opc = JOptionPane.showOptionDialog(null, "Escolha seu Genero", "ENTRADA", 0, JOptionPane.QUESTION_MESSAGE, null, cod, cod[0]);
			if(opc == 0) {
				masc ++;
			}
			else {
				fem ++;
			}
			opc3 = JOptionPane.showOptionDialog(null, "Gostou do novo produto", "ENTRADA", 0, JOptionPane.QUESTION_MESSAGE, null, cod3, cod3[0]);
			if(opc3 == 0 && opc == 0) {
				sim_masc ++;
			}
			else if(opc3 == 1 && opc == 0) {
				nao_masc ++;
			}
			else if(opc3 == 0 && opc == 1) {
				sim_fem ++;
			}
			else if(opc3 == 1 && opc == 1) {
				nao_fem ++;
			}
			opc2 = JOptionPane.showOptionDialog(null, "Há mais alguma pessoa", "ENTRADA", 0, JOptionPane.QUESTION_MESSAGE, null, cod2, cod2[0]);
			if(opc2 == 1) {
				sim = (sim_masc + sim_fem);
				nao = (nao_masc + nao_fem);
				fem_sim = (100 * sim_fem / fem);
				masc_nao = (100 * nao_masc/masc);
				JOptionPane.showMessageDialog(null, "O numero de pessoas que responderam sim foi de: " + sim + ". O numero de pessoas que responderam Não foi de: " + nao + ". A porcentagem de pessoas do sexo feminino que respoderam sim foi de: " + fem_sim + "%. A porcentagem de pessoas do sexo feminino que respoderam Não foi de: " + masc_nao + "%.","Saida", JOptionPane.INFORMATION_MESSAGE);
			}
		}

	}

}
