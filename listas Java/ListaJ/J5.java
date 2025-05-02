//Enzo Rafael Oliveira Brito 1°DS
package ListadeExerciciosJ;

import javax.swing.JOptionPane;

public class J5 {

	public static void main(String[] args) {
		double idade,menor18=0,maior18=0,centro_masc=0,centro_fem=0,leste_masc=0,leste_fem=0,norte_masc=0,norte_fem=0,oeste_masc=0,oeste_fem=0,sul_masc=0,sul_fem=0,masc=0,fem=0;
		double men_leste_menor_18=0,fem_sul_maior_18=0,por_sul_maior_18,tot=0;
		double tot_centro=0,tot_leste=0,tot_norte=0,tot_oeste=0,tot_sul=0,por_centro_masc=0,por_centro_fem=0,por_leste_masc=0,por_leste_fem=0,por_norte_masc=0,por_norte_fem=0,por_oeste_masc=0,por_oeste_fem=0,por_sul_masc=0,por_sul_fem=0;
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
			if(idade < 18 && opc == 1 && opc3 == 0) {
				men_leste_menor_18++;
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
				por_sul_maior_18 = (fem_sul_maior_18/sul_fem)*100;
				tot = (tot_norte+tot_centro+tot_sul+tot_oeste+tot_leste);
	
				
				JOptionPane.showMessageDialog(null,"O numero de homens que residem no centro foi de: " + centro_masc + ". O numero de homens que residem no leste foi de: " + leste_masc + ". O numero de homens que residem no norte foi de: " + norte_masc +"\n"+
					"O numero de homens que residem no oeste foi de: " + oeste_masc +	". O numero de homens que residem no sul foi de: "+ sul_masc +  ". O numero de mulheres que residem no centro foi de: " + centro_fem + "\n"+ 
					"O numero de mulheres que residem no leste foi de: " + leste_fem +". O numero de mulheres que residem no norte foi de: " + norte_fem + ". O numero de mulheres que residem no oeste foi de: " + oeste_fem + "\n"+
					"O numero de mulheres que residem no sul foi de: "+ sul_fem,"Saida",JOptionPane.INFORMATION_MESSAGE );

				JOptionPane.showMessageDialog(null,"A porcentagem de homens no centro é de: "+por_centro_masc+"%. A porcentagem de mulheres no centro é de: "+por_centro_fem+"%. A porcentagem de homens no leste é de:" + por_leste_masc + 
						"%. A porcentagem de mulheres no leste é de: " + por_leste_fem + "\n"+"A porcentagem de homens no norte é de:" + por_norte_masc + "%. A porcentagem de mulheres no norte é de: " + por_norte_fem + 
						"A porcentagem de homens no oeste é de:" + por_oeste_masc + "A porcentagem de mulheres no oeste é de :" + por_oeste_fem + "\n"+"A porcentagem de homens no sul é de :" + por_sul_masc + 
						"A porcentagem de mulheres no sul é de:" + por_sul_fem,"Saída", JOptionPane.INFORMATION_MESSAGE);
				
				JOptionPane.showMessageDialog(null,"O total de homens menores de idade que residem na zona leste são de :" + men_leste_menor_18,"Saéda",JOptionPane.INFORMATION_MESSAGE);

				JOptionPane.showMessageDialog(null,"O percentual de mulheres que são maiores de idade e que residem na zona sul é de :" + por_sul_maior_18,"Saída",JOptionPane.INFORMATION_MESSAGE);
				
				JOptionPane.showMessageDialog(null,"O total de pessoas que residem em são paulo é de :" + tot,"Saída",JOptionPane.INFORMATION_MESSAGE);
				
			}
		}

	}

}
