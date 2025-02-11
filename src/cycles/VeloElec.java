package cycles;

import java.util.Scanner;

public class VeloElec extends Velo {
	private double DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15.0;
	private double facteurPuissanceMoteur;
	
	public VeloElec(double braquet, double diamRoue, double coupleMoteur) {
		super(braquet, diamRoue);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	
	public VeloElec(double diamRoue, double coupleMoteur) {
		super(diamRoue);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	
	public VeloElec() {
		super();
		this.facteurPuissanceMoteur = 1.0;
	}
	
	public double getDEFAUT_COUPLE_MOTEUR() {
		return DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public void setDEFAUT_COUPLE_MOTEUR(double DEFAUT_COUPLE_MOTEUR) {
		DEFAUT_COUPLE_MOTEUR = 2.0;
	}

	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
	}

	public void setFacteurPuissanceMoteur(double facteurPuissanceMoteur) {
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}

	@Override
	public String toString() {
		return "VeloElec [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
	}
	
	@Override
	public double getPuissance(double FrequenceCoupsDePedale) {
		return super.getPuissance(FrequenceCoupsDePedale) * facteurPuissanceMoteur;
	}
	
	public static void main(String[] args) {
		VeloElec a4 = new VeloElec();
		VeloElec a5 = new VeloElec(5.5, 2.3, 10.0);
		
		System.out.println(a4);
		System.out.println(a5);
		
		try (Scanner scanner = new Scanner(System.in)) {
			VeloElec a6 = new VeloElec();
			System.out.print("Entrer le braquet de votre vélo² : ");
			a6.setBraquet(scanner.nextDouble());
			System.out.print("Entrer le diamètre des roues de votre vélo² : ");
			a6.setDiamRoue(scanner.nextDouble());
			System.out.print("Entrer le couple de votre moteur de votre vélo² : ");
			a6.setFacteurPuissanceMoteur(scanner.nextDouble());
			
			System.out.println(a6.toString());
			System.out.println("Puissance = " + a6.getPuissance(5));
		}
	}
}
/* T */