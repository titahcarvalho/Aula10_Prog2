package prog2_aula10;

public class Conta_Prog2 {
	String nome;
	private int numeroConta;
	private double saldo;
	private double limite;
	
	
	//costrutor
	public Conta_Prog2 (String nome, int numeroConta, double saldo, double limite) {
		this.nome = nome;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.limite = limite;
	}
	//métodos
	public boolean sacar(double valor) {
		if (valor > this.saldo + this.limite) {
			return false;
		}
		else if (valor > this.saldo) {
			double x = valor - this.saldo;
			this.limite = this.limite - x;			
			this.saldo = 0;
			return true;
			}
		return false; ///atenção aqui, caso nenhuma das condições acima for atendida
		}
		//metodo depositar
		public void depositar(double valor) {
			this.saldo += valor;
			
			System.out.println("Deposito de: $" + valor );
		}
		//método consultar saldo
		public double consultarSaldo() {
			return this.saldo;
		}
		//setters e getters
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getNumeroConta() {
			return numeroConta;
		}
		public void setNumeroConta(int numeroConta) {
			this.numeroConta = numeroConta;
		}
		public double getLimite() {
			return limite;
		}
		public void setLimite(double limite) {
			this.limite = limite;
			}
			
}

