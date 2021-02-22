import java.time.LocalDate;

public class Pessoa {

		private String nome;
		private static String dataDeNascimento;
		private double altura; 
		
		public Pessoa(String _nome, String nasc, double alt) {
			this.nome = _nome;
			this.dataDeNascimento = nasc;
			this.altura = alt;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDataDeNascimento() {
			return dataDeNascimento;
		}

		public void setDataDeNascimento(String dataDeNascimento) {
			this.dataDeNascimento = dataDeNascimento;
		}

		public double getAltura() {
			return altura;
		}

		public void setAltura(double altura) {
			this.altura = altura;
		}
		
		public static int calculaIdade() {
			String dataNasc = Pessoa.dataDeNascimento.substring(dataDeNascimento.length()-4);
			int dataNascNumero = Integer.parseInt(dataNasc);
			int idadePessoa =  2021 - dataNascNumero;
			return idadePessoa;
		}

}
