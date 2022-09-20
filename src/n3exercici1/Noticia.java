package n3exercici1;

import java.util.ArrayList;

public abstract class Noticia {
	private String titular;
	private String text;
	private int puntuacio; 
	private int preu;
	
	private ArrayList<Redactor> autors = new ArrayList<Redactor>();

	public Noticia(String titular, int puntuacio, int preu) {
		this.titular = titular;
		this.text = "   ";
		this.puntuacio = puntuacio;
		this.preu = preu;
		
	}
	public Noticia(String titular) {
		this.titular = titular;
	}
	
	
	public String getTitular() {
		return titular;
	}
	public String getText() {
		return text;
	}
	public int getPuntuacio() {
		return puntuacio;
	}
	public int getPreu() {
		return preu;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public void setText(String text) {
		this.text = text;
	}
	public void setPuntuacio(int puntuacio) {
		this.puntuacio = puntuacio;
	}
	public void setPreu(int preu) {
		this.preu = preu;
	}
	
	
	public abstract int calcularPreuNoticia();

	public abstract int calcularPuntuacio();


}
