public class AlunosDisciplina {
	private int matricula;
	private static String nome;
	private static double notaProva1;
	private static double notaProva2;
	private static double notaTrabalho; 
	
	public AlunosDisciplina (int cod_matricula, String _nome, double p1, double p2, double trab) {
		this.matricula = cod_matricula;
		this.nome = _nome;
		this.notaProva1 = p1;
		this.notaProva2 = p2;
		this.notaTrabalho = trab;
	}

	
	public static double calculoMedia() { 
		double peso = 1.2;
		double mediaFinal =((AlunosDisciplina.notaProva1 * peso) + (AlunosDisciplina.notaProva2 * peso) + (AlunosDisciplina.notaTrabalho * peso))/ 3;
		
		System.out.println("A média do(a) aluno(a)" + AlunosDisciplina.nome + " é igual a: " + Math.round(mediaFinal) +  " pontos.");
		 
		return mediaFinal;
	}
	
	public static void situacaoAluno() {
		
		if(calculoMedia() >= 6) {
			System.out.println("A situação do aluno no sistema consta como: APROVADO");
		} else if (calculoMedia() < 6 && calculoMedia() > 4) {
			System.out.println("A situação do aluno no sistema consta como: IFA");
		} else {
			System.out.println("A situação do aluno no sistema consta como: REPROVADO");
		}
		
	}


}
	
