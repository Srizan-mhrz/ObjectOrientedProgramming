public class Vehicle {
    //private attributes
    private String name;
    private String EngineNumber;
    private int wheels;
    private String body;
    //public methods
    public Vehicle
        (String name, String EngineNumber, int wheels, String body){
            this.name=name;
            this.EngineNumber=EngineNumber;
            this.wheels=wheels;
            this.body=body;
        }
        public void setName(String name){
            this.name=name;
        }
        public String getName(){
            return name;
        }
        public void setenginenumber(String EngineNumber){
            this.EngineNumber=EngineNumber;
        }
        public String getenginenumber(){
            return EngineNumber;
        }
        public void setwheels(int wheels){
            this.wheels=wheels;
        }
        public int getwheels(){
            return wheels;
        }
        public void setbody(String body){
            this.body=body;
        }
        public String getbody(){
            return body;
        }
    
}
