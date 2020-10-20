package programming.practice.factory;

public class PizzaStore {
	private SimplePizzaFactory simplePizzaFactory;

	public PizzaStore() {
		this.simplePizzaFactory = new SimplePizzaFactory();
	}

	public Pizza orderPizza(String pizzaName) {
		Pizza pizza = this.simplePizzaFactory.createPizza(pizzaName);

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
