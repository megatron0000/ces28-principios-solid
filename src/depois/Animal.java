package depois;

public abstract class Animal {
	public abstract void feed();
	
	public static void main(String[] args) {
		Rattlesnake snake = new Rattlesnake();
		Dog dog = new Dog();
		snake.feed();
		// Programmer does not need to remember to avoid next line.
		// The restriction happens now automatically at compile time
		// snake.groom();
		dog.feed();
		dog.groom();
	}
}
