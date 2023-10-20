package hw1;

import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine{
    List<HotDrink> drinks;

    public HotDrinkVendingMachine(List<HotDrink> products) {
        this.drinks = products;
    }

    public List<HotDrink> getHotDrinks() {
        return drinks;
    }

    public void setHotDrinks(List<HotDrink> drinks) {
        this.drinks = drinks;
    }

    @Override
    public Product getProduct(String name) {
        for (Drink item : drinks) {
            if(item.getName().equals(name))
                return item;
        }
        return null;
    }

    @Override
    public Product getProduct(String name, double volume){
        for (Drink bottle : drinks) {
            if(bottle.getName().equals(name) && bottle.getVolume() == volume)
                return bottle;
        }
        return null;
    }

    @Override
    public Product getProduct(String name, double volume, double temperature){
        for (HotDrink bottle : drinks) {
            if(bottle.getName().equals(name) && bottle.getVolume() == volume && bottle.getTemperature() == temperature)
                return bottle;
        }
        return null;
    }

    @Override
    public Product getProduct (double volume, double temperature){
        for (HotDrink bottle : drinks) {
            if(bottle.getVolume() == volume && bottle.getTemperature() == temperature)
                return bottle;
        }
        return null;
    }

    public void addHotDrink(HotDrink bottle){
        this.drinks.add(bottle);
    }
}