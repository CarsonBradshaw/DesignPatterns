package decorator.beverages;

public class HouseBlend extends Beverage {

    public HouseBlend(){
        this.description = "HouseBlend";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return 1.25;
    }
}
