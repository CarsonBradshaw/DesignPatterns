package template_method.templates;

public abstract class HotBeverageTemplate {

    public final void createBeverage(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()) //hook
            addCondiments();
        serveUpBeverage();
    }

    abstract void addCondiments();
    abstract void brew();

    public boolean customerWantsCondiments(){
        return true;
    }

    public void boilWater(){
        System.out.println("Boiling water...");
    }

    public void pourInCup(){
        System.out.println("Pouring into cup...");
    }

    public void serveUpBeverage(){
        System.out.println("Here's your drink!");
    }
}
