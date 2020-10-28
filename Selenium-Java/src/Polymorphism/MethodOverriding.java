package Polymorphism;

public class MethodOverriding {

	public static void main(String[] args) {
		
		Vehicle vh = new Motorbike();
		
		vh.move();
		
		Vehicle vh1 = new Vehicle();
		
		vh1.move();

	}

}
