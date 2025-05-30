public class Circle {

    double radius;
    public void Circle_class(double radius){
        this.radius= radius;
    }

public double getRadius(){
    return this.radius;
}

public void setRadius(double radius){
    this.radius=radius;
}

public double area(){
    return (this.radius)*(this.radius)*22/7;
}
public double circumference(){
    return this.radius*2*22/7;
}
    
}
class execute{
    public static void main(String[] args) {
        Circle c=new Circle();
        c.setRadius(7);
        System.out.println("the area is :"+c.area());
        System.out.println("the circumference is :"+c.circumference());
}

}