package Abstract_Interfaces;

public class Implenting_Interfaces implements interface1,interface2{

    @Override
    public void startBike() {
        System.out.println("Bike Started!");
    }

    @Override
    public void stopBike() {
        System.out.println("Bike Stopped!");
    }

    @Override
    public void accelerateBike() {
        System.out.println("Accelerated!");
    }

    @Override
    public void refuelBike() {
        System.out.println(" Bike Refueled");
    }

    @Override
    public void startCar() {
        System.out.println("Car started");
    }

    @Override
    public void stopCar() {
        System.out.println("Car Stopped");
    }

    @Override
    public void accelerateCar() {
        System.out.println("Car Accelerated");

    }

    @Override
    public void refuelCar() {
        System.out.println("Car Refueled");

    }
}
