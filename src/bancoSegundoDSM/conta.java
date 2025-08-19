package bancoSegundoDSM;

public class conta {
	//atributos
	public double total;
	public double deposito;
	public double saque;
	  
	//metodos
	  public String mostrarSaldo () {
		  return ("\n O saldo total da sua conta atualmente é de: "+ this.total);
	  }
	
	  public double sacar(double saque){
	        return this.total - saque;
	    }
	  public double deposito(double deposito){
	        return this.total + deposito;
	    }
	  conta (int t,  double s, double d){
	    	this.total = t;
	    	this.saque = s;
	    	this.deposito = d;
	    }

}
