
public class Conta {

	int numero;
	double saldo;
	String titular = "Thiago";
	
	
	void sacar(double valor) {
		if(saldo >= valor) {
			saldo = saldo - valor;
			System.out.println("seu saldo atual �: " + saldo);
		}
			else {
				System.out.println("Saldo Insuficiente!");
			}
	}
	
	
	void depositar(double valor) {
		saldo = saldo + valor;
		System.out.println("seu saldo atual �: " + saldo);		
	}
}
