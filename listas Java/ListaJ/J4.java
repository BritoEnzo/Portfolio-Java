//Enzo Rafael Oliveira Brito 1°DS
package ListadeExerciciosJ;

import javax.swing.JOptionPane;

public class J4 {

	public static void main(String[] args) {
		double ome_engen=0,ome_admin=0,ome_med=0,ome_psico=0,masc=0,fem=0,mul_engen=0,mul_admin=0,mul_med=0,mul_psico=0,tot_med,tot_med_mul,tot_ome,tot_admin,tot_mul,tot;
		int opc;
		Object[] cod = {"Homem", "Mulher"};
		int opc2 = 0;
		Object[] cod2 = {"Sim","Não"};
		int opc3;
		Object[] cod3 = {"1","2","3","4"};
		
		
		while(opc2 == 0) {
			opc = JOptionPane.showOptionDialog(null, "Escolha seu Genero", "ENTRADA", 0, JOptionPane.QUESTION_MESSAGE, null, cod, cod[0]);
			if(opc == 0) {
				masc ++;
			}
			else {
				fem ++;
			}
			opc3 = JOptionPane.showOptionDialog(null, "Qual o Código do seu curso?", "ENTRADA", 0, JOptionPane.QUESTION_MESSAGE, null, cod3, cod3[0]);
			if(opc3 == 0 && opc == 0) {
				ome_engen ++;
			}
			else if(opc3 == 3 && opc == 1){
				mul_engen ++;
			}
			if(opc3 == 1 && opc == 0) {
				ome_admin ++;
			}
			else if(opc3 == 3 && opc == 1){
				mul_admin ++;
			}
			if(opc3 == 2 && opc == 0) {
				ome_med ++;
			}
			else if(opc3 == 3 && opc == 1){
				mul_med ++;
			}
			if(opc3 == 3 && opc == 0) {
				ome_psico ++;
			}
			else if(opc3 == 3 && opc == 1){
				mul_psico ++;
			}
			opc2 = JOptionPane.showOptionDialog(null, "Há mais alguma pessoa", "ENTRADA", 0, JOptionPane.QUESTION_MESSAGE, null, cod2, cod2[0]);
			if(opc2 == 1) {
			
				tot_ome = (ome_engen + ome_admin + ome_med + ome_psico);
				tot_mul = (mul_engen + mul_admin + mul_med + mul_psico);
				tot = (tot_ome + tot_mul);
				tot_med = ((ome_med + mul_med)*100/tot);
				tot_admin = (ome_admin * 100 / tot_ome);
				tot_med_mul = (tot_med*100/mul_med);
				
				JOptionPane.showMessageDialog(null, "O total de homens que prentendem cursar engenharia é de: " + ome_engen + ". O total de mulheres que pretendem cursar psicologia é de : " + mul_psico + ". O percentual de pessoas que pretendem cursar medicina é de: " + tot_med + "%. O percentual de homens que pretendem cursar administração é de: " + tot_admin + "%. O percentual de mulheres que pretendem cursar medicina é de:"+ tot_med_mul + "% .","Saida", JOptionPane.INFORMATION_MESSAGE);
			}
		}

	}

}
