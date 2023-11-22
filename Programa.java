package prog2_aula10;

public class Programa {

	public static void main(String[] args) { 					//numero , saldo, limite
		Conta_Prog2 c1 = new Conta_Prog2("Angélica de Carvalho",12345,500,2000);
		Conta_Prog2 c2 = new Conta_Prog2("Cecília de Carvalho",345,500,1000);
			
		
		System.out.println("Conta: " + c1.getNumeroConta());
		System.out.println("Proprietário: " + c1.getNome());
		System.out.println("Limite disponível: R$" + c1.getLimite());
		System.out.println("Saldo atual da conta C1: $" + c1.consultarSaldo());
		c1.sacar(1000); //o que for alterado aqui vai executar a subtração nos metodos
		c1.depositar(40);
		
		
		System.out.println("-------------------------------------");
		System.out.println("Conta: " + c2.getNumeroConta());
		System.out.println("Proprietário: " + c2.getNome());
		System.out.println("Limite disponível: R$" + c2.getLimite());
		System.out.println("Saldo atual da conta C2: $" + c2.consultarSaldo());
		c2.sacar(700);//se o saque for igual a 2000 ou maior, não executa
		c2.depositar(10); //o que for alterado aqui vai executar a soma nos métodos
	
	}
}