package Adapter;

public class Client {

    public static void main(String[] args) {

        PriceCalculator car = new CarPriceCalculator(20000);
        PriceCalculator truck = new TruckPriceCalculator(40000);
        PriceCalculator ukCar = new Adapter(new UKCarPriceCalculator(30000));

        System.out.println("Car price: " + car.calculatePrice() + " USD");
        System.out.println("Truck price: " + truck.calculatePrice() + " USD");
        System.out.println("UK Car price: " + ukCar.calculatePrice() + " USD");

    }
}