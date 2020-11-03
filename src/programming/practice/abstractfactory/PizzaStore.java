package programming.practice.abstractfactory;

import programming.practice.factory.Pizza;

public abstract class PizzaStore {
    protected MenuFactory menuFactory;

    public Pizza orderPizza(String name) {
        Pizza pizza = this.menuFactory.createPizza(name);
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        return pizza;
    }

    public Beverage ordeBeverage(String name) {
        Beverage beverage = this.menuFactory.createBeverage(name);
        if (beverage != null) {
            beverage.prepare();
            beverage.putInCup();
        }
        return beverage;
    }
}
