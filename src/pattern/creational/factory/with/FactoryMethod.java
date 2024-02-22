package pattern.creational.factory.with;

enum VehicleType{
    Vehicle_Two_Wheeler,
    Vehicle_Three_Wheeler,
    Vehicle_Four_Wheeler
}

abstract class Vehicle{
    public abstract void printVehicle();
}

class TwoWheeler extends Vehicle {
    public void printVehicle(){
        System.out.println("Two Wheeler");
    }
}

class ThreeWheeler extends Vehicle {
    public void printVehicle(){
        System.out.println("Three Wheeler");
    }
}

class FourWheeler extends Vehicle {
    public void printVehicle(){
        System.out.println("Four Wheeler");
    }
}

class VehicleFactory {
    Vehicle build(VehicleType vehicleType){
        if(VehicleType.Vehicle_Two_Wheeler.compareTo(vehicleType) == 0){
            return new TwoWheeler();
        } else if(VehicleType.Vehicle_Three_Wheeler.compareTo(vehicleType) == 0){
            return new ThreeWheeler();
        }else if(VehicleType.Vehicle_Four_Wheeler.compareTo(vehicleType) == 0){
            return new FourWheeler();
        }
        return null;
    }
}

class Client {
    private Vehicle vehicle;
    public Client(){
        vehicle = null;
    }
    public void buildVehicle(VehicleType vehicleType){
        VehicleFactory vehicleFactory = new VehicleFactory();
        vehicle = vehicleFactory.build(vehicleType);
    }
    public Vehicle getVehicle(){
        return vehicle;
    }
}

public class FactoryMethod {
    public static void main(String args[]){
        Client client = new Client();
        client.buildVehicle(VehicleType.Vehicle_Four_Wheeler);
        Vehicle vehicle = client.getVehicle();
        vehicle.printVehicle();
    }

}
