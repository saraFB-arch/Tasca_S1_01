package n2exercici1;

public class Telefon {
	String marca;
	String model;
	
	
	public Telefon(String marca, String model) {
		this.marca = marca; 
		this.model = model;
	}
	
	
	public String getMarca() {
		return marca;
	}
	public String getModel() {
		return model;
	}
	
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModel (String model){
		this.model = model;
	}
	
	
		
	public void trucar(String numTelf) {
		System.out.println("S'està trucant al número " + numTelf);
	}
	
	
	public String toString() {
		return "Aquest és un mòbil " + this.marca + ", model " + this.model;
	}
	
	
}
