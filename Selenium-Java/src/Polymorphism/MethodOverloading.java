package Polymorphism;

public class MethodOverloading {
	
	public int add(int x, int y) {
		
		return x+y;
		
	}
	
	public int add(int x, int y, int z) {
		
		return x+y+z;
	}

	public int add(double x, int y) {
		
		return (int)x +y;
	}
	
	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
				
	    System.out.println(obj.add(20, 30));
	    System.out.println(obj.add(20, 30, 40));
	    System.out.println(obj.add(25.5, 20));
	
	
		
			
		
		

	}

}
