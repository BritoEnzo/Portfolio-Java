package comercio;

public class Funcionario {
	public int codigoFunc;
    public String nome;
    public String cargo;
    public double salarioBruto;
    public String mostrarDadosfunc(){
        return("\n Nome: "+ this.nome+"\n Cargo: "+ this.cargo +"\n Salario R$ "+this.salarioBruto);
    }
    public double calculaSalarioLiquido(double INSS){
        return (this.salarioBruto-(this.salarioBruto*INSS/100));
    }
    Funcionario (int c,  String nome, String cargo, double salarioBruto){
    	this.codigoFunc=c;
    	this.cargo=cargo;
    	this.nome=nome;
    	this.salarioBruto=salarioBruto;
    }

}
