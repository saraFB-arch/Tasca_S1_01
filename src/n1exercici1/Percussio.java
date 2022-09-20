package n1exercici1;

public class Percussio extends Instrument {
	private int numBaquetes;
	
	
	
	public Percussio (String nom, int preu, int numBaquetes) {
		super(nom, preu);
		this.numBaquetes = numBaquetes;
	}
	
	public int getNumBaquetes () {
		return numBaquetes;
	}
	public void setNumBaquetes (int numBaquetes) {
		this.numBaquetes = numBaquetes;
	}
	
	public void tocar() {
		System.out.println("Està sonant un instrument de percussió.");
	}
	
	public String toString() {
		return "El nom d\'aquest instrument de corda és " + super.getNom() + " i el seu preu és de " 
				+ super.getPreu() + " euros. Té " + this.numBaquetes + " número de baquetes.";
	}
	
}
