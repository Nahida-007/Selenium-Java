package Java_Programs;

/* It will throw compilation error, more than one method with same name and argument list 
 * can not be given in a class even though their return type is different. */



public class DemoMethod2 { 
 
 public double myMethod2(int a, int b){
	return a+b;
	  }
 
 /* public int myMethod2(int c, int d) {
	 return c-d;
 } */
 
 public void disp(char s) {
	 
	 System.out.println(s);
	 
	 
 }
 

	public static void main(String[] args) {
		
		DemoMethod2 obj = new DemoMethod2();
		obj.disp('N');
		System.out.println(obj.myMethod2(20, 30));
		

	}

}
