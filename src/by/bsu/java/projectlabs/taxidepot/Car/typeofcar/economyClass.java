package by.bsu.java.projectlabs.taxidepot.typeofcar;

import by.bsu.java.projectlabs.taxidepot.Car;

public class economyClass extends Car {
    public economyClass(int prise, int fuelConsumption) {
        super(1000, 5);
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
        return "economyClass{}" +
                "prise=" + getPrise() +
                ", fuelConsumption='" + getFuelConsumption() + '\'' +
                '}';
    }
}

