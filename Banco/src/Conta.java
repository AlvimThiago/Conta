
public class Conta {

	int numero;
	double saldo;
	Cliente titular;
	String agencia;
	Data dataDeAbertura;
	void sacar(double valor){
		if(saldo >= valor){
		 saldo = saldo - valor;
		 System.out.println("Saldo atual: " + saldo);
		}
			else{
				System.out.println("Saldo insuficiente.");				
			
			}
	}
	
	void depositar(double valor){
		
		saldo = saldo + valor;
		System.out.println("Saldo atual: " + saldo);
	}
	
	double calculaRendimento(){
		
		return saldo * 0.1;
	}

	String imprimirDados(){
		return ("numero: " + numero + "\nsaldo: " + saldo + "\ntitular: " + titular.nome + "\nagencia: " + agencia + "\ndata de abertura: " + dataDeAbertura.imprime());
	}

}

