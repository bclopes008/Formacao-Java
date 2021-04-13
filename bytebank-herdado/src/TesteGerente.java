
public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente gerenteBruno = new Gerente();
		gerenteBruno.setNome("Bruno Costa");
		gerenteBruno.setCpf("123456789-00");
		gerenteBruno.setSalario(3000.00);
		
		System.out.println(gerenteBruno.getNome());
		System.out.println(gerenteBruno.getCpf());
		System.out.println(gerenteBruno.getSalario());
		
		gerenteBruno.setSenha(1234);
		boolean autenticou = gerenteBruno.autentica(1234);
		
		System.out.println(autenticou);
		
		System.out.println(gerenteBruno.getBonificacao());
		
		Gerente g1 = new Gerente();
        g1.setNome("Marco");
        g1.setCpf("235568413");
        g1.setSalario(5000.0);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        g1.setSenha(2222);
        boolean autenticou2 = g1.autentica(2222);

        System.out.println(autenticou2);

        System.out.println(g1.getBonificacao());

	}

}
