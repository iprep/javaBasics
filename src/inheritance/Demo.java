package inheritance;
interface Beverages{
	int cost=5;
	void prepareTea();
	default void mix() {
		System.out.println("Mix the beverages properly");
	}
	static void ratings() {
		System.out.println("ratings for beverages");
	}
}
interface Games{
	void play();
	void pause();
}
interface ModernGames extends Games {
	void graphics();
	void animation();
}
class Food {
}
class Pizza extends Food {
}
class Burger extends Food {
}
abstract class Animal {
	int age;
	public Food eat() {
		System.out.println("Animal must eat to survive.");
		return null;
	}
	public void sleep() {
		System.out.println("Animal should sleep.");
	}
	public static void doWork() {
		System.out.println("Animal dowork called");
	}
}

class Men extends Animal implements Beverages, Games {

	@Override
	public void play() {
		System.out.println("play");
	}

	@Override
	public void pause() {
		System.out.println("pause");		
	}

	@Override
	public void prepareTea() {
		// TODO Auto-generated method stub
		
	}
	
}

class Cat extends Animal {
	@Override
	public Pizza eat() {
		super.eat();
		System.out.println("Cats eat fish");
		return null;
	}
}

class Dog extends Animal {
	public Pizza eat() {
		System.out.println("Dog eats meat");
		return null;
	}
}
public class Demo {

	public static void main(String[] args) {
		Men m = new Men();
		m.eat();
		m.play();
		m.pause();
	}

}
