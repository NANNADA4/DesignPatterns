package programming.practice.decorator;

public class Decaf extends Beverage {
    public Decaf() {
        this.description = "디카페인 커피";
    }

    @Override
    public double cost() {
        return 3.5;
    }

}
