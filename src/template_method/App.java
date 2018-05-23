package template_method;

import template_method.templates.Coffee;
import template_method.templates.HotBeverageTemplate;
import template_method.templates.Tea;

public class App {
    public static void main(String[] args) {
        HotBeverageTemplate coffee = new Coffee();
        HotBeverageTemplate tea = new Tea();

        coffee.createBeverage();
        System.out.println();
        tea.createBeverage();
    }
}
