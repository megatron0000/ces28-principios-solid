package isp.antes;

public abstract class Animal {
	public abstract void feed();
	public abstract void groom();
	
	public static void main(String[] args) {
		Rattlesnake snake = new Rattlesnake();
		Dog dog = new Dog();
		snake.feed();
		// Explicitly avoid next line ! A snake should not be groomed !
		// snake.groom();
		dog.feed();
		dog.groom();
	}
}
