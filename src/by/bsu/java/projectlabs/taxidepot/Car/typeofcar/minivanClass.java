package by.bsu.java.projectlabs.taxidepot.typeofcar;

import by.bsu.java.projectlabs.taxidepot.Car;

public class minivanClass extends Car {
    public minivanClass(int prise, int fuelConsumption) {
        super(1500, 10);
    }

    @Override
    public int getPrise() {
        return super.getPrise();
    }

    @Override
    public int getFuelConsumption() {
        return super.getFuelConsumption();
    }

    @Override
    public String toString() {
        return "minivanClass{}" +
                "prise=" + getPrise() +
                ", fuelConsumption='" + getFuelConsumption() + '\'' +
                '}';
    }
}
