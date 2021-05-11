
public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(Autenticavel a) {
		
		boolean autenticou = a.autentica(senha);

		if(autenticou)
			System.out.println("Pode entrar no sistema");
		else
			System.out.println("Não ´pde emtrar no sistema");
	}

}
