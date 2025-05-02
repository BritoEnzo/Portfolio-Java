 //Enzo Rafael Oliveira Brito 1�DS
package listaK;

public class K1 {

	public static void main(String[] args) {
		double contador = 1;
		int trocar = 0;
		
		while(contador <= 100 && trocar == 0) {
			System.out.println(contador);
			contador++;
			if(contador == 100) {
				trocar = 1;
			}
		}
		while(contador >= 0 && trocar == 1) {
			System.out.println(contador);
			contador--;
			
		}
		
	}

}
