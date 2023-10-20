package hw1;

public class HotDrink extends Drink{
    private double temperature;
    public HotDrink(String name, double cost, double volume, double temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Hot Drink {" +
                 "name = " + super.getName() +
                "   volume = " + super.getVolume() +
                "   cost = " + super.getCost() +
                "   temperature = " + temperature +
                '}';
    }
}
