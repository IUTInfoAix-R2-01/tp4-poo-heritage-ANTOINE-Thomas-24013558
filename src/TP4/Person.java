package TP4;

public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", address=" + address + "]";
    }

    public static void main(String[] args) {
    	Person a1 = new Person("POISSON", "Dusty-Depot");
    	Person a2 = new Person("mammouth", "Tilted-Towers");
    	
    	System.out.println(a1);
    	System.out.println(a2);
    }
}