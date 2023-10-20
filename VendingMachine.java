package hw1;

public interface VendingMachine {
    Product getProduct(String name);

    Product getProduct(String name, double volume);

    Product getProduct(String name, double volume, double temperature);

    Product getProduct (double volume, double temperature);
}
