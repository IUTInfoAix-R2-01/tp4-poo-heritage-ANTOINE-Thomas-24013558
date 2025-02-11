package TP4;

public class Cylinder {
	private Circle base;
	private double height;
	
	public Cylinder() {
		base = new Circle();
		height = 1.0;
	}
	
	@Override
	public String toString() {
		return "Cylinder [base=" + base + ", height=" + height + "]";
	}

	public static void main(String[] args) {
		Cylinder a1 = new Cylinder();
		
		System.out.println(a1);
	}
}
