class Animal{
    //when subclass onject is called , at first 
    //non parameterized constructor of parent is called
    //Parent class or super class
    public Animal(){
        System.out.println("animal constructor");
    }
    public Animal(int age){
        System.out.println("animal constructor "+age);
    }
    public void eat(){
        System.out.println("Animal eats");
    }
    public void walk(){
        System.out.println("animal might walk");
    }
}
class Human extends Animal{
    public Human(){
        //to call parent class constructor
        System.out.println("human constructor");
    }
    //child class or subclass

    public void walk(){
        //super keyword is used to call parent class
        super.walk();
        System.out.println("human walks");
    }
}
// public class InheritanceExample {
//     public static void main(String[] args) {
//         Human human1= new Human();
//         human1.eat();
//         human1.walk();
//     }
    
// }


//parent class==bird==fly(), eat()
//subclass== ostrich==printdetails(),fly()
//Eagle printDetails
class Bird{
    public void fly(){
        System.out.println("you can fly");
    }
    public void eat(){
        System.out.println("you will eat");
    }
}
class Ostrich extends Bird{
    public void fly(){
        System.out.println("poor bird cant fly");
    }
    // public void eat(){
    //     System.out.println("eat ghasfus");
    // }
}
class WhiteOstrich extends Ostrich{
    //bird , ostrich 
    //Hierarchial inheritance
}
class Eagle extends Bird{
    // public void fly(){
    //     System.out.println("fly high my bird");
    // }
    // public void eat(){
    //     System.out.println("eat meat");
    // }
}
public class InheritanceExample{
    public static void main(String []args){
        Ostrich o= new Ostrich();
        Eagle e= new Eagle();
        o.fly();
        o.eat();
        e.eat();
        e.fly();

    }
}