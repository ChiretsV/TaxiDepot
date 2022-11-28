import by.bsu.java.projectlabs.taxidepot.Car.Car;
import by.bsu.java.projectlabs.taxidepot.Car.typeofcar.economyClass;
import by.bsu.java.projectlabs.taxidepot.Car.typeofcar.comfortClass;
import by.bsu.java.projectlabs.taxidepot.Car.typeofcar.businessClass;
import by.bsu.java.projectlabs.taxidepot.Car.typeofcar.minivanClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Car> taxiDepot = new ArrayList<>();

        taxiDepot.add(new economyClass(3000,5));
        taxiDepot.add(new comfortClass(7000,7));
        taxiDepot.add(new businessClass(15000,9));
        taxiDepot.add(new minivanClass(5000,7));
        taxiDepot.add(new economyClass(3500,6));
        taxiDepot.add(new comfortClass(7500,8));
        taxiDepot.add(new businessClass(16000,10));
        taxiDepot.add(new minivanClass(5500,8));
        taxiDepot.add(new economyClass(3200,5));
        taxiDepot.add(new comfortClass(7200,7));
        taxiDepot.add(new businessClass(15500,10));
        taxiDepot.add(new minivanClass(5200,8));
        taxiDepot.add(new economyClass(4000,6));
        taxiDepot.add(new comfortClass(8000,7));
        taxiDepot.add(new businessClass(18000,12));
        taxiDepot.add(new minivanClass(6500,8));

        int commonPrise = 0;
        for (Car cars : taxiDepot) {
            commonPrise += cars.getPrise();
        }
        System.out.println("Common price of taxi depot: " + commonPrise);

        taxiDepot.sort(Car::compareTo);

        System.out.println("Write min consumption");
        int minConsumption = new Scanner(System.in).nextInt();
        System.out.println("Write max consumption");
        int maxConsumption = new Scanner(System.in).nextInt();
        System.out.println("Suitable cars");
        for (Car car : taxiDepot) {
            if (car.getFuelConsumption() >= minConsumption && car.getFuelConsumption() <= maxConsumption) {
                System.out.println(car);
            }
        }
    }
}