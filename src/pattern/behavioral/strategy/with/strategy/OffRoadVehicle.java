package pattern.behavioral.strategy.with.strategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle (){
        super(new SportsDriveStrategy());
    }
}
