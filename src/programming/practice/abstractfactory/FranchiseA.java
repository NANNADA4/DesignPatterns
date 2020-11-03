package programming.practice.abstractfactory;

public class FranchiseA extends PizzaStore {
    public FranchiseA() {
        this.menuFactory = new FranchiseAFactory();
    }
}
