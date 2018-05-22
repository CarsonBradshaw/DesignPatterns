package factory.simple_factory;

import factory.simple_factory.factory.ProductFactory;
import factory.simple_factory.product.Product;

public class App {
    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();
        Product product = productFactory.getProduct("concrete");
        product.print();
    }
}
