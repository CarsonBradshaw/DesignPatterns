package template_method.templates;

import java.util.Scanner;

public class Tea extends HotBeverageTemplate {

    @Override
    public boolean customerWantsCondiments() {
        System.out.println("Would you like some lemon?");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.next();
        if(response.toLowerCase().equals("yes"))
            return true;
        return false;
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon...");
    }

    @Override
    public void brew() {
        System.out.println("Brewing tea...");
    }
}
