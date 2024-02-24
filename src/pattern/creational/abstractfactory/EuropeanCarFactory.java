package pattern.creational.abstractfactory;

public class EuropeanCarFactory implements CarFactory{
    @Override
    public Car createCar(){
        return new HetchBack();
    }

    @Override
    public CarSpecification createCarSpecification(){
        return new EuropeanCarSpecification();
    }
}
