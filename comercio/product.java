package comercio;

public class product {
//atributos
	
	public String Nome;
	public int codigo;
	public double valor;
	
//metodos
	
	public String mostrarDados() {
		return ("\n Produto: " +this.Nome + "\n Código: "+this.codigo+ "\n Valor: "+this.valor);
		
	
	}
	
	public double calcularTotal (int q) {
		return (q * this.valor);
	}
	
}
