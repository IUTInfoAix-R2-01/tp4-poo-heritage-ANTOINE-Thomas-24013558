package TP4;

public class Dog extends Mammal {

	public Dog(String name) {
		super(name);
	}

	public void greets() {
		System.out.println("Woof");
	}
	
	public void greets(Dog another) {
		System.out.println("Woooof");
	}

	@Override
	public String toString() {
		return "Dog [" + super.toString() + "]";
	}
	
	public static void main(String[] args) {
		Dog a1 = new Dog("Carotide");
		Dog a2 = new Dog("Gislaine");
		
		System.out.println(a1);
		System.out.println(a2);
		
		a1.greets();
		a1.greets(a2);
	}
}
