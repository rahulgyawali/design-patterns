package pattern.creational.abstractfactory;

public class FactoryClient {

    public static void main(String[] args) {
        CarFactory carFactory = new NorthAmericanCarFactory();
        Car car = carFactory.createCar();
        CarSpecification carSpecification = carFactory.createCarSpecification();
        car.assemble();
        carSpecification.display();
    }
}
