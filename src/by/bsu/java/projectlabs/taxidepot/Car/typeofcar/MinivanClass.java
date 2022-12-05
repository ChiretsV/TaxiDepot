package by.bsu.java.projectlabs.taxidepot.Car.typeofcar;

public class MinivanClass extends EconomyClass {
    public MinivanClass(int prise, int fuelConsumption, String carModel) {

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
        System.out.print(", 7 or more seats for passengers, child seat");
    }

    @Override
    public String toString() {
        return "minivanClass: " +
                getCarModel() +"\t" +
                "prise = " + getPrise() +
                ", fuelConsumption = '" + getFuelConsumption() + '\'' +
                ' ';
    }
}
