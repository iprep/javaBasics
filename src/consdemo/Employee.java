package consdemo;

public class Employee {

	String employeeName;
	
	
	public Employee(String employeeName) {
		this.employeeName = employeeName;
	}

	public Employee() {
		employeeName="Ahmed";
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee("Daniel");
		
		System.out.println(e1.employeeName);
		System.out.println(e2.employeeName);		

	}

}
