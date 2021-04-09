
public class TestaMetodos {
	
	public static void main(String[] args) {
		
		Conta contaDaMarcela = new Conta();

		contaDaMarcela.setTitular(new Cliente());
		
		contaDaMarcela.getTitular().setNome("Marcela");
		
		System.out.println(contaDaMarcela.getTitular().getNome());
		
	}

}
