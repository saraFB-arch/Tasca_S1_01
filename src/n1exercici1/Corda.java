package n1exercici1;

public class Corda extends Instrument{
	private int numCordes;
	
	
	public Corda (String nom, int preu, int numCordes) {
		super(nom, preu);
		this.numCordes = numCordes;
	}
	
	public int getNumCordes () {
		return numCordes;
	}
	public void setNumCordes (int numCordes) {
		this.numCordes = numCordes;
	}
	
	public void tocar() {
		System.out.println("Està sonant un instrument de corda.");
	}
	
	public String toString() {
		return "El nom d\'aquest instrument de corda és " + super.getNom() + " i el seu preu és de " 
				+ super.getPreu() + " euros. Té " + this.numCordes + " número de cordes.";
	}
	
}
