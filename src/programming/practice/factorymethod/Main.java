package programming.practice.factorymethod;

import programming.practice.factory.Pizza;

public class Main {
    public static void main(String[] args) {
        //프랜차이즈 A
        PizzaStore pizzaStore = new FranchiseA();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println(pizza + "고객 전달\n");

        pizza = pizzaStore.orderPizza("pepperoni");
        System.out.println(pizza + "고객 전달\n");

        pizza = pizzaStore.orderPizza("clam");
        System.out.println(pizza + "고객 전달\n");

        pizza = pizzaStore.orderPizza("veggie");
        System.out.println(pizza + "고객 전달\n");

        //프랜차이즈 B
        pizzaStore = new FranchiseB();
        pizza = pizzaStore.orderPizza("cheese");
        System.out.println(pizza + "고객 전달\n");

        pizza = pizzaStore.orderPizza("pepperoni");
        System.out.println(pizza + "고객 전달\n");

        pizza = pizzaStore.orderPizza("clam");
        System.out.println(pizza + "고객 전달\n");
        
        pizza = pizzaStore.orderPizza("veggie");
        System.out.println(pizza + "고객 전달\n");
    }
}