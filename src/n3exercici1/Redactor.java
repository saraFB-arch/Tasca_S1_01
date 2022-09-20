package n3exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class Redactor {
	private String nom;
	private final long DNI;
	private final String lletraDNI;
	private int sou;
	private ArrayList<Noticia> redaccions = new ArrayList<Noticia>();
	
	Scanner sc = new Scanner(System.in);
	
	
	public Redactor(String nom, long DNI, String lletraDNI) {
		this.nom = nom;
		this.DNI = DNI;
		this.lletraDNI = lletraDNI;
		this.sou = 1500;
		
	}
	
	public String getNom() {
		return nom;
	}
	public long getDNI() {
		return DNI;
	}
	public String getLletraDNI() {
		return lletraDNI;
	}
	public int getSou() {
		return sou;
	}
	public ArrayList<Noticia> getRedaccions(){
		return this.redaccions;
	}
	
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setSou (int sou) {
		this.sou = sou;
	}
	public void setRedaccions (Noticia redaccio) {
		this.redaccions.add(redaccio);
	}
	
	/*	
	public void novaRedaccio (ArrayList<Noticia> redaccions) {
		String titular = "";
		int tipus = 0;
		String esport = "";
		
		System.out.println("Quin és el nom del títular de la redacció que vols afegir?");
		titular = sc.nextLine();
		System.out.println("De quina temàtica és?"
				+ "1. Futbol\n"
				+ "2. Basquet\n"
				+ "3. Tenis\n"
				+ "4. F1\n"
				+ "5. Motociclisme\n");
		tipus = sc.nextInt();
		
		switch(tipus) {
		case 1:
			redaccions.add(new Futbol(titular));
			esport = "futbol";
			break;
		case 2:
			redaccions.add(new Basquet(titular));
			esport = "basquet";
			break;
		case 3:
			redaccions.add(new Tenis(titular));
			esport = "tenis";
			break;
		case 4:
			redaccions.add(new F1(titular));
			esport = "F1";
			break;
		case 5:
			redaccions.add(new Motociclisme(titular));
			esport = "motociclisme";
			break;
		}
		
		System.out.println("Hem afegit la redacció «" + titular + "», de " + esport + ".");
	}
	*/
	
	public String toString () {
		return nom + ", amb DNI " + this.DNI + this.lletraDNI + " i amb un sou inicial de " + this.sou + " euros.";
	}
	
	
	
}
