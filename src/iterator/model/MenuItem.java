package iterator.model;

public class MenuItem {
    private final String name;
    private final boolean vegetarian;
    private final float price;

    public MenuItem(String name, boolean vegetarian, float price){
        this.name = name;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", vegetarian=" + vegetarian +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public float getPrice() {
        return price;
    }
}
