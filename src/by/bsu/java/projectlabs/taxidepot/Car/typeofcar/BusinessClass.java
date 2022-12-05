package by.bsu.java.projectlabs.taxidepot.Car.typeofcar;

public class BusinessClass extends ComfortClass {

    public BusinessClass(int prise, int fuelConsumption, String carModel) {

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
        System.out.print(", leather interior, coasters, charger for smartphones and tablets");
    }

    @Override
    public String toString() {
        return "businessClass: " +
                getCarModel() + "\t" +
                "prise = " + getPrise() +
                ", fuelConsumption = '" + getFuelConsumption() + '\'' +
                ' ';
    }
}
