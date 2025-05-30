// public class RecapOop {
//     //access modifier classname{
//     //class body
//     //}
// private 
// public
// default
// protected


// }

public class laptop{
    private String model;
    private String color;
    private double price;
    public laptop(){
        //non parameterized constuctor
        System.out.println("constructor for laptop class");
    }
    public laptop(String model){
        //parameterized constructor
        System.out.println(model+"constuctor");
    }
    public laptop(String model,String color, double price){
        this.model=model;
        this.color=color;
        this.price=price;
        System.out.println(model+color+price);
    }
    public void setmodel(String model){
        this.model=model;
    }
    public String getmodel(){
        return model;
    }
    public void setcolor(String color){
        this.color=color;
    }
    public String getcolor(){
        return color;
    }
    public void setprice(double price){
        this.price= price;
    }
    public double getprice(){
        return price;
    }
    //one app closeApp turnOn turnOff
    // public void openApp(){}
    // public void closeApp(){}
    // public void turnOn (){}
    // public void turnOff(){}

}

class DriverClass{
    public static void main(String[]args){
        laptop vivobook= new laptop();
        // vivobook.color="Black";
        // vivobook.model="Asus VivoBook";
        // vivobook.price=3399900.8;
        //private bata output lera aune
        vivobook.setmodel("Asus vivobook");
        System.out.println(vivobook.getmodel());
        //here
        //identity--name--vivobook
        //property -- attribute -- price, model, color
        //behaviour-- method --
        //method calll garne
    //     vivobook.openApp();
    //     vivobook.closeApp();
    //     vivobook.turnOn();
    //     vivobook.turnOff();
    }
}
class LaptopDriver{
    public static void main (String[]args){
        int a;
        laptop acer=new laptop();
        laptop hp= new  laptop("hp");
        laptop dell= new laptop("hp","white",5999.8);
        acer.setmodel("Acer");
        String val=acer.getmodel();
        //laptop asus= new laptop("asus","black")//thsi doesn't run because we haven't made constructor with two parameters
    }
}   