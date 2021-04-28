
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario bruno = new Gerente();
		bruno.setNome("Bruno Costa");
		bruno.setCpf("123456789-00");
		bruno.setSalario(3000.00);
		
		System.out.println(bruno.getNome());
		System.out.println(bruno.getBonificacao());
		
	}

}
