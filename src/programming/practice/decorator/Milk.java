package programming.practice.decorator;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
        this.description = ", 우유 추가";
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + this.description;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 1.5;
    }

}
