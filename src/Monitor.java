
public class Monitor {

	int num=900;
	{
		System.out.println("3. INITIALIZER BLOCK CALLED");
	}
	static {
		System.out.println("1. STATIC INITIALIZAER CALLED");
	}
	public Monitor() {
		System.out.println("4. Monitor constructor called");
	}
	public void display() {
		System.out.println("5. display called and value of num is :"+num);
	}
	public static void main(String[] args) {
		System.out.println("2. MAIN CALLED");
		Monitor m = new Monitor();
		m.display();
		Monitor m2 = new Monitor();

	}

}
