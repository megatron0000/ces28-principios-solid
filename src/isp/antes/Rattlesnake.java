package isp.antes;

public class Rattlesnake extends Animal {
	@Override
	public void feed() {
		System.out.println("Snake feeds");
	}
	
	@Override
	public void groom() {
		System.out.println("Tried to groom a snake ! Danger !");
	}
}
