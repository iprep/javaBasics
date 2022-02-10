import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter the year : ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if(year%4==0) {
			System.out.println("Yes, "+year+" is a leap year");	
		}
		else {
			System.out.println("No, "+year+" is not a leap year");
		}
	}

}
