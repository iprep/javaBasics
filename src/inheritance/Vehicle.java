package inheritance;

public class Vehicle {
	int numberOfWheels = 4;
	int numberOfSeats = 4;
	String color = "blue";
	String model = "chevy";
	
	void honk() {
		System.out.println("Honk");
	}
	
	void drive() {
		System.out.println("The car is in drive");
	}
	
	void park() {
		System.out.println("The car is in park");
	}
	
	void displayDetails() {
		System.out.println("The number of wheels are: "+this.numberOfWheels);
		System.out.println("The model is: "+this.model);
		System.out.println("The color is: "+this.color);
		System.out.println("The number of seats are: "+this.numberOfSeats);
	}
	
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

}