package n1exercici2;

public class Cotxe {
	private static final String MARCA = "Nissan";  /*Constante de clase, un atributo común a todos los objetos de esa clase, 
											que solo ocupa un espacio de memoria.
											Cuando usamos la palabra clave static la declaración de la constante ha de 
											realizarse obligatoriamente en cabecera de la clase, junto a los campos 
											debajo de la signatura de clase).*/
	private static String model;		//Variable de clase
	private final int POTENCIA;			//Constante de objeto. Un espacio de memoria por cada objeto creado. 
	
	//Constructor
	public Cotxe(String model) {
		this.model = model;
		this.POTENCIA = 150;
	}
	
	//Getter
	public String getMarca() {
		return MARCA;
	}
	public String getModel() {
		return model;
	}
	public int getPotencia() {
		return POTENCIA;
	}
	
	//Setter
	public void setModel(String model) {
		this.model = model;	
	}
	
	
	
	//Mètodes
	public static void frenar() {
		System.out.println("El vehicle està frenant.");
	}
	
	public void accelerar () {
		System.out.println("El vehicle està accelerant.");
	}








}
