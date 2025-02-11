package cycles;
import java.util.Scanner;

public class Velo {
	private double DEFAUT_BRAQUET = 13.0;
	private double braquet;
	private double diamRoue;
	private int genAlea = 1;
	
	public double getDEFAUT_BRAQUET() {
		return DEFAUT_BRAQUET;
	}

	public void setDEFAUT_BRAQUET(double DEFAUT_BRAQUET) {
		this.DEFAUT_BRAQUET = DEFAUT_BRAQUET;
	}

	public Velo(double braquet, double diamRoue) {
		super();
		this.braquet = braquet;
		this.diamRoue = diamRoue;
	}

	public Velo(double braquet) {
		this.braquet = braquet;
	}

	public Velo() {
		super();
		this.braquet = DEFAUT_BRAQUET;
		this.diamRoue = 1.0;
	}

	public int getGenAlea() {
		return genAlea;
	}

	public void setGenAlea(int genAlea) {
		this.genAlea = genAlea;
	}

	public double getBraquet() {
		return braquet;
	}

	public void setBraquet(double braquet) {
		this.braquet = braquet;
	}

	public double getDiamRoue() {
		return diamRoue;
	}

	public void setDiamRoue(double diamRoue) {
		this.diamRoue = diamRoue;
	}

	@Override
	public String toString() {
		return "Velo [braquet=" + braquet + ", diamRoue=" + diamRoue
				+ "]";
	}
	
	public double getPuissance(double FrequenceCoupsDePedale) {
		return FrequenceCoupsDePedale * braquet * diamRoue * genAlea;
	}
	
	public static void main(String[] args) {
		Velo a1 = new Velo();
		Velo a2 = new Velo(5.5, 2.3);
		
		System.out.println(a1);
		System.out.println(a2);
		
		try (Scanner scanner = new Scanner(System.in)) {
			Velo a3 = new Velo();
			System.out.print("Entrer le braquet de votre vélo² : ");
			a3.setBraquet(scanner.nextDouble());
			System.out.print("Entrer le diamètre des roues de votre vélo² : ");
			a3.setDiamRoue(scanner.nextDouble());
			
			System.out.println(a3.toString());
			System.out.println(a3.getPuissance(5));
		}
	}
}
/* T */