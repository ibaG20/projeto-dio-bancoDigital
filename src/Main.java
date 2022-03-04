
public class Main {

	public static void main(String[] args) {
		Cliente gabriella = new Cliente();
		gabriella.setNome("Gabriella");
		
		Conta cc = new ContaCorrente(gabriella);
		Conta poupanca = new ContaCorrente(gabriella);
		
		cc.depositar(100);
		cc.transferir (100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		

	}

}
