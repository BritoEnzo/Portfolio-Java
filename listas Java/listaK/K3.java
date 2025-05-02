//Enzo Rafael Oliveira Brito 1°DS
package listaK;

import javax.swing.JOptionPane;

public class K3 {

	public static void main(String[] args) {
		double ome_engen=0,ome_admin=0,ome_med=0,ome_psico=0,masc=0,fem=0,mul_engen=0,mul_admin=0,mul_med=0,mul_psico=0,tot_med,tot_med_mul,mul_psico_porc,tot_ome,tot_admin_mul,tot_admin,tot_mul,ome_engen_porc,tot_engen,tot_engen_ome,tot;
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
			else if(opc3 == 0 && opc == 1){
				mul_engen ++;
			}
			if(opc3 == 1 && opc == 0) {
				ome_admin ++;
			}
			else if(opc3 == 1 && opc == 1){
				mul_admin ++;
			}
			if(opc3 == 2 && opc == 0) {
				ome_med ++;
			}
			else if(opc3 == 2 && opc == 1){
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
				tot_engen = (ome_engen + mul_engen);
				tot_engen_ome = (tot_engen * 100 / ome_engen);
				tot_med = ((ome_med + mul_med));
				tot_med_mul = (tot_med*100/mul_med);
				ome_engen_porc = (ome_engen * 100 / tot_ome);
				mul_psico_porc = (mul_psico * 100 / tot_mul);
				
				JOptionPane.showMessageDialog(null, "O percentual de homens que prentendem cursar engenharia da computação é de: " + ome_engen_porc +
						". O percentual de mulheres que pretendem cursar psicologia é de : " + mul_psico_porc + "%. O total de pessoas que pretendem cursar medicina é de: "
								+ "" + tot_med + ". O total de mulheres que pretendem cursar administração é de: " + mul_admin + 
								".","Saida", JOptionPane.INFORMATION_MESSAGE);
			}
		}

	}

}
