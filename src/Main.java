import by.bsu.java.projectlabs.taxidepot.Car.Car;
import by.bsu.java.projectlabs.taxidepot.Car.typeofcar.EconomyClass;
import by.bsu.java.projectlabs.taxidepot.Car.typeofcar.ComfortClass;
import by.bsu.java.projectlabs.taxidepot.Car.typeofcar.BusinessClass;
import by.bsu.java.projectlabs.taxidepot.Car.typeofcar.MinivanClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Car> taxiDepot = new ArrayList<>();

        taxiDepot.add(new EconomyClass(3000,5,"Hyundai Solaris"));
        taxiDepot.add(new ComfortClass(7000,7,"Hyundai i40"));
        taxiDepot.add(new BusinessClass(15000,9,"Mercedes Е-class"));
        taxiDepot.add(new MinivanClass(5000,7,"Mercedes-Benz Viano"));
        taxiDepot.add(new EconomyClass(3500,6,"Ford Focus"));
        taxiDepot.add(new ComfortClass(7500,8,"Skoda Octavia"));
        taxiDepot.add(new BusinessClass(16000,10,"Mercedes S-class"));
        taxiDepot.add(new MinivanClass(5500,8,"Mercedes-Benz Vito"));
        taxiDepot.add(new EconomyClass(3200,5,"Skoda Rapid"));
        taxiDepot.add(new ComfortClass(7200,7,"Volkswagen Jetta"));
        taxiDepot.add(new BusinessClass(15500,10,"Audi A8"));
        taxiDepot.add(new MinivanClass(5200,8,"Citroen Jumpy"));
        taxiDepot.add(new EconomyClass(4000,6,"Volkswagen Polo"));
        taxiDepot.add(new ComfortClass(8000,7,"Kia Optima"));
        taxiDepot.add(new BusinessClass(18000,12,"BMW 5"));
        taxiDepot.add(new MinivanClass(6500,8,"Volkswagen Multivan"));

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
        System.out.println("Suitable cars:");
        for (Car car : taxiDepot) {
            if (car.getFuelConsumption() >= minConsumption && car.getFuelConsumption() <= maxConsumption) {
                System.out.println(car);
            }
        }
    }
}