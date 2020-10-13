package programming.practice.starategy;

import programming.practice.starategy.behavior.FlyWithWings;
import programming.practice.starategy.behavior.Quack;
import programming.practice.starategy.behavior.SwimWithLegs;

public class RedheadDuck extends Duck {
	public RedheadDuck() {
		this.quackable = new Quack();
		this.swimable = new SwimWithLegs();
		this.flyable = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("나는야 아메리카흰죽지~");
	}

}
