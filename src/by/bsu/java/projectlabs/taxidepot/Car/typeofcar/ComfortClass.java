package by.bsu.java.projectlabs.taxidepot.Car.typeofcar;

public class ComfortClass extends EconomyClass {
    public ComfortClass(int prise, int fuelConsumption, String carModel) {

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
        System.out.print(", air conditioner, audio system, power windows");
    }

    @Override
    public String toString() {
        return "comfortClass: " +
                getCarModel() +"\t" +
                "prise = " + getPrise() +
                ", fuelConsumption = '" + getFuelConsumption() + '\'' +
                ' ';
    }
}
