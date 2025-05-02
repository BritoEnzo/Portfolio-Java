package listaA;

import java.awt.print.Printable;
import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float v_media,t_viagem,distancia,litros;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a velocidade média do veículo durante a vaigem");
		v_media = sc.nextFloat();
	
		System.out.println("Digite o tempo da viagem");
		t_viagem = sc.nextFloat();
		
		distancia = (t_viagem * v_media);
		
		litros = (distancia/2);
		
		System.out.println("o veiculo gasta durante a viagem em litros"+litros);
		
		
		
		
		
		
	}

}
