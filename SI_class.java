public class SI_class {
    double principle;
    double time;
    double rate;

    public void setPrinciple(double a){
        this.principle=a;
    }

    public void setTime(double a){
        this.time=a;
    }
    
    public void setRate(double a){
        this.rate=a;
    }

    public double getPrinciple(){
        return this.principle;
    }
    
    public double getTime(){
        return this.time;
    }
    
    public double getRate(){
        return this.rate;
    }
}
class execute{
    public static void main(String[] args){
        SI_class c=new SI_class();
        c.setPrinciple(100000);
        c.setTime(2.5);
        c.setRate(10);
        System.out.println("principle:"+c.getPrinciple());
        System.out.println("time:"+c.getTime());
        System.out.println("Rate"+c.getRate());
    }
}