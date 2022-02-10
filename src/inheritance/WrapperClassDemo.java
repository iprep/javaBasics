package inheritance;

public class WrapperClassDemo {

	public static void main(String[] args) {
		int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
		System.out.println(sum);
		
		long salary1 = 9176;
		Long salary2 = 9176l;
		
		int marks = 100;
		Integer nweMarks = new Integer(marks);
		Integer newMarks = marks;
		
		Double budget = 1922.98;
		double budget1 = Double.valueOf(budget);
		double budget2 = budget;
	}

}
