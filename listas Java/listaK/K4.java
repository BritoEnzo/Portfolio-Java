//Enzo Rafael Oliveira Brito 1°DS
package listaK;

import javax.swing.JOptionPane;

public class K4 {

	public static void main(String[] args) {
		double idade,menor18=0,maior18=0,centro_masc=0,centro_fem=0,leste_masc=0,leste_fem=0,norte_masc=0,norte_fem=0,oeste_masc=0,oeste_fem=0,sul_masc=0,sul_fem=0,masc=0,fem=0;
		double men_leste_menor_18=0,fem_oeste_maior_18=0,por_sul_maior_18,tot=0;
		double tot_centro=0,tot_leste=0,tot_norte=0,tot_oeste=0,tot_sul=0,por_centro_masc=0,per_mul_18_sul,fem_sul_maior_18=0,tot_masc_menor_norte=0,per_mul_18_oeste,tot_ons_fem,tot_ons,por_centro_fem=0,perc_mul_ons,tot_centro_leste_masc,por_leste_masc=0,por_leste_fem=0,por_norte_masc=0,por_norte_fem=0,por_oeste_masc=0,por_oeste_fem=0,por_sul_masc=0,por_sul_fem=0;
		int opc;
		Object[] cod = {"Centro", "Leste", "Norte", "Oeste", "Sul"};
		int opc2 = 0;
		Object[] cod2 = {"Sim","Não"};
		int opc3;
		Object[] cod3 = {"Homem","Mulher"};
		
		
		while(opc2 == 0) {
			idade = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a sua idade", "Entrada", JOptionPane.QUESTION_MESSAGE));
			if(idade >= 18) {
				maior18++;
			}
			else {
				menor18--;
			}
			opc = JOptionPane.showOptionDialog(null, "Escolha sua Região", "ENTRADA", 0, JOptionPane.QUESTION_MESSAGE, null, cod, cod[0]);
			opc3 = JOptionPane.showOptionDialog(null, "Escolha seu genero", "ENTRADA", 0, JOptionPane.QUESTION_MESSAGE, null, cod3, cod3[0]);
			if(opc3 == 0 && opc == 0) {
				centro_masc++;
				masc++;
			}
			else if(opc3 == 1 && opc == 0) {
				centro_fem++;
				fem++;
			}
			else if(opc3 == 0 && opc == 1) {
				leste_masc ++;
				masc++;
			}
			else if(opc3 == 1 && opc == 1) {
				leste_fem ++;
				fem++;
			}
			else if(opc3 == 0 && opc == 2) {
				norte_masc ++;
				masc++;
			}
			else if(opc3 == 1 && opc == 2) {
				norte_fem ++;
				fem++;
			}
			else if(opc3 == 0 && opc == 3) {
				oeste_masc ++;
				masc++;
			}
			else if(opc3 == 1 && opc == 3) {
				oeste_fem ++;
				fem++;
			}
			else if(opc3 == 0 && opc == 4) {
				sul_masc ++;
				masc++;
			}
			else if(opc3 == 1 && opc == 4) {
				sul_fem ++;
				fem++;
			}
			if(idade < 18 && opc == 2 && opc3 == 0) {
				tot_masc_menor_norte++;
			}
			if(idade >= 18 && opc == 3 && opc3 == 1) {
				fem_oeste_maior_18++;
			}
			if(idade >= 18 && opc == 4 && opc3 == 1) {
				fem_sul_maior_18++;
			}
			opc2 = JOptionPane.showOptionDialog(null, "Há mais alguma pessoa", "ENTRADA", 0, JOptionPane.QUESTION_MESSAGE, null, cod2, cod2[0]);
			if(opc2 == 1) {
				
				tot_centro = (centro_fem+centro_masc);
				tot_leste = (leste_fem+leste_masc);
				tot_norte = (norte_masc+norte_fem);
				tot_oeste = (oeste_masc+oeste_fem);
				tot_sul = (sul_masc+sul_fem);
				por_centro_masc = (centro_masc/tot_centro)*100;
				por_centro_fem = (centro_fem/tot_centro)*100;
				por_leste_masc = (leste_masc/tot_leste)*100;
				por_leste_fem = (leste_fem/tot_leste)*100;
				por_norte_masc = (norte_masc/tot_norte)*100;
				por_norte_fem = (norte_fem/tot_norte)*100;
				por_oeste_masc = (oeste_masc/tot_oeste)*100;
				por_oeste_fem = (oeste_fem/tot_oeste)*100;
				por_sul_masc = (sul_masc/tot_sul)*100;
				por_sul_fem = (sul_fem/tot_sul)*100;
				tot = (tot_norte+tot_centro+tot_sul+tot_oeste+tot_leste);
				tot_centro_leste_masc = (leste_masc + centro_masc);
				tot_ons_fem = (oeste_fem + norte_fem + sul_fem);
				tot_ons = (oeste_fem + norte_fem + sul_fem + oeste_masc + norte_masc + sul_masc );
				perc_mul_ons = (tot_ons / tot_ons_fem)*100;
				per_mul_18_oeste = (fem_oeste_maior_18 / tot_oeste)*100;
				per_mul_18_sul = (fem_sul_maior_18 / tot_sul)*100;
	
				
				JOptionPane.showMessageDialog(null,"O total de homens que residem no zona leste e Central foi de: " + tot_centro_leste_masc + ". O percentual de mulheres que residem nas Zonas Oeste, Norte e Sul foi de: " + perc_mul_ons + 
						". O  total  de  homens  menores  de  idade  (menores  de  18)  que  residem  na  Zona  Norte  da cidade foi de: " + tot_masc_menor_norte +"\n"+
					"O percentual de mulheres maiores de idade (maiores de 18) que residem na Zona Oeste da cidade foi de: " + per_mul_18_oeste +	". O percentual de mulheres que residem na Zona Central da cidade foi de: "+ per_mul_18_sul +  "% ." , "saída", JOptionPane.INFORMATION_MESSAGE); 
					
			}
		}

	}
}


