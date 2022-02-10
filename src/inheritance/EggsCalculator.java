package inheritance;

import java.util.Scanner;

public class EggsCalculator {

	public static void main(String[] args) {
		System.out.println("WAP to calculate the # of eggs.");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the # of eggs :");
		String eggs = sc.nextLine();	
		int num=Integer.parseInt(eggs);  
		
		int gross = num/144;
		int dozen = (num - (gross*144))/12;
		int left = num - ((gross*144)+(dozen*12));
		
		System.out.println("Your number of eggs is "+(gross)+" gross, "+(dozen)+" dozen, and "+(left));
	}

}
