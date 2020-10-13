package programming.practice.starategy;

import programming.practice.starategy.behavior.FlyWithWings;
import programming.practice.starategy.behavior.Quack;
import programming.practice.starategy.behavior.SwimWithLegs;

public class MallardDuck extends Duck{
	public MallardDuck() {
		this.quackable = new Quack();
		this.swimable = new SwimWithLegs();
		this.flyable = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("나는야 청둥오리~");
	}

}
