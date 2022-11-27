package by.bsu.java.projectlabs.taxidepot.typeofcar;

import by.bsu.java.projectlabs.taxidepot.Car;

public class businessClass extends Car {

    public businessClass(int prise, int fuelConsumption) {
        super(100000, 10);
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
        return "businessClass{}" +
                "prise=" + getPrise() +
                ", fuelConsumption='" + getFuelConsumption() + '\'' +
                '}';
    }
}
