package programming.practice.decorator;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        super(beverage);
        this.description = ", 휘핑 크림 추가";
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + this.description;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.5;
    }

}
