package programming.practice.starategy.behavior;

public class FloatOnWater implements Swimable {

	@Override
	public void swim() {
		System.out.println("둥둥 떠다니는 중...");
	}

}