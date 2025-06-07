class Vehicles {
    public void startEngine(){
        System.out.println("brrr brr engine on");
    }
    public void stopEngine(){
        System.out.println("bututututu engine off");
    }
    
}
class Motorcycle extends Vehicles{
    public void ride(){
        System.out.println("riding the 2 wheeler");
    } 
}

class Car extends Vehicles{
    public void drive(){
        System.out.println("Driving the 4 wheeler");
    } 
}
public class VehiclesRun {
    public static void main(String[] args) {
        Motorcycle m=new Motorcycle();
        Car c=new Car();
        m.startEngine();
        m.ride();
        m.stopEngine();

        c.startEngine();
        c.drive();
        c.stopEngine();
    }
}