package programming.practice.abstractfactory;

import programming.practice.factory.Pizza;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new FranchiseA();
        Pizza pizza = pizzaStore.orderPizza("veggie");
        Beverage beverage = pizzaStore.ordeBeverage("coffee");
        System.out.println(pizza + "고객 전달");
        System.out.println(beverage + "고객 전달\n");

        pizzaStore = new FranchiseB();
        pizza = pizzaStore.orderPizza("pepperoni");
        beverage = pizzaStore.ordeBeverage("soju");
        System.out.println(pizza + "고객 전달");
        System.out.println(beverage + "고객 전달\n");
    }
}
