package programming.practice.starategy;

import programming.practice.starategy.behavior.FloatOnWater;
import programming.practice.starategy.behavior.FlyNoWay;
import programming.practice.starategy.behavior.Squeak;

public class RubberDuck extends Duck {
	public RubberDuck() {
		this.quackable = new Squeak();
		this.swimable = new FloatOnWater();
		this.flyable = new FlyNoWay();
	}
	
	@Override
	public void display() {
		System.out.println("나는야 고무오리~");
	}
	
}
