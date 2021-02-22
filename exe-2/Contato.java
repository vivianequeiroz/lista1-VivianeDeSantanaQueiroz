public class Contato {
	
	private String nome;
	private int telefone;
	
	public Contato(String _nome, int tel) {
		this.nome = _nome;
		this.telefone = tel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
}
