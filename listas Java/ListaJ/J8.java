//Enzo Rafael Oliveira Brito 1°DS
package ListadeExerciciosJ;

import javax.swing.JOptionPane;

public class J8 {

	public static void main(String[] args) {
		double voto1=0,voto2=0,voto3=0,tot_voto,por_voto1,por_voto2,por_voto3;
		int opc;
		Object[] cod = {"Ciência  da  Computação", "Direito", "Letras"};
		int opc2 = 0;
		Object[] cod2 = {"Sim","Não"};
		
		
		while(opc2 == 0) {
			opc = JOptionPane.showOptionDialog(null, "Vote em um dos candidatos", "ENTRADA", 0, JOptionPane.QUESTION_MESSAGE, null, cod, cod[0]);
			
			if(opc == 0) {
				voto1++;
			}
			else if(opc == 1){
				voto2++;
			}
			else if(opc == 2){
				voto3++;
			}
		
			opc2 = JOptionPane.showOptionDialog(null, "Há mais alguma pessoa", "ENTRADA", 0, JOptionPane.QUESTION_MESSAGE, null, cod2, cod2[0]);
			if(opc2 == 1) {
				tot_voto = (voto1+voto2+voto3);
				por_voto1 = (voto1/tot_voto)*100;
				por_voto2 = (voto2/tot_voto)*100;
				por_voto3 = (voto3/tot_voto)*100;
				
				//voto1
				if(voto1 > voto2 & voto1 > voto3) {
					if(voto2 > voto3){
						JOptionPane.showMessageDialog(null, "O curso de ciência da computação está em 1° lugar. O curso de Direito está em 2°. O curso de letras está em 3°.", "Saída", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "O curso de ciência da computação teve:"+por_voto1+"% de votos. O curso de direito teve: "+por_voto2+"%. O curso de letras teve: "+por_voto3+"%.", "Saída", JOptionPane.INFORMATION_MESSAGE);
					}
					else if(voto3 > voto2){
						JOptionPane.showMessageDialog(null, "O curso de ciência da computação está em 1° lugar. O curso de letras está em 2°. O curso de direito está em 3°.", "Saída", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "O curso de ciência da computação teve:"+por_voto1+"% de votos. O curso de letras teve: "+por_voto3+"%. O curso de direito teve: "+por_voto2+"%.", "Saída", JOptionPane.INFORMATION_MESSAGE);
					}
					else if(voto2 == voto3){
						JOptionPane.showMessageDialog(null, "O curso de ciência da computação está em 1° lugar. O curso de Direito empatou com letras em 2°.", "Saída", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "O curso de ciência da computação teve:"+por_voto1+"% de votos. O curso de Direito teve: "+por_voto2+"%. O curso de letras teve: "+por_voto3+"%.", "Saída", JOptionPane.INFORMATION_MESSAGE);
					}
					
				}
				//voto2 
				if(voto2 > voto1 & voto2 > voto3) {
					if(voto1 > voto3){
						JOptionPane.showMessageDialog(null, "O curso de direito está em 1° lugar. O curso de ciência da computação está em 2°. O curso de letras está em 3�.", "Saída", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "O curso de direito teve:"+por_voto2+"% de votos. O curso de ciência da computação teve: "+por_voto1+"%. O curso de letras teve: "+por_voto3+"%.", "Saída", JOptionPane.INFORMATION_MESSAGE);
					}
					else if(voto3 > voto1){
						JOptionPane.showMessageDialog(null, "O curso de direito está em 1° lugar. O curso de letras está em 2°. O curso de ciência da computação está em 3�.", "Saída", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "O curso de direito teve:"+por_voto2+"% de votos. O curso de letras teve: "+por_voto3+"%. O curso de ciência da computação teve: "+por_voto1+"%.", "Saída", JOptionPane.INFORMATION_MESSAGE);
					}
					else if(voto1 == voto3){
						JOptionPane.showMessageDialog(null, "O curso de direito está em 1° lugar. O curso de ciência da computação empatou com letras em 2°.", "Saída", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "O curso de direito teve:"+por_voto2+"% de votos. O curso de ciência da computação teve: "+por_voto1+"%. O curso de letras teve: "+por_voto3+"%.", "Saída", JOptionPane.INFORMATION_MESSAGE);
					}
					
				}
				//voto3		
				if(voto3 > voto1 & voto3 > voto2) {
					if(voto1 > voto2){
						JOptionPane.showMessageDialog(null, "O curso de letras está em 1° lugar. O curso de ciência da computação está em 2°. O curso de direito está em 3�.", "Saída", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "O curso de letras teve:"+por_voto3+"% de votos. O curso de ciência da computação teve: "+por_voto1+"%. O curso de direito teve: "+por_voto2+"%.", "Saída", JOptionPane.INFORMATION_MESSAGE);
					}
					else if(voto2 > voto1){
						JOptionPane.showMessageDialog(null, "O curso de letas está em 1° lugar. O curso de direito está em 2°. O curso de ciência da computação está em 3�.", "Saída", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "O curso de letras teve:"+por_voto3+"% de votos. O curso de direito teve: "+por_voto2+"%. O curso de ciencia da computação teve: "+por_voto1+"%.", "Saída", JOptionPane.INFORMATION_MESSAGE);
					}
					else if(voto1 == voto2){
						JOptionPane.showMessageDialog(null, "O curso de letras está em 1° lugar. O curso de ciência da computação empatou com direito em 2°.", "Saída", JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(null, "O curso de letras teve:"+por_voto3+"% de votos. O curso de ciência da computação teve: "+por_voto1+"%. O curso de direito teve: "+por_voto2+"%.", "Saída", JOptionPane.INFORMATION_MESSAGE);
					}
					
				}
				//empate 1 2
				if(voto1 == voto2 & voto1 > voto3) {
					JOptionPane.showMessageDialog(null, "O curso de ciência da computação empatou com direito em 1° lugar. O curso de letras está em 2°.", "Saída", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "O curso de ciência da computação teve:"+por_voto1+"% de votos. O curso de direito teve: "+por_voto2+"%. O curso de letras teve: "+por_voto3+"%.", "Saída", JOptionPane.INFORMATION_MESSAGE);
				}
				//empate 2 3
				if(voto2 == voto3 & voto2 > voto1) {
					JOptionPane.showMessageDialog(null, "O curso de direito empatou com letras em 1° lugar. O curso de ciência da computação está em 2°.", "Saída", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "O curso de direito teve:"+por_voto2+"% de votos. O curso de letras teve: "+por_voto3+"%. O curso de ciência da computação teve: "+por_voto1+"%.", "Saída", JOptionPane.INFORMATION_MESSAGE);
				}
				//empate 3 1
				if(voto1 == voto3 & voto1 > voto2) {
					JOptionPane.showMessageDialog(null, "O curso de ciência da computação empatou com letras em 1° lugar. O curso de direito está em 2°.", "Saída", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "O curso de ciência da computação teve:"+por_voto1+"% de votos. O curso de letras teve: "+por_voto3+"%. O curso de direito teve: "+por_voto2+"%.", "Saída", JOptionPane.INFORMATION_MESSAGE);
				}
				//empate geral
				if(voto1 == voto2 & voto1 == voto3) {
					JOptionPane.showMessageDialog(null, "Todos os cursos empataram.", "Saída", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "O curso de ciência da computação teve:"+por_voto1+"% de votos. O curso de direito teve: "+por_voto2+"%. O curso de letras teve: "+por_voto3+"%.", "Saída", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}

	}

}
