public class Employees {
    private String id;
    private String name;
    private double salary;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (salary>0){
        this.salary = salary;
        }
    }
    public void modifySalary(String type,double amt){
        if (type.equalsIgnoreCase("+") || 
        type.equalsIgnoreCase("add")){
            this.salary+=amt;
        }else if(type.equalsIgnoreCase("-") || 
        type.equalsIgnoreCase("sub")){
            if(amt<=this.salary){
                this.salary-=amt;
            }
        }
    }
}
