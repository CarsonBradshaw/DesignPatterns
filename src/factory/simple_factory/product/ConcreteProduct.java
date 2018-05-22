package factory.simple_factory.product;

public class ConcreteProduct implements Product {
    @Override
    public void print() {
        System.out.println("Concrete Product printing...");
    }
}
