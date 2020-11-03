package programming.practice.abstractfactory;

public class Soju extends Beverage {

    @Override
    public void prepare() {
        System.out.println("소주랑 소주컵 준비");
    }

    @Override
    public void putInCup() {

    }

}
