public class Employee {
    private String name;
    private float salary;
    private String position;
    public void setname(String name){
        this.name= name;
    }
    public void setsalary(float salary){
        this.salary= salary;
    }
    public void setposition(String position){
        this.position= position;
    }
    public String getname(){
        return name;
    }
    public float getsalary(){
        return salary;
    }
    public String getposition(){
        return position;
    }

    
}
class EmployeeClass{
    public static void main(String[]args){
        Employee number1= new Employee();
        number1.setname("Shrijan");
        number1.setposition("CEO");
        number1.setsalary(100000000000000.90f);
    }
}