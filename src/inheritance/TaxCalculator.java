package inheritance;

import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		System.out.println("WAP to calculate the tax slabs. Input income and gender and calculate the tax accordingly.");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your gender :");
		String gender = sc.nextLine();
		
		System.out.println("Enter your income :");
		String income = sc.nextLine();		
		int incomeValue=Integer.parseInt(income);  
		
		double tax=0;
		
		if (gender.equalsIgnoreCase("male")) {
			if (incomeValue < 180000) {
				System.out.println("No tax payable");
			}
			else if (incomeValue < 500000 & incomeValue > 180001) {
				System.out.println("Your tax is 10%");
				tax=0.1;
			}
			else if (incomeValue < 800000 & incomeValue > 500001) {
				System.out.println("Your tax is 20%");
				tax=0.2;
			}
			else if (incomeValue > 800000) {
				System.out.println("Your tax is 30%");
				tax=0.3;
			}
		}
		else if (gender.equalsIgnoreCase("female")) {
			if (incomeValue < 190000) {
				System.out.println("No tax payable");
			}
			else if (incomeValue < 500000 & incomeValue > 190001) {
				System.out.println("Your tax is 10%");
				tax=0.1;
			}
			else if (incomeValue < 800000 & incomeValue > 500001) {
				System.out.println("Your tax is 20%");
				tax=0.2;
			}
			else if (incomeValue > 800000) {
				System.out.println("Your tax is 30%");
				tax=0.3;
			}
		}
		System.out.println("You owe the IRS: "+"$"+(incomeValue*tax));
		System.out.println("Thanks for using my tax calculator.");
	}
}
