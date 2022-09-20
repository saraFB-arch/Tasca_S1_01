package n3exercici1;

public class Tenis extends Noticia{
	private String competicio;
	private String tenista;
	
	public Tenis (String titular, int puntuacio, int preu, String competicio, String tenista) {
		super(titular, puntuacio, preu);
		this.competicio = competicio;
		this.tenista = tenista;
	}
	public Tenis (String titular, String competicio, String tenista) {
		super(titular);
		this.competicio = competicio;
		this.tenista = tenista;
	}
	public Tenis (String titular) {
		super(titular);
	}
	
	public String getCompeticio() {
		return competicio;
	}
	public String getTenista() {
		return tenista;
	}
	
	public void setCompeticio(String competicio) {
		this.competicio = competicio;
	}
	public void setTenista (String tenista) {
		this.tenista = tenista;
	}
	
	
	public int calcularPreuNoticia () {
		int preuInicial = 150;
		int sumaPreu = 0;
		
		if (this.tenista.equalsIgnoreCase("Nadal") || this.tenista.equalsIgnoreCase("Federer") || this.tenista.equalsIgnoreCase("Djokovic")){
			sumaPreu = preuInicial + 100;
		} else {
			sumaPreu = preuInicial;
		}
		
		
		return sumaPreu;
	}	
	
	public int calcularPuntuacio () {
		int puntsInicials = 4;
		int sumaPunts = 0;
		
		if (this.tenista.equalsIgnoreCase("Nadal") || this.tenista.equalsIgnoreCase("Federer") || this.tenista.equalsIgnoreCase("Djokovic")){
			sumaPunts = puntsInicials + 3;
		} else {
			sumaPunts = puntsInicials + 0;
		}	
		
		return sumaPunts;
	}
}
