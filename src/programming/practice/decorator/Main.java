package programming.practice.decorator;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        System.out.println(beverage.getDescription() + " : " + beverage.cost());

        beverage = new DarkRoast();
        beverage.setMilk(true);
        beverage.setChocolate(true);
        System.out.println(beverage.getDescription() + " : " + beverage.cost());

        beverage = new Decaf();
        beverage.setWhip(true);
        System.out.println(beverage.getDescription() + " : " + beverage.cost());

        beverage = new Espresso();
        System.out.println(beverage.getDescription() + " : " + beverage.cost());
    }
}
