package programming.practice.abstractfactory;

public class Cola extends Beverage {

    @Override
    public void prepare() {
        System.out.println("콜라 뚜껑 열기");
    }

    @Override
    public void putInCup() {
        System.out.println("콜라 컵에 담기");
    }

}
