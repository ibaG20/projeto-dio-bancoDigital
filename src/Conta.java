
public abstract class Conta implements IConta {
	
	private static final  int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	//o metodo set n será necessário pq são dados de
	//ninguém vai mudar;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public void sacar() {
	}

	public void depositar() {
	}

	public void transferir() {
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	


	public Object getNome() {
		return cliente;
	}
	
	protected void imprimirInfosComuns() {
		System.out.println (String.format("Titular: %s", this.cliente.getNome()));
		System.out.println (String.format("Agenda: %d", this.agencia));
		System.out.println (String.format("Numero: %d", this.numero));
		System.out.println (String.format("Saldo: %.2f", this.saldo));
	}

		
}
	
	

