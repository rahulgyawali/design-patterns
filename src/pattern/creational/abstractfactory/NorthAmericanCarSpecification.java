package pattern.creational.abstractfactory;

public class NorthAmericanCarSpecification implements CarSpecification{

    @Override
    public void display(){
        System.out.println("This is North American Car Specification");
    }
}
