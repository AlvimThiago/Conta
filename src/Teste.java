
public class Teste {

	public static void main(String[] args) {
		
		Conta c = new Conta();
		
		c.numero = 1029;
		c.titular = "Thiago";
		c.saldo = 300;
		
		c.sacar(400);
		c.depositar(700);
		c.sacar(900);
	}
	
}
