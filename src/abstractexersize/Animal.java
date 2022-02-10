package abstractexersize;

public abstract class Animal {
	String picture;
	String food;
	String hunger;
	String boundaries;
	String location;
	
	abstract void makeNoise();
	abstract void eat();
	abstract void sleep();
	abstract void roam();
}
