package n2exercici1;

public class Smartphone extends Telefon implements Rellotge, Camera{
	private double pantalla;
	private int megapixels;
	
	
	public Smartphone(String marca, String model, double pantalla, int megapixels) {
		super(marca, model);
		this.pantalla = pantalla;
		this.megapixels = megapixels;
	}
	
	//Getter
	public double getPantalla() {
		return pantalla;
	} 
	public int getMegapixels() {
		return megapixels;
	}
	
	//Setter
	public void setPantalla(double pantalla) {
		this.pantalla = pantalla;
	}
	public void setMegapixels (int megapixels) {
		this.megapixels = megapixels;
	}
		
	
	//Mètodes 
	public void fotografiar() {;
		System.out.println("S’està fent una foto");
	}
	public void alarma() {
		System.out.println("Està sonant l’alarma.");
	}
	
	//toString
	public String toString() {
		return "Smartphone d\'última generació, de la marca " + super.marca + " i model " + super.model + ", amb panatalla " 
				+ this.pantalla + " polzades i " + megapixels + " megapíxels de càmera posterior.";
	}
	
	
}
