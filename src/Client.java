import finance.Fee;

public class Client {

	public static void main(String[] args) {
		maths.Calculator c = new maths.Calculator();
		System.out.println(c.addNumbers(9,9));
		
		Fee f = new Fee();
		f.takeFees(7600);

	}

}
