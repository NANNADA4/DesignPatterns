package programming.practice.factory;

public class Main {

	public static void main(String[] args) {
		PizzaStore pizzaStore = new PizzaStore();
		
		Pizza pizza = pizzaStore.orderPizza("cheese");
		System.out.println(pizza + "고객 전달\n");
		
		pizza = pizzaStore.orderPizza("greek");
		System.out.println(pizza + "고객 전달\n");
		
		pizza = pizzaStore.orderPizza("pepperoni");
		System.out.println(pizza + "고객 전달\n");
	}

}
