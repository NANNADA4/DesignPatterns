package programming.practice.starategy;

import programming.practice.starategy.behavior.Flyable;
import programming.practice.starategy.behavior.Quackable;
import programming.practice.starategy.behavior.Swimable;

public abstract class Duck {
	protected Quackable quackable;
	protected Flyable flyable;
	protected Swimable swimable;
	
	public void swim() {
		this.swimable.swim();
	}
	
	public void quack() {
		this.quackable.quack();
	}
	
	public void fly() {
		this.flyable.fly();
	}
	
	public abstract void display();
}