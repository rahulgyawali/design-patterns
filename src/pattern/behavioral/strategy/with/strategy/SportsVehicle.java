package pattern.behavioral.strategy.with.strategy;

public class SportsVehicle extends Vehicle {
    SportsVehicle(){
        super(new SportsDriveStrategy());
    }
}
