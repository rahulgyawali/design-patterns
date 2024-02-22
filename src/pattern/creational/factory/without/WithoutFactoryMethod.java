package pattern.creational.factory.without;

/**Without Factory Method**/
abstract class Vehicle{
    public abstract void printVehicle();
}

class TwoWheeler extends Vehicle{
    public void printVehicle(){
        System.out.println("Two Wheeler");
    }
}

class ThreeWheeler extends Vehicle{
    public void printVehicle(){
        System.out.println("Three Wheeler");
    }
}

class Client{
    private Vehicle vehicle;

    public Client(int type){
        if(type == 1){
            vehicle = new TwoWheeler();
        }else if(type == 2){
            vehicle = new ThreeWheeler();
        }else{
            vehicle = null;
        }
    }

    public Vehicle getVehicle(){
        return vehicle;
    }
}
public class WithoutFactoryMethod {
    public static void main(String args[]){
        Client client = new Client(1);
        Vehicle vehicle = client.getVehicle();
        vehicle.printVehicle();
    }
}
