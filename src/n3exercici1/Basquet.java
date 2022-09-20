package n3exercici1;

import java.util.Scanner;

public class Basquet extends Noticia {
	private String competicio;
	private String club;
	
	Scanner sc = new Scanner(System.in);
	
	public Basquet (String titular, int puntuacio, int preu, String competicio, String club) {
		super(titular, puntuacio, preu);
		this.competicio = competicio;
		this.club = club;
	}
	
	public Basquet (String titular, String competicio, String club) {
		super(titular);
		this.competicio = competicio;
		this.club = club;
	}
	
	public Basquet (String titular) {
		super(titular);
	}
	
	public String getCompeticio() {
		return competicio;
	}
	public String getClub() {
		return club;
	}
	
	public void setCompeticio(String competicio) {
		this.competicio = competicio;
	}
	public void setClub(String club) {
		this.club = club;
	}
	
	
	public int calcularPreuNoticia () {
		int preuInicial = 250;
		int sumaPreu = 0;
		
			
		if (this.competicio.equalsIgnoreCase("Eurolliga") || this.competicio.equalsIgnoreCase("Euroliga")){
			sumaPreu = preuInicial + 75;
		} else {
			sumaPreu = preuInicial;
		}
		
		if (this.club.equalsIgnoreCase("Barça")|| this.club.equalsIgnoreCase("Madrid")) {
			sumaPreu = sumaPreu + 75;
		} else {
			sumaPreu = sumaPreu + 0;
		} 	
		return sumaPreu;
	}	
	
	public int calcularPuntuacio () {
		int puntsInicials = 4;
		int sumaPunts = 0;
		
		if (this.competicio.equalsIgnoreCase("Eurolliga")){
			sumaPunts = puntsInicials + 3;
		} else if (this.competicio.equalsIgnoreCase("ACB")){
			sumaPunts = puntsInicials + 2;
		} else {
			sumaPunts = puntsInicials + 0;
		}
		
		if (this.club.equalsIgnoreCase("Barça")|| this.club.equalsIgnoreCase("Madrid")) {
			sumaPunts = sumaPunts + 1;
		} else {
			sumaPunts = sumaPunts + 0;
		}	
		
		return sumaPunts;
	}
	
}
