package programming.practice.abstractfactory;

import programming.practice.factory.CheesePizza;
import programming.practice.factory.Pizza;
import programming.practice.factory.VeggiePizza;

public class FranchiseAFactory implements MenuFactory {

    @Override
    public Beverage createBeverage(String name) {
        Beverage beverage = null;

        if (name.equals("coffee")) {
            beverage = new Coffee();
        } else if (name.equals("cola")) {
            beverage = new Cola();
        }
        return beverage;
    }

    @Override
    public Pizza createPizza(String name) {
        Pizza pizza = null;

        if (name.equals("veggie")) {
            pizza = new VeggiePizza();
        } else if (name.equals("cheese")) {
            pizza = new CheesePizza();
        }
        return pizza;
    }

}
