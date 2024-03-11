package pattern.behavioral.strategy.with.strategy;

public class MainClass {
    public static void main(String[] args) {
        Vehicle vehicle = new OffRoadVehicle();
        vehicle.drive();
    }
}
