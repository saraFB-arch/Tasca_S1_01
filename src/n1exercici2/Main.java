package n1exercici2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cotxe micra1 = new Cotxe ("Micra");
		
		Cotxe.frenar(); /*Només podem invocar el mètode frenar des de la classe, 
						perquè és static, però no "accelerar", que no és estàtic.*/
				
		// Des de la instància podem invocar els dos mètodes.
		micra1.accelerar();
		micra1.frenar();
		
	}

}
