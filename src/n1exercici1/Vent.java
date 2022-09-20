package n1exercici1;

public class Vent extends Instrument {
	private String material;
	
	
	public Vent (String nom, int preu, String material) {
		super(nom, preu);
		this.material = material;
	}
	
	public String getMaterial () {
		return material;
	}
	public void setMaterial (String material) {
		this.material = material;
	}
	
	public void tocar() {
		System.out.println("Està sonant un instrument de vent.");
	}
	
	public String toString() {
		return "El nom d\'aquest instrument de corda és " + super.getNom() + " i el seu preu és de " 
				+ super.getPreu() + " euros. Està fet de " + this.material + ".";
	}
	
	
}
