package n3exercici1;

public class Futbol extends Noticia {
	private String competicio;
	private String club;
	private String jugador;
	
	public Futbol (String titular, int puntuacio, int preu, String competicio, String club, String jugador) {
		super(titular, puntuacio, preu);
		this.competicio = competicio;
		this.club = club;
		this.jugador = jugador;
	}
	
	public Futbol (String titular, String competicio, String club, String jugador) {
		super(titular);
		this.competicio = competicio;
		this.club = club;
		this.jugador = jugador;
	}
	
	public Futbol (String titular) {
		super(titular);
	}
	
	public String getCompeticio() {
		return competicio;
	}
	public String getClub() {
		return club;
	}
	public String getJugador() {
		return jugador;
	}	
	
	public void setCompeticio (String competicio) {
		this.competicio = competicio;
	}
	public void setClub (String club) {
		this.club = club;
	}
	public void setJugador (String jugador){
		this.jugador = jugador;
	}
	
	
	
	
	public int calcularPreuNoticia () {
		int preuInicial = 300;
		int sumaPreu = 0;
		
		if (this.competicio.equalsIgnoreCase("Lliga de Campions")){
			sumaPreu = preuInicial + 100;
		} else {
			sumaPreu = preuInicial;
		} 
		
		if (this.club.equalsIgnoreCase("Barça")|| this.club.equalsIgnoreCase("Madrid")) {
			sumaPreu = sumaPreu + 100;
		} else {
			sumaPreu = sumaPreu + 0;
		}	
		
		if (this.jugador.equalsIgnoreCase("Fernando Torres") || this.jugador.equalsIgnoreCase("Benzema")){
			sumaPreu = sumaPreu + 50;
		} else {
			sumaPreu = sumaPreu + 0;
		} 
		
		return sumaPreu;
	}
	
	public int calcularPuntuacio () {
		int puntsInicials = 5;
		int sumaPunts = 0;
		
		if (this.competicio.equalsIgnoreCase("Lliga de Campions")){
			sumaPunts = puntsInicials + 3;
		} else if (this.competicio.equalsIgnoreCase("Lliga")){
			sumaPunts = puntsInicials + 2;
		} else {
			sumaPunts = puntsInicials + 0;
		}
		
		if (this.club.equalsIgnoreCase("Barça")|| this.club.equalsIgnoreCase("Madrid")) {
			sumaPunts = sumaPunts + 1;
		} else {
			sumaPunts = sumaPunts + 0;
		}	
		
		if (this.jugador.equalsIgnoreCase("Fernando Torres") || this.jugador.equalsIgnoreCase("Benzema")){
			sumaPunts = sumaPunts + 1;
		} else {
			sumaPunts = sumaPunts + 0;
		} 
				
		return sumaPunts;
	}
	
	
}
