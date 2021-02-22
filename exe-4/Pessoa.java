import java.time.LocalDate;

public class Pessoa {

		private static String nome;
		private static String dataDeNascimento;
		private static String mae;
		private static String pai;
		
		public Pessoa(String _nome, String nasc, String _mae, String _pai) {
			this.nome = _nome;
			this.dataDeNascimento = nasc;
			this.mae = _mae;
			this.pai = _pai;
			
		}
	
		public static int calculaIdade() {
			String dataNasc = Pessoa.dataDeNascimento.substring(dataDeNascimento.length()-4);
			int dataNascNumero = Integer.parseInt(dataNasc);
			int idadePessoa =  2021 - dataNascNumero;
			System.out.println("A idade de " + Pessoa.nome + " é igual a " + idadePessoa + " anos.");
			return idadePessoa;
		}
		
		public static void exibirPais() {
			System.out.println("Os pais de " + Pessoa.nome + " chamam-se " + Pessoa.mae + " e " + Pessoa.pai + ".");
		}

}
