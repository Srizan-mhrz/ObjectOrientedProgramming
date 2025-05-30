public class ConstructorJava {
    int a;
    ConstructorJava(){}
    ConstructorJava(int a){
        System.out.println(a+"was passed");
        this.a=a;
    }    
    //another constructor
    ConstructorJava(int a, int b ){
        System.out.println(a+"and "+b+"was passed");
        int sum=a+b;
        this.a=sum;
    }
    //copy constructor
    ConstructorJava(ConstructorJava cons){
        System.out.println("Copy constructor called");
        this.a=cons.a;  
    }
}
class UsingConstructor{
    public static void main(String[]args){
        ConstructorJava obj1= new ConstructorJava();
        ConstructorJava obj2= new ConstructorJava(10);
        ConstructorJava obj3= new ConstructorJava(10,20);
        ConstructorJava obj4= new ConstructorJava(obj2);
    }
}