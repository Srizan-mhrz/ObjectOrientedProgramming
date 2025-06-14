//process of hiding implementation details and 
//showing only the working feature
//1.Abstract class: 0% to 100% abstraction 
//2.Interface:100% abstraction
abstract class MyLaptop{
    //cannot instantiate abstract class(cannot make object from abstract class)
    public MyLaptop(){
        System.out.println("Laptop class");
    }
    public MyLaptop(int num){
        System.out.println("Laptop class num"+num);
    }
    
    void greet(){
        System.out.println("hello");
    }
    //use abstract keyword to create abstract class
    //and abstract methods in them 
    abstract void printName();// abstract-- no method body
}
class Asus extends MyLaptop{
    public Asus(){
        System.out.println("nana");
    }
    // you can only extenfd one class
    public Asus(int num){
        super(num);
    }

    @Override
    void printName() {
      System.out.println("I am A sus");  
    }}

interface Furniture{
    //only contains method that are abstract
    //only contains constant attributes
    //cannot have constructor 
    void printLength();
}    
interface furniture2 extends Furniture{
    void printHeight();
}
class Table implements furniture2{

    @Override
    public void printHeight() {
    }

    @Override
    public void printLength() {
    }

}
public class Abstraction {
    
    public static void main(String[] args) {
        //MyLaptop laptop= new MyLaptop();-- error cannot instantiate
        Asus myAsus= new Asus();
        myAsus.greet();
        myAsus.printName();
    }
}
