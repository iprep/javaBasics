package inheritance;

public class Truck extends Vehicle {
	int numberOfWheels = 4;
	int numberOfSeats = 4;
	
	void carry() {
		System.out.println("You are carrying another vehicle");
	}
}

