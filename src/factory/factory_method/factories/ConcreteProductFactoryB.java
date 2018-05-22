package factory.factory_method.factories;

import factory.factory_method.products.ConcreteProductB;
import factory.factory_method.products.Product;

public class ConcreteProductFactoryB implements ProductFactory {
    @Override
    public Product getProduct(String s) {
        if(s.equals("b"))
            return new ConcreteProductB();
        else
            throw new IllegalArgumentException("Invalid product b: " + s);
    }
}
