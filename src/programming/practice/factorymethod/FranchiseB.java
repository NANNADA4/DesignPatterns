package programming.practice.factorymethod;

import programming.practice.factory.CheesePizza;
import programming.practice.factory.ClamPizza;
import programming.practice.factory.PepperoniPizza;
import programming.practice.factory.Pizza;
import programming.practice.factory.VeggiePizza;

public class FranchiseB extends PizzaStore {

    @Override
    protected Pizza createPizza(String name) {
        System.out.println("프랜차이즈B");
        Pizza pizza = null;

        if(name.equals("cheese")) {
            pizza = new CheesePizza();
        } else if(name.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if(name.equals("clam")) {
            pizza = new ClamPizza();
        } else if(name.equals("veggie")) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }
    
}
