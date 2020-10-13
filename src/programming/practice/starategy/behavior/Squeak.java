package programming.practice.starategy.behavior;

public class Squeak implements Quackable {

	@Override
	public void quack() {
		System.out.println("삑! 삑!");
	}

}
