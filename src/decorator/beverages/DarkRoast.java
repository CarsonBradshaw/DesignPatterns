package decorator.beverages;

public class DarkRoast extends Beverage{

    public DarkRoast(){
        this.description = "DarkRoast";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return 1.00;
    }
}
