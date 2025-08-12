package comercio;

public class testeProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		product p = new product();
		p.Nome="cafe";
		p.codigo=123;
		p.valor=12.50;
		 	
		
		System.out.println("Os dados são :"+p.mostrarDados());

		System.out.println("O total foi de :"+p.calcularTotal(10));
	}

}
