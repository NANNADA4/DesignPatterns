package programming.practice.factory;

public class GreekPizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("그리스 피자 준비~");
	}

}
