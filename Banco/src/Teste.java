
public class Teste {
	
	public static void main (String[]args){
		Cliente cli = new Cliente();
		Conta c = new Conta();
		Data data = new Data();
		c.dataDeAbertura = data;
		c.saldo = 300;
		c.agencia = "45678-9";
		cli.nome = "Thiago";
		c.titular = cli;
		c.titular.rg = "132546";
		cli.endereco = "Jardim Botanico";
		data.dia = 04;
		data.mes = 06;
		data.ano = 2015;		
		System.out.println("Saldo atual: " + c.saldo);
		c.depositar(400);
		c.sacar(600);
		double rendimento = c.calculaRendimento();
		System.out.println("O rendimento foi de: " + rendimento);
		System.out.println(c.imprimirDados());
		
		
		
	}

}
