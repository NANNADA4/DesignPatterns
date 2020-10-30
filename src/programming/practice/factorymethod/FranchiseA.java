package programming.practice.factorymethod;

import programming.practice.factory.CheesePizza;
import programming.practice.factory.PepperoniPizza;
import programming.practice.factory.Pizza;

public class FranchiseA extends PizzaStore {

    @Override
    protected Pizza createPizza(String name) {
        System.out.println("프랜차이즈A");
        Pizza pizza = null;

        if(name.equals("cheese")) {
            pizza = new CheesePizza();
        } else if(name.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }

        return pizza;
    }
    
}
