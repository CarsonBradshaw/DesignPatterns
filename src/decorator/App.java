package decorator;

import decorator.beverages.Beverage;
import decorator.beverages.DarkRoast;
import decorator.beverages.HouseBlend;
import decorator.beverages.decorators.Spice;
import decorator.beverages.decorators.Whip;

public class App {
    public static void main(String[] args) {
        Beverage darkRoastWithWhip = new Whip(new DarkRoast());
        System.out.println(darkRoastWithWhip.cost());
        System.out.println(darkRoastWithWhip.getDescription());
        System.out.println();

        Beverage houseBlendWithSpiceAndWhip = new Spice(new Whip(new HouseBlend()));
        System.out.println(houseBlendWithSpiceAndWhip.cost());
        System.out.println(houseBlendWithSpiceAndWhip.getDescription());
        System.out.println();
    }
}
