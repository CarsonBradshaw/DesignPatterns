package decorator.beverages.decorators;

import decorator.beverages.Beverage;

public class Spice extends BeverageDecorator {

    public Spice(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return "Spice " + beverage.getDescription();
    }
}
