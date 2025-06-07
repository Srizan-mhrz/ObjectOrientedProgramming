class Employ {
    
    public void work() {
        System.out.println("Employee is working.");
    }

    
    public double getSalary() {
        return 60000.00; 
    }
}


class HRManager extends Employ {
    
    @Override
    public void work() {
        System.out.println("HR Manager is managing recruitment and employee relations.");
    }
}


public class EmployeeMain {
    public static void main(String[] args) {
       
        Employ emp = new Employ();
        emp.work();
        System.out.println("Employee Salary: $" + emp.getSalary());

       
        HRManager hr = new HRManager();
        hr.work(); 
        System.out.println("HR Manager Salary: $" + hr.getSalary()); // Inherited method
    }
}