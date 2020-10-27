package Interface;

public interface Polygon {
	
	void getArea();
	default void getSides() {
		System.out.println("I have got 4 sides");
	}

}
