
public class TestaCondicional2 {
	
	public static void main(String[] args) {
		
		System.out.println("Testando condicionais");
		
		int idade = 16;
		int quantidadePessoa = 3;
		
		boolean acompanhado = quantidadePessoa >= 2;
		
		if(idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente voc� n�o pode entrar");
		}
		
	}

}
