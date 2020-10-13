package programming.practice.starategy;

import programming.practice.starategy.behavior.FlyNoWay;
import programming.practice.starategy.behavior.Quack;
import programming.practice.starategy.behavior.SwimWithLegs;

public class RobotDuck extends Duck {
	public RobotDuck() {
		this.quackable = new Quack();
		this.swimable = new SwimWithLegs();
		this.flyable = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("나는야 로봇오리~");
	}
}
