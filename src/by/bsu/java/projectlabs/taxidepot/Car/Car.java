package by.bsu.java.projectlabs.taxidepot;

public abstract class Car implements Comparable<Car>{
    private int prise;
    private int fuelConsumption;

    private String typeOfCar;

    public int getPrise() {
        return prise;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public Car(int prise, int fuelConsumption) {
        this.prise = prise;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public int compareTo(Car o) {
        return (o.fuelConsumption.compareTo(this.fuelConsumption));
    }
    @Override
    public String toString() {
        return "Car{" +
                "prise=" + prise +
                ", fuelConsumption='" + fuelConsumption + '\'' +
                '}';
    }
}
