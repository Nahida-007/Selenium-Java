package Constructor;

public class ParameterizedConstructor {

	int empId;
	String empName;
	
	ParameterizedConstructor(int empId, String empName){
		this.empId = empId;
		this.empName = empName;
	}
	
	void display() {
		System.out.println("id: "+empId+ ", Name: " +empName);
	}
	public static void main(String[] args) {
		ParameterizedConstructor Obj1 = new ParameterizedConstructor(23, "Nahida");
		
		ParameterizedConstructor Obj2 = new ParameterizedConstructor(25, "Sofia");
		
		Obj1.display();
		Obj2.display();
	}

}
