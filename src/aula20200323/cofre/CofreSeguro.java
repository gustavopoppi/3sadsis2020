package aula20200323.cofre;

public class CofreSeguro {

	/*
	 * Elabore uma segunda classe, denominada CofreSeguro, que possua uma SENHA
	 * num�rica definida pelo construtor e que s� seja aberto se a senha correta for
	 * informada.
	 */

	private boolean aberto;
	private int senha;

	public CofreSeguro(int senha) {
		this.senha = senha;
		this.aberto = false;
	}

	public void Abrir(int senha) {
		if (this.senha == senha) {
			aberto = true;
		} else {
			System.out.println("Senha incorreta");
			aberto = false;
		}
	}

	public void Fechar() {
		aberto = false;
	}

	public boolean isAberto() {
		return aberto;
	}

}
