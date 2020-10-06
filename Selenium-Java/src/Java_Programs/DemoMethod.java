package Java_Programs;

public class DemoMethod {

	public int myMethod(int num1, int num2) {
		System.out.println("First method of DemoMethod");
		return num1+num2;
	}
	
	public int myMethod(int var1, int var2) {
		System.out.println("Second method of DemoMethod");
		return var1-var2;
	}
	public static void main(String[] args) {
		DemoMethod dm = new DemoMethod();
		dm.myMethod(20, 30);
		dm.myMethod(10,5);

	}

}
