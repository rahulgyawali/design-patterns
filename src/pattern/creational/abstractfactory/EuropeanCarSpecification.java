package pattern.creational.abstractfactory;

public class EuropeanCarSpecification implements CarSpecification{
    @Override
    public void display(){
        System.out.println("This is European Car Specification");
    }
}
