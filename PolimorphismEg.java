//polymorphism- having many forms
//objects of different slasses act like objects from same superclass
public class PolimorphismEg {
    public void add(int a , int b){
        //method overloading-- Compile time polymorphism
        //same name of method but different parameter
        //does not require inheritance
        System.out.println("Called with two parameters");
        System.out.println(a+b);
    }
    public void add(int a , int b , int c){
        System.out.println("called with three parameters");
        System.out.println(a+b+c);
    }
    public void add(String a,int b){

    }
    
}
//Methos overriding-- run time polymorphism
//same method name add parameter
//requires inheritance65
class parent{

    public void greet(){
        System.out.println("Parent says hello");
    }
}
class child extends parent{
    @Override
    public void greet(){
        System.out.println("child says hello");
    }

}
class example{
    public static void main(String[] args) {
        PolimorphismEg poly=new PolimorphismEg();
        poly.add(1,3);
        poly.add(1,2,3);
    }
}