
public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticaocaUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticaocaUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	public double getBonificacao() {
		return super.getSalario();
	}
}
