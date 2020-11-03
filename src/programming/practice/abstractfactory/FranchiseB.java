package programming.practice.abstractfactory;

public class FranchiseB extends PizzaStore {
    public FranchiseB() {
        this.menuFactory = new FranchiseBFactory();
    }
}
