package programming.practice.factory;

public class PizzaStore {
	public Pizza orderPizza(String pizzaName) {
		Pizza pizza = null;
		
		if(pizzaName.equals("cheese")) {
			pizza = new CheesePizza();
		} else if(pizzaName.equals("greek")) {
			pizza = new GreekPizza();
		} else if(pizzaName.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		}
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
}
