public class Tempo {
	private static String hora;
	private static String minuto;
	private static String segundo;
	
	
	public Tempo (String hr, String min, String seg) {
		this.hora = hr;
		this.minuto = min;
		this.segundo = seg;
	}
	
	
	public Tempo() {
		this.hora = Integer.toString(0);
		this.minuto = Integer.toString(0);
		this.segundo = Integer.toString(0);
	}


	public static String getHora() {
		return hora;
	}


	public static void setHora(String hora) {
		Tempo.hora = hora;
	}


	public static String getMinuto() {
		return minuto;
	}


	public static void setMinuto(String minuto) {
		Tempo.minuto = minuto;
	}


	public static String getSegundo() {
		return segundo;
	}


	public static void setSegundo(String segundo) {
		Tempo.segundo = segundo;
	}
	
	public static void exibirHora(String hora, String minuto, String segundo) {
		System.out.println("A hora informada foi: " + hora + ":" + minuto + ":" + segundo);
	}
	
	
	// c?? d?? 
}
