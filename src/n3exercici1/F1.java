package n3exercici1;

import java.util.Scanner;

public class F1 extends Noticia	{
	private String escuderia;

	Scanner sc = new Scanner(System.in);
	
	public F1 (String titular, int puntuacio, int preu, String escuderia) {
		super(titular, puntuacio, preu);
		this.escuderia = escuderia;
	}
	
	public F1 (String titular, String escuderia) {
		super(titular);
		this.escuderia = escuderia;
	}
	
	public F1 (String titular) {
		super(titular);
	}
	
	
	
	public String getEscuderia() {
		return escuderia;
	}
	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}
	
		
	
	public int calcularPreuNoticia () {
		int preuInicial = 100;
		int sumaPreu = 0;
		
		if (this.escuderia.equalsIgnoreCase("Ferrari") || this.escuderia.equalsIgnoreCase("Mercedes")){
			sumaPreu = preuInicial + 100;
		} else {
			sumaPreu = preuInicial;
		} 

		return sumaPreu;
	}
	
	public int calcularPuntuacio () {
		int puntsInicials = 4;
		int sumaPunts = 0;
		
		if (this.escuderia.equalsIgnoreCase("Ferrari") || this.escuderia.equalsIgnoreCase("Mercedes")){
			sumaPunts = puntsInicials + 2;
		} else {
			sumaPunts = puntsInicials + 0;
		} 
		
		return sumaPunts;
	}
	
}
