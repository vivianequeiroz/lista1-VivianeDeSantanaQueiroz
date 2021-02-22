public class Data {
	private static String dia;
	private static String mes;
	private static String ano;
	
	public Data (String d, String m, String a) {
		this.dia = d;
		this.mes = m;
		this.ano = a;
	}
	
	public static void getDia() {
		int dataDia = Integer.parseInt(Data.dia);
		if(dataDia > 0 && dataDia < 32)
			return;
		else {
			System.out.println("Dia preenchido inválido. Preencha no formato DD/MM/AAAA");
		}
	}
	
	public static void setDia(String dia) {
		Data.dia = dia;
	}
	
	public static void getMes() {
		int dataMes = Integer.parseInt(Data.mes);
		if(dataMes > 0 && dataMes < 12)
			return;
		else {
			System.out.println("Mês preenchido inválido. Preencha no formato DD/MM/AAAA");
		}
	}
	
	public static void setMes(String mes) {
		Data.mes = mes;
	}
	
	public static void getAno() {
		int dataAno = Integer.parseInt(Data.ano);
		if(dataAno > 0)
			return;
		else {
			System.out.println("Dia preenchido inválido.");
		}
	}	
	
	
	public static void setAno(String ano) {
		Data.ano = ano;
	}
	
	public static void mostrarData() {
		System.out.println("A data inserida foi: " + Data.dia + "/" + Data.mes + "/" + Data.ano + ".");
	}
	
	public static void quantidadeDiasAno(String mes) {
		int dataMesAtual = Integer.parseInt(mes);
		int anoAtual = Integer.parseInt(Data.ano);
		if(anoAtual % 400 == 0 || ((anoAtual % 4 == 0) && (anoAtual % 100 != 0))) {
			// ano é bissexto

			// d??	
		}
	}
	
}
