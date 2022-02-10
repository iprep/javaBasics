package consdemo;

public class Student {
	int studentId;
	String studentName;
	int marks;
	int grade;

	public Student() {
		marks=-1;
		grade=-1;
	}
	
	public Student(int studentId, String studentName, int marks, int grade) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.marks=marks;
		this.grade=grade;
	}
	
	public Student(int studentId, String studentName) {
		this();
		this.studentId=studentId;
		this.studentName=studentName;
	}
	
	public void printStudentDetails() {
		System.out.println("Student Id : "+studentId);
		System.out.println("Student Name : "+studentName);
		System.out.println("Marks : "+marks);
		System.out.println("Grade : "+grade);
	}
	
	public static void main(String[] args) {
		System.out.println("No parameters:");
		Student student1 = new Student();
		student1.printStudentDetails();

		System.out.println("First two parameters:");
		Student student2 = new Student(2,"Clifton");
		student2.printStudentDetails();

		System.out.println("All four parameters:");
		Student student3 = new Student(3,"Eaton",5,7);
		student3.printStudentDetails();
	}

}
