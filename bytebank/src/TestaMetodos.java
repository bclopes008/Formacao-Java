
public class TestaMetodos {

	public static void main(String[] args) {
		Conta contaBruno = new Conta();
		contaBruno.deposita(2000);
		System.out.println("Saldo conta Bruno = " + contaBruno.saldo);
		contaBruno.saca(50);
		System.out.println("Saldo conta Bruno = " + contaBruno.saldo);
		Conta contaRenan = new Conta();
		contaRenan.deposita(600);
		System.out.println("Saldo conta Renan = " + contaBruno.saldo);
		contaBruno.transfere(400, contaRenan);
		System.out.println("Saldo conta Bruno Transferencia = " + contaBruno.saldo);
		System.out.println("Saldo conta Renan Transferencia = " + contaRenan.saldo);
	}
	
}
