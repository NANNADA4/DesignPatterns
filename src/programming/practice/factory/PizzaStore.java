package programming.practice.factory;

public class PizzaStore {

	public Pizza orderPizza(String pizzaName) {
		Pizza pizza = SimplePizzaFactory.createPizza(pizzaName);

		if(pizza == null) {
			return null;
		}
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
}
