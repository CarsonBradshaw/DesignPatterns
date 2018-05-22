package factory.simple_factory.factory;

import factory.simple_factory.product.ConcreteProduct;
import factory.simple_factory.product.Product;

public class ProductFactory {
    public Product getProduct(String s){
        if(s.equals("concrete"))
            return new ConcreteProduct();
        else
            throw new IllegalArgumentException("Invalid product: " + s);
    }
}
