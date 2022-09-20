package n1exercici1;

public class Grupdemusica_main {

	public static void main(String[] args) {
	
	//Abans de l'inici de les instàncies, apareixerà l'static quan s'inicia la classe "Instrument".
	// Iniciación de la instancia:
	Vent flauta	= new Vent("flauta", 75, "fusta");
	flauta.tocar();
	System.out.println(flauta.toString());	
	
	
	Corda guitarra = new Corda("guitarra", 112, 5);
	guitarra.tocar();
	System.out.println(guitarra.toString());
	
	Percussio tambor = new Percussio("tambor", 35, 2);
	tambor.tocar();
	System.out.println(tambor.toString());
	}

}
