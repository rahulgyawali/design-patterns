package pattern.behavioral.strategy.with.strategy;

public class Vehicle {
    DriveStrategy driveStrategy;
    Vehicle (DriveStrategy strategy){
        this.driveStrategy = strategy;
    }
    public void drive(){
        driveStrategy.drive();
    }
}
