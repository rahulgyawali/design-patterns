package pattern.creational.abstractfactory;

public class NorthAmericanCarFactory implements CarFactory{
    @Override
    public Car createCar(){
        return new Sedan();
    }

    @Override
    public CarSpecification createCarSpecification(){
        return new NorthAmericanCarSpecification();
    }
}
