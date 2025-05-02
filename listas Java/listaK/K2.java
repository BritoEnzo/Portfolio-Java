//Enzo Rafael Oliveira Brito 1°DS
package listaK;

import javax.swing.JOptionPane;

public class K2 {

	public static void main(String[] args) {
		int nao_fem=0,nao_masc=0;
		double fem_nao,masc_sim=0,tot,sim_fem=0,fem=0,masc=0,sim_masc=0,sim,nao;
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
				tot = (sim+nao);
				fem_nao = (100 * nao_fem / fem);
				masc_sim = (100 * sim_masc/masc);
				JOptionPane.showMessageDialog(null, "O numero de pessoas que responderam sim foi de: " + sim + ". O total de pessoas que responderam foi de: " + tot + ". A porcentagem de pessoas do sexo feminino que respoderam não foi de: " + fem_nao + "%. A porcentagem de pessoas do sexo masculino que respoderam sim foi de: " + masc_sim + "%.","Saida", JOptionPane.INFORMATION_MESSAGE);
			}
		}

	}

}
