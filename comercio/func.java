package comercio;

public class func {
//atributos
	
	public String Nome;
	public int codigoFunc;
	public String Cargo;
	public double salarioBruto;
	
	
	
	
//metodos
	
	public String mostrarDados() {
		return ("\n Nome do Funcionário : " +this.Nome+ "\n Código do Funcionário: "+this.codigoFunc+ "\n Cargo : "+this.Cargo+ "\n Salário Bruto: "+ this.salarioBruto);
		
	}
	
	public double calcularSalarioLiquido (double desconto) {
		return (this.salarioBruto - desconto);
	}	
	
}
