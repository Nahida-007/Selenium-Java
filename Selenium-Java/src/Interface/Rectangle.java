package Interface;

public class Rectangle implements Polygon{
	
	public void getArea() {
		int l = 20;
		int b = 10;
		int area = l*b;
		System.out.println("Area of the rectangle is: " +area);
		
	}
	
	public void getSides() {
		
		System.out.println("I have 4 sides");
		
	}

}
