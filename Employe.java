public class Employe {
    private String name;
    private String job;
    private double salary;

    public Employe(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public double getSalary() {
        return salary;
    }
    
    public double calSal(){
        return this.salary+this.salary*10/100;
    }
}
