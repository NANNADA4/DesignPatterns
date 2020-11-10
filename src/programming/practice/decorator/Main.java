package programming.practice.decorator;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        System.out.println(beverage.getDescription() + " : " + beverage.cost());

        Beverage caffemocha = new Milk(new Chocolate(new DarkRoast()));
        System.out.println(caffemocha.getDescription() + " : " + caffemocha.cost());
    }
}
