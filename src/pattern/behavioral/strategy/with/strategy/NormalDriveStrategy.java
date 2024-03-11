package pattern.behavioral.strategy.with.strategy;

public class NormalDriveStrategy implements DriveStrategy{

    @Override
    public void drive(){
        System.out.println("Normal drive capability");
    }
}
