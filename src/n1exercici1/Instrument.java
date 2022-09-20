package n1exercici1;

public abstract class Instrument {
	private String nom;
	private int preu;
	//static int idInstrument;
	
	static {
		System.out.println("La música comença a sonar!!!\n *****************");
	}
	
	//Constructor
	public Instrument (String nom, int preu) {
		this.nom  = nom;
		this.preu = preu;
	}
	//Getter
	public String getNom() {
		return nom;
	}
	public int getPreu() {
		return preu;
	}
	
	//Setter
	public void setNom(String nom) {
		this.nom = nom;	
	}
	public void setPreu(int preu) {
	this.preu = preu;
	}
	
	//Mètodes específics
	public abstract void tocar();
	
	//toString
	public String toString() {
		return "El nom de l\'instrument és " + this.nom 
				+ " i val " + this.preu + " euros.";
	}
	
	
	
	
	
	
}
