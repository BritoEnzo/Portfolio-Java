package listaK;


import javax.swing.JOptionPane;

public class K10 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int numero = 0 ;
	    
	    	String input = JOptionPane.showInputDialog("Digite um número inteiro para calcular o fatorial:");     
	    	int numero1 = Integer.parseInt(input);
	    	if (numero1 < 0) {
            JOptionPane.showMessageDialog(null, "O número não deve ser negativo.");
        } else {
            int fatorial = 1;
            int i = 1;
            do {
                fatorial *= i;
                i++;
            } while (i <= numero1); {
                	 JOptionPane.showMessageDialog(null, "O fatorial de " + numero1 + " é " + fatorial);
                	 
				}
                
	}

	{
		
	}
 }
        
	} 
