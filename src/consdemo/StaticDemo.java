package consdemo;

public class StaticDemo {

	public int num1;
	public static int num2;
	public StaticDemo() {
		num1+=10;
		num2-=20;
	}
	
	public void display1() {
		num1=num2++;
		num2=100;
		num1=--num2;
	}
	
	public static void display2() {
		num2--;
	}
	
	public static void main(String[] args) {
		StaticDemo demo1 = new StaticDemo();
		demo1.display1();
		demo1.display2();
		display2();
		StaticDemo.display2();
		
		System.out.println(demo1.num1);

	}

}
