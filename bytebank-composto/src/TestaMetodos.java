
public class TestaMetodos {
	
	public static void main(String[] args) {
		
//		Conta contaDaMarcela = new Conta();
//
//		contaDaMarcela.setTitular(new Cliente());
//		
//		contaDaMarcela.getTitular().setNome("Marcela");
//		
//		System.out.println(contaDaMarcela.getTitular().getNome());
		
		Conta conta = new Conta(123, 456);
		System.out.println(Conta.getTotal());
		
		Conta conta2 = new Conta(789, 012);
		System.out.println(Conta.getTotal());
		
	}

}
