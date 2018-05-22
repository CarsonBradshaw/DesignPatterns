package factory.factory_method.factories;

import factory.factory_method.products.ConcreteProductA;
import factory.factory_method.products.Product;

public class ConcreteProductFactoryA implements ProductFactory {
    @Override
    public Product getProduct(String s){
        if(s.equals("a"))
            return new ConcreteProductA();
        else
            throw new IllegalArgumentException("Invalid product a: " + s);
    }
}
