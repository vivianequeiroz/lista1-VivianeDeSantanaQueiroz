public class MainArvoreGenealogica {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Viviane", "15/02/2000", "Rita", "Vicente"); 
		
		pessoa.calculaIdade();
		pessoa.exibirPais();
	}

}
