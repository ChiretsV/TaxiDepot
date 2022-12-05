package by.bsu.java.projectlabs.taxidepot.Car;

public class Car implements Comparable<Car>{
    private int prise;
    private int fuelConsumption;

    private String carModel;

    private String typeOfCar;

    public int getPrise() {
        return prise;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public String getCarModel() {
        return carModel;
    }

    public Car(int prise, int fuelConsumption, String carModel) {
        this.prise = prise;
        this.fuelConsumption = fuelConsumption;
        this.carModel = carModel;
    }

    public void printAdditionalServices(){
        System.out.print("Additional services: ");
    }

    @Override
    public int compareTo(Car o) {
        return (this.fuelConsumption - o.fuelConsumption);
    }

    @Override
    public String toString() {
        return "Car{" +
                "prise=" + prise +
                ", fuelConsumption=" + fuelConsumption +
                ", carModel='" + carModel + '\'' +
                ", typeOfCar='" + typeOfCar + '\'' +
                '}';
    }
}
