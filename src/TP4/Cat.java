package TP4;

public class Cat extends Mammal {

	public Cat(String name) {
		super(name);
	}
	
	public void greets() {
		System.out.println("Meow");
	}

	@Override
	public String toString() {
		return "Cat [" + super.toString() + "]";
	}
	
	public static void main(String[] args) {
		Cat a1 = new Cat("Sabrina");
		
		System.out.println(a1);
		
		a1.greets();
	}
}
