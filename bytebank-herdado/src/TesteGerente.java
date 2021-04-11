
public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente gerenteBruno = new Gerente();
		gerenteBruno.setNome("Bruno Costa");
		gerenteBruno.setCpf("123456789-00");
		gerenteBruno.setSalario(5000.00);
		
		System.out.println(gerenteBruno.getNome());
		System.out.println(gerenteBruno.getCpf());
		System.out.println(gerenteBruno.getSalario());
		
		gerenteBruno.setSenha(1234);
		boolean autenticou = gerenteBruno.autentica(1234);
		
		System.out.println(autenticou);

	}

}
