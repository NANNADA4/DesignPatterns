package programming.practice.starategy;

import programming.practice.starategy.behavior.FloatOnWater;
import programming.practice.starategy.behavior.FlyNoWay;
import programming.practice.starategy.behavior.MuteQuack;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		this.quackable = new MuteQuack();
		this.swimable = new FloatOnWater();
		this.flyable = new FlyNoWay();
	}
	
	@Override
	public void display() {
		System.out.println("나는야 가짜오리~");
	}

}
