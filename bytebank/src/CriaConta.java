public class CriaConta {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("O saldo da primeira conta � " + primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("O saldo atualizado da primeira conta � " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		segundaConta.saldo = 50;
		System.out.println("O saldo atualizado da primeira conta � " + primeiraConta.saldo);
		System.out.println("O saldo atualizado da segunda conta � " + segundaConta.saldo);
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
