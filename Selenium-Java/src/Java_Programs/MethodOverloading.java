package Java_Programs;

public class MethodOverloading {
	static int add(int a, int b) {
		return a+b;
	}
    static int add(int a, int b, int c) {
    	return a+b+c;
    }
    
 public static void main(String args[]) {
	 int s = MethodOverloading.add(20,30 );
	 System.out.println(s);
	 System.out.println(MethodOverloading.add(30, 40, 50));
 }
}
