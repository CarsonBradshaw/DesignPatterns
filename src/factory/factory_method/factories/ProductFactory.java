package factory.factory_method.factories;


import factory.factory_method.products.Product;

public interface ProductFactory {
    Product getProduct(String s);
}
