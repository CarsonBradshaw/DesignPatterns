package template_method.templates;

public class Coffee extends HotBeverageTemplate {

    @Override
    void addCondiments() {
        System.out.println("Adding milk and sugar...");
    }

    @Override
    void brew() {
        System.out.println("Brewing coffee...");
    }
}
