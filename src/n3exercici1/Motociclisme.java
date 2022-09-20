package n3exercici1;

public class Motociclisme extends Noticia {
	private String equip;
	
	public Motociclisme (String titular, int puntuacio, int preu, String equip) {
		super(titular, puntuacio, preu);
		this.equip = equip;
	}
	
	public Motociclisme (String titular, String equip) {
		super(titular);
		this.equip = equip;
	}
	
	public Motociclisme (String titular) {
		super(titular);
	}
	
	
	public String getEquip() {
		return equip;
	}
	public void setEsquip (String equip) {
		this.equip = equip;
	}
	
	public int calcularPreuNoticia () {
		int preuInicial = 100;
		int sumaPreu = 0;
		
		if (this.equip.equalsIgnoreCase("Honda") || this.equip.equalsIgnoreCase("Yamaha")){
			sumaPreu = preuInicial + 50;
		} else {
			sumaPreu = preuInicial + 0;
		} 

		return sumaPreu;
	}	
	
	public int calcularPuntuacio () {
		int puntsInicials = 3;
		int sumaPunts = 0;
		
		if (this.equip.equalsIgnoreCase("Honda") || this.equip.equalsIgnoreCase("Yamaha")){
			sumaPunts = puntsInicials + 3;
		} else {
			sumaPunts = puntsInicials + 0;
		} 	
		
		return sumaPunts;
	}
	
	
	
	
}
