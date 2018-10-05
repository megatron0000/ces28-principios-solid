package depois;

public class Dog extends Animal implements Groomable {
	@Override
	public void feed() {
		System.out.println("Dog feeds");
	}
	
	@Override
	public void groom() {
		System.out.println("Dog grooms");
	}
}
