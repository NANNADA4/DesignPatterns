package programming.practice.decorator;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        this.description = "다크로스트";
    }

    @Override
    public double cost() {
        return super.cost() + 2.5;
    }

}
