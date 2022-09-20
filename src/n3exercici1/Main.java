package n3exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int resposta = 0;
		String nomRedactor = "";
		int numDNI = 0;
		String lletraDNI = "";
		boolean encontrado = false;
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Redactor> baseDadesRedactors = new ArrayList<Redactor>();
		
		baseDadesRedactors.add(new Redactor("Pepito Lopez", 48789623, "R"));
		baseDadesRedactors.add(new Redactor("Juanita Jimenez", 56871256, "Z"));
		baseDadesRedactors.add(new Redactor("Seve Gonzalez", 89852354, "T"));
		
		
		System.out.println("Què vols fer?\n"
				+ "1.- Introduir redactor.\r\n"
				+ "2.- Eliminar redactor.\r\n"
				+ "3.- Introduir notícia a un redactor.\r\n"
				+ "4.- Eliminar notícia.\r\n"
				+ "5.- Mostrar totes les notícies per redactor.\r\n"
				+ "6.- Calcular puntuació de la notícia.\r\n"
				+ "7.- Calcular preu-notícia.");	
		resposta = sc.nextInt();
		
		
		switch (resposta) {
			case 1:
				crearRedactor(baseDadesRedactors);
			break;
			case 2:
				eliminarRedactor(baseDadesRedactors);
			break;
			case 3:
				introduirNoticia(baseDadesRedactors);
				break;
			case 4:
				eliminarRedaccio(baseDadesRedactors);
				break;
			case 5:
				veureRedaccions(baseDadesRedactors);
				break;
			case 6:
				calcularPuntuacio(baseDadesRedactors);
				break;
			case 7:
				calcularPreu(baseDadesRedactors);
				break;
		}
		
	}
	
	
	public static void crearRedactor (ArrayList<Redactor> baseDadesRedactors) {
		String nomRedactor = "";
		int numDNI = 0;
		String lletraDNI = "";
		int ultimRedactorCreat = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nom complet del redactor:");
		nomRedactor = sc.nextLine();
		System.out.println("Número de DNI (sense lletra):");
		numDNI = sc.nextInt();
		System.out.println("Lletra del DNI:");
		lletraDNI = sc.next();
		
		baseDadesRedactors.add(new Redactor(nomRedactor, numDNI, lletraDNI));
		ultimRedactorCreat = baseDadesRedactors.size() - 1;
		System.out.println("Hem creat la fitxa del nou redactor: " + baseDadesRedactors.get(ultimRedactorCreat).toString());
		
	}
	public static void eliminarRedactor(ArrayList<Redactor> baseDadesRedactors) {
		String nomRedactor = "";
		boolean trobat = false;
		int i = 0;
		int llistat = baseDadesRedactors.size();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digues el nom del redactor que vols eliminar:");
		nomRedactor = sc.nextLine();
		
		while (trobat == false && i < llistat) {
			if (nomRedactor.equalsIgnoreCase(baseDadesRedactors.get(i).getNom())) {
				trobat = true;
				baseDadesRedactors.remove(i);
				System.out.println("Hem eliminat " + nomRedactor + " de la nostra base de dades.");
			}
			i++;
		}
		if (trobat == false) {
			System.out.println("No hem trobat cap redactor amb aquest nom.");
		}
	}	
	public static void introduirNoticia(ArrayList<Redactor> baseDadesRedactors) {
		String nomRedactor = "";
		boolean trobat = false;
		int i = 0;
		int llistat = baseDadesRedactors.size();
		Scanner sc = new Scanner(System.in);
		String titular = "";
		int tipus = 0;
		String esport = "";
		
		System.out.println("Digues el nom del redactor:");
		nomRedactor = sc.nextLine();
		System.out.println("I el titular de la notícia:");
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
			while (trobat == false && i < llistat) {
				if (nomRedactor.equalsIgnoreCase(baseDadesRedactors.get(i).getNom())) {
					trobat = true;
					baseDadesRedactors.get(i).setRedaccions(new Futbol (titular));
				}
				i++;
			}
			if (trobat == false) {
				System.out.println("No hem trobat cap redactor amb aquest nom.");
			}
			esport = "futbol";
			break;
		case 2:
			while (trobat == false && i < llistat) {
				if (nomRedactor.equalsIgnoreCase(baseDadesRedactors.get(i).getNom())) {
					trobat = true;
					baseDadesRedactors.get(i).setRedaccions(new Basquet (titular));
				}
				i++;
			}
			if (trobat == false) {
				System.out.println("No hem trobat cap redactor amb aquest nom.");
			}
			esport = "basquet";
			break;
		case 3:
			while (trobat == false && i < llistat) {
				if (nomRedactor.equalsIgnoreCase(baseDadesRedactors.get(i).getNom())) {
					trobat = true;
					baseDadesRedactors.get(i).setRedaccions(new Tenis (titular));
				}
				i++;
			}
			if (trobat == false) {
				System.out.println("No hem trobat cap redactor amb aquest nom.");
			}
			esport = "tenis";
			break;
		case 4:
			while (trobat == false && i < llistat) {
				if (nomRedactor.equalsIgnoreCase(baseDadesRedactors.get(i).getNom())) {
					trobat = true;
					baseDadesRedactors.get(i).setRedaccions(new F1 (titular));
				}
				i++;
			}
			if (trobat == false) {
				System.out.println("No hem trobat cap redactor amb aquest nom.");
			}
			esport = "F1";
			break;
		case 5:
			while (trobat == false && i < llistat) {
				if (nomRedactor.equalsIgnoreCase(baseDadesRedactors.get(i).getNom())) {
					trobat = true;
					baseDadesRedactors.get(i).setRedaccions(new Motociclisme (titular));
				}
				i++;
			}
			if (trobat == false) {
				System.out.println("No hem trobat cap redactor amb aquest nom.");
			}
			esport = "motociclisme";
			break;
		}
		
		System.out.println("Hem afegit la redacció «" + titular + "», de " + esport + " en el llistat de " + nomRedactor + " .");
		
		
	}
	
	public static void eliminarRedaccio(ArrayList<Redactor> baseDadesRedactors) {
		String nomRedactor = "";
		String titular = "";
		boolean trobat = false;
		boolean trobat2 = false;
		int i = 0, j = 0;
		int llistat = baseDadesRedactors.size();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digues el nom del redactor:");
		nomRedactor = sc.nextLine();
		System.out.println("Quin és el titular de la notícia que vols eliminar?");
		titular = sc.nextLine();
		
		
		while (trobat == false && i < llistat) {
			if (nomRedactor.equalsIgnoreCase(baseDadesRedactors.get(i).getNom())) {
				trobat = true;
				while (trobat2 == false && j < llistat) {
					if(titular.equalsIgnoreCase(baseDadesRedactors.get(i).getRedaccions().get(j).getTitular())) {   
						baseDadesRedactors.get(i).getRedaccions().remove(j);
						System.out.println("Hem eliminat la notícia amb titular «" + titular + "» del redactor " + nomRedactor);
					}
					j++;
				}	
			}
			i++;
		}
		if (trobat == false) {
			System.out.println("No hem trobat cap redactor amb aquest nom.");
		}
	}
	
	public static void veureRedaccions(ArrayList<Redactor> baseDadesRedactors) {
		String nomRedactor = "";
		boolean trobat = false;
		int i = 0;
		int llistat = baseDadesRedactors.size();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digues el nom del redactor:");
		nomRedactor = sc.nextLine();
		
		
		while (trobat == false && i < llistat) {
			if (nomRedactor.equalsIgnoreCase(baseDadesRedactors.get(i).getNom())) {
				trobat = true;
				System.out.println(baseDadesRedactors.get(i).getRedaccions());
			}
			i++;
		}
		if (trobat == false) {
			System.out.println("No hem trobat cap redactor amb aquest nom.");
		}
	}
	
	public static void calcularPuntuacio (ArrayList<Redactor> baseDadesRedactors) {
		String nomRedactor = "", competicio = "", club = "", jugador = "", escuderia = "", equip = "";
		boolean trobat = false;
		int i = 0;
		int llistat = baseDadesRedactors.size();
		Scanner sc = new Scanner(System.in);
		String titular = "";
		int tipus = 0;
		String esport = "";
		int ultimaNoticiaCreada = 0;
		int puntuacio = 0;
		
		System.out.println("Digues el nom del redactor:");
		nomRedactor = sc.nextLine();
		System.out.println("I el titular de la notícia:");
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
			while (trobat == false && i < llistat) {
				if (nomRedactor.equalsIgnoreCase(baseDadesRedactors.get(i).getNom())) {
					trobat = true;
					System.out.println("De quina competició tracta la notícia?");
					competicio = sc.nextLine();
					System.out.println("I de quin equip es parla?");
					club = sc.nextLine();
					System.out.println("I es parla d'algun jugador? De quin?");
					jugador = sc.nextLine();
				
					baseDadesRedactors.get(i).setRedaccions(new Futbol (titular, competicio, club, jugador));
					ultimaNoticiaCreada = baseDadesRedactors.get(i).getRedaccions().size() - 1;
					puntuacio = baseDadesRedactors.get(i).getRedaccions().get(ultimaNoticiaCreada).calcularPuntuacio();					
					System.out.println("La puntuació de la notícia «" + titular + "» és " + puntuacio);
				}
				i++;
			}
			if (trobat == false) {
				System.out.println("No hem trobat cap redactor amb aquest nom.");
			}
			break;
		case 2:
			while (trobat == false && i < llistat) {
				if (nomRedactor.equalsIgnoreCase(baseDadesRedactors.get(i).getNom())) {
					trobat = true;
					System.out.println("De quina competició tracta la notícia?");
					competicio = sc.nextLine();
					System.out.println("I de quin equip es parla?");
					club = sc.nextLine();
				
					baseDadesRedactors.get(i).setRedaccions(new Basquet (titular, competicio, club));
					ultimaNoticiaCreada = baseDadesRedactors.get(i).getRedaccions().size() - 1;
					puntuacio = baseDadesRedactors.get(i).getRedaccions().get(ultimaNoticiaCreada).calcularPuntuacio();					
					System.out.println("La puntuació de la notícia «" + titular + "» és " + puntuacio);
				}
				i++;
			}
			if (trobat == false) {
				System.out.println("No hem trobat cap redactor amb aquest nom.");
			}
			break;
		case 3:
			while (trobat == false && i < llistat) {
				if (nomRedactor.equalsIgnoreCase(baseDadesRedactors.get(i).getNom())) {
					trobat = true;
					System.out.println("De quina competició tracta la notícia?");
					competicio = sc.nextLine();
					System.out.println("I es parla d'algun tenista? De quin?");
					jugador = sc.nextLine();
				
					baseDadesRedactors.get(i).setRedaccions(new Tenis (titular, competicio, jugador));
					ultimaNoticiaCreada = baseDadesRedactors.get(i).getRedaccions().size() - 1;
					puntuacio = baseDadesRedactors.get(i).getRedaccions().get(ultimaNoticiaCreada).calcularPuntuacio();					
					System.out.println("La puntuació de la notícia «" + titular + "» és " + puntuacio);
				}
				i++;
			}
			if (trobat == false) {
				System.out.println("No hem trobat cap redactor amb aquest nom.");
			}
			break;
		case 4:
			while (trobat == false && i < llistat) {
				if (nomRedactor.equalsIgnoreCase(baseDadesRedactors.get(i).getNom())) {
					trobat = true;
					System.out.println("De quina escuderia tracta la notícia?");
					escuderia = sc.nextLine();
									
					baseDadesRedactors.get(i).setRedaccions(new F1 (titular, escuderia));
					ultimaNoticiaCreada = baseDadesRedactors.get(i).getRedaccions().size() - 1;
					puntuacio = baseDadesRedactors.get(i).getRedaccions().get(ultimaNoticiaCreada).calcularPuntuacio();					
					System.out.println("La puntuació de la notícia «" + titular + "» és " + puntuacio);
				}
				i++;
			}
			if (trobat == false) {
				System.out.println("No hem trobat cap redactor amb aquest nom.");
			}
			esport = "F1";
			break;
		case 5:
			while (trobat == false && i < llistat) {
				if (nomRedactor.equalsIgnoreCase(baseDadesRedactors.get(i).getNom())) {
					trobat = true;
					
					System.out.println("De quin equip tracta?");
					equip = sc.nextLine();
				
					baseDadesRedactors.get(i).setRedaccions(new Motociclisme (titular, equip));
					ultimaNoticiaCreada = baseDadesRedactors.get(i).getRedaccions().size() - 1;
					puntuacio = baseDadesRedactors.get(i).getRedaccions().get(ultimaNoticiaCreada).calcularPuntuacio();					
					System.out.println("La puntuació de la notícia «" + titular + "» és " + puntuacio);
				}
				i++;
			}
			if (trobat == false) {
				System.out.println("No hem trobat cap redactor amb aquest nom.");
			}
			break;
		}
		
	}
	
	public static void calcularPreu (ArrayList<Redactor> baseDadesRedactors) {
		String nomRedactor = "", competicio = "", club = "", jugador = "", escuderia = "", equip = "";
		boolean trobat = false;
		int i = 0;
		int llistat = baseDadesRedactors.size();
		Scanner sc = new Scanner(System.in);
		String titular = "";
		int tipus = 0;
		String esport = "";
		int ultimaNoticiaCreada = 0;
		int preu = 0;
		
		System.out.println("Digues el nom del redactor:");
		nomRedactor = sc.nextLine();
		System.out.println("I el titular de la notícia:");
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
			while (trobat == false && i < llistat) {
				if (nomRedactor.equalsIgnoreCase(baseDadesRedactors.get(i).getNom())) {
					trobat = true;
					System.out.println("De quina competició tracta la notícia?");
					competicio = sc.nextLine();
					System.out.println("I de quin equip es parla?");
					club = sc.nextLine();
					System.out.println("I es parla d'algun jugador? De quin?");
					jugador = sc.nextLine();
				
					baseDadesRedactors.get(i).setRedaccions(new Futbol (titular, competicio, club, jugador));
					ultimaNoticiaCreada = baseDadesRedactors.get(i).getRedaccions().size() - 1;
					preu = baseDadesRedactors.get(i).getRedaccions().get(ultimaNoticiaCreada).calcularPreuNoticia();					
					System.out.println("El preu de la notícia «" + titular + "» és " + preu + " euros.");
				}
				i++;
			}
			if (trobat == false) {
				System.out.println("No hem trobat cap redactor amb aquest nom.");
			}
			break;
		case 2:
			while (trobat == false && i < llistat) {
				if (nomRedactor.equalsIgnoreCase(baseDadesRedactors.get(i).getNom())) {
					trobat = true;
					System.out.println("De quina competició tracta la notícia?");
					competicio = sc.nextLine();
					System.out.println("I de quin equip es parla?");
					club = sc.nextLine();
				
					baseDadesRedactors.get(i).setRedaccions(new Basquet (titular, competicio, club));
					ultimaNoticiaCreada = baseDadesRedactors.get(i).getRedaccions().size() - 1;
					preu = baseDadesRedactors.get(i).getRedaccions().get(ultimaNoticiaCreada).calcularPreuNoticia();					
					System.out.println("El preu de la notícia «" + titular + "» és " + preu + " euros.");
				}
				i++;
			}
			if (trobat == false) {
				System.out.println("No hem trobat cap redactor amb aquest nom.");
			}
			break;
		case 3:
			while (trobat == false && i < llistat) {
				if (nomRedactor.equalsIgnoreCase(baseDadesRedactors.get(i).getNom())) {
					trobat = true;
					System.out.println("De quina competició tracta la notícia?");
					competicio = sc.nextLine();
					System.out.println("I es parla d'algun tenista? De quin?");
					jugador = sc.nextLine();
				
					baseDadesRedactors.get(i).setRedaccions(new Tenis (titular, competicio, jugador));
					ultimaNoticiaCreada = baseDadesRedactors.get(i).getRedaccions().size() - 1;
					preu = baseDadesRedactors.get(i).getRedaccions().get(ultimaNoticiaCreada).calcularPreuNoticia();					
					System.out.println("El preu de la notícia «" + titular + "» és " + preu + " euros.");
				}
				i++;
			}
			if (trobat == false) {
				System.out.println("No hem trobat cap redactor amb aquest nom.");
			}
			break;
		case 4:
			while (trobat == false && i < llistat) {
				if (nomRedactor.equalsIgnoreCase(baseDadesRedactors.get(i).getNom())) {
					trobat = true;
					System.out.println("De quina escuderia tracta la notícia?");
					escuderia = sc.nextLine();
									
					baseDadesRedactors.get(i).setRedaccions(new F1 (titular, escuderia));
					ultimaNoticiaCreada = baseDadesRedactors.get(i).getRedaccions().size() - 1;
					preu = baseDadesRedactors.get(i).getRedaccions().get(ultimaNoticiaCreada).calcularPreuNoticia();					
					System.out.println("El preu de la notícia «" + titular + "» és " + preu + " preu.");
				}
				i++;
			}
			if (trobat == false) {
				System.out.println("No hem trobat cap redactor amb aquest nom.");
			}
			esport = "F1";
			break;
		case 5:
			while (trobat == false && i < llistat) {
				if (nomRedactor.equalsIgnoreCase(baseDadesRedactors.get(i).getNom())) {
					trobat = true;
					
					System.out.println("De quin equip tracta?");
					equip = sc.nextLine();
				
					baseDadesRedactors.get(i).setRedaccions(new Motociclisme (titular, equip));
					ultimaNoticiaCreada = baseDadesRedactors.get(i).getRedaccions().size() - 1;
					preu = baseDadesRedactors.get(i).getRedaccions().get(ultimaNoticiaCreada).calcularPreuNoticia();					
					System.out.println("El preu de la notícia «" + titular + "» és " + preu + " euros.");
				}
				i++;
			}
			if (trobat == false) {
				System.out.println("No hem trobat cap redactor amb aquest nom.");
			}
			break;
		}
	}
}
