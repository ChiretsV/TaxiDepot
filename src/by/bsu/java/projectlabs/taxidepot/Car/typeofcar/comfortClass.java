package by.bsu.java.projectlabs.taxidepot.typeofcar;

import by.bsu.java.projectlabs.taxidepot.Car;

public class comfortClass extends Car {
    public comfortClass(int prise, int fuelConsumption) {
        super(10000, 8);
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
        return "comfortClass{}" +
                "prise=" + getPrise() +
                ", fuelConsumption='" + getFuelConsumption() + '\'' +
                '}';
    }
}
