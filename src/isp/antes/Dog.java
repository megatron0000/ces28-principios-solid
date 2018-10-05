package isp.antes;

public class Dog extends Animal {
	@Override
	public void feed() {
		System.out.println("Dog feeds");
	}
	
	@Override
	public void groom() {
		System.out.println("Dog grooms");
	}
}
