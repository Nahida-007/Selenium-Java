package Abstraction;

public abstract class Bike {
	
	Bike(){
		System.out.println("Bike is Created");
	}
	
	abstract void run();
    void changeGear() {
    	System.out.println("Gear Changed");
    }
}
