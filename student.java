public class student{
    String name;
    int age;
    int studentID;
    public void printDetails(){
        System.out.println(name+age+studentID);
    }
}
class Implementation{
    public static void main(String[]args)
    {
        student student1= new student();
        student1.name="John";
        student1.age=20;
        student1.studentID=12345;
        student1.printDetails();
    }
}