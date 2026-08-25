public class Demo{
    public static void main(String[] args)
    {
        car c1 = new FuelCar();
        c1.start();
        car c2 = new ElectricCar();
        c2.start();
    }
}

abstract class car
{
    abstract void start();
    abstract void accelarate();
    abstract void carBreak();
}

class FuelCar extends car
{
    
    @Override
    void start()
    {
        System.out.println("Fuel car starting..");
    }

    @Override
    void carBreak()
    {
        System.out.println("Fuel car carBreak applied");
    }

    @Override
    void accelarate()
    {
        System.out.println("Fuel car accelaration applied");
    }
    
}

class ElectricCar extends car{
    @Override
    void start()
    {
        System.out.println("Electric car is starting");
    }
    

    @Override
    void carBreak()
    {
        System.out.println("Electric car carBreak applied");
    }
    

    @Override
    void accelarate()
    {
        System.out.println("Electric  car accelarate applied");
    }
}