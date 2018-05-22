package factory.factory_method;

import factory.factory_method.factories.ConcreteProductFactoryA;
import factory.factory_method.factories.ConcreteProductFactoryB;
import factory.factory_method.factories.ProductFactory;
import factory.factory_method.products.Product;

public class App {
    public static void main(String[] args) {
        ProductFactory productFactory = new ConcreteProductFactoryA();
        Product productA = productFactory.getProduct("a");
        productA.print();

        productFactory = new ConcreteProductFactoryB();
        Product productB = productFactory.getProduct("b");
        productB.print();
    }
}
