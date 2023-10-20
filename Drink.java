package hw1;

public abstract class Drink extends Product{
    private double volume;
    public Drink(String name, double cost, double volume) {
        super(name, cost);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Bottle{" +
                 "name = " + super.getName() +
                ";volume = " + volume +
                ";cost = " + super.getCost() +
                '}';
    }
}