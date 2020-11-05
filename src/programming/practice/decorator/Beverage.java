package programming.practice.decorator;

public abstract class Beverage {
    protected String description;
    protected boolean milk;
    protected boolean chocolate;
    protected boolean whip;
    protected boolean caramel;

    public String getDescription() {
        return this.description;
    }

    public double cost() {
        double result = 0.0;
        if (this.milk) {
            result += 1.5;
        }
        if (this.chocolate) {
            result += 1.0;
        }
        if (this.whip) {
            result += 0.5;
        }
        if (this.caramel) {
            result += 0.9;
        }
        return result;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean isChocolate() {
        return chocolate;
    }

    public void setChocolate(boolean chocolate) {
        this.chocolate = chocolate;
    }

    public boolean isWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }

    public boolean isCaramel() {
        return caramel;
    }

    public void setCaramel(boolean caramel) {
        this.caramel = caramel;
    }

}
