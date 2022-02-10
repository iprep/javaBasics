package day7;

public class Demo1 {

	public void add(int x, int y) {
		System.out.println("Adding two numbers :"+(x+y));
	}
	public void add(String x, int y) {
		System.out.println("Adding one string and one number :"+(x+y));
	}
	public void add(int x, String y) {
		System.out.println("Adding one number and one string :"+(x+y));
	}
	public void add(String x, String y) {
		System.out.println("Adding two strings :"+(x+y));
	}
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.add(10, 10);
		d.add(90, "Hello");
		d.add("Clifton", "Richard");

	}

}
