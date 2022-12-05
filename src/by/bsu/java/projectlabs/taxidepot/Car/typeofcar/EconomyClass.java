package by.bsu.java.projectlabs.taxidepot.Car.typeofcar;

import by.bsu.java.projectlabs.taxidepot.Car.Car;

public class EconomyClass extends Car {
    public EconomyClass(int prise, int fuelConsumption, String carModel) {

        super(prise, fuelConsumption,carModel);
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
    public void printAdditionalServices() {
        super.printAdditionalServices();
        System.out.print("Airbags");
    }

    @Override
    public String toString() {
        return "economyClass: " +
                getCarModel() +"\t" +
                "prise = " + getPrise() +
                ", fuelConsumption = '" + getFuelConsumption() + '\'' +
                ' ';
    }
}

