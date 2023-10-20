package hw1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HotDrinkVendingMachine hotVendingMachine = new HotDrinkVendingMachine(new ArrayList<>());
        hotVendingMachine.addHotDrink(new HotDrink("black coffee", 100, 50, 50));
        hotVendingMachine.addHotDrink(new HotDrink("latte", 200, 300, 80));
        hotVendingMachine.addHotDrink(new HotDrink("americano", 80, 400, 60));
        hotVendingMachine.addHotDrink(new HotDrink("cacao", 120, 300, 60));
        hotVendingMachine.addHotDrink(new HotDrink("green tea", 100, 500, 70));
        hotVendingMachine.addHotDrink(new HotDrink("black tea", 150, 500, 80));
        hotVendingMachine.addHotDrink(new HotDrink("cappucino", 170, 200, 80));
        hotVendingMachine.addHotDrink(new HotDrink("red tea", 200, 200, 70));

        for (HotDrink b : hotVendingMachine.getHotDrinks()) {
            System.out.println(b);
        }

        System.out.println();
        System.out.println(hotVendingMachine.getProduct(300, 80));
        System.out.println(hotVendingMachine.getProduct("black tea", 500, 80));
        
    }

}