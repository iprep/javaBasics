class X{
	public X() {
		System.out.println("W constructor");
	}
	{
		System.out.println("X instance block");
	}
}

class W {
	public W() {
		System.out.println("3. W constructor");
	}
}
public class Z {

	W w = new W();
	X x = new X();
	{
		System.out.println("4. instance block");
	}
	static {
		System.out.println("static block-1");
	}
	static {
		System.out.println("static block-2");
	}
	public Z() {
		System.out.println("5. Z constructor");
	}
	public static void main(String[] args) {
		System.out.println("2. In main");
		Z z1 = new Z();

	}

}
