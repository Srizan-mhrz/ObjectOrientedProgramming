public class Car {
    private String make;
    private String model;
    private double rentPrice;
    private boolean track=true;
    public Car(String make, String model, double rentPrice) {
        this.make = make;
        this.model = model;
        this.rentPrice = rentPrice;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }

    public double getRentPrice() {
        return rentPrice;
    }
    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }
    public boolean isTrack() {
        return track;
    }
    public void setTrack(boolean track) {
        this.track = track;
    }
    
    public void returnCar(){
        if (!this.track){
            this.track=true;
            System.out.println("car returned");
        }else {
            System.out.println("car was not borrowed");
        }
    }
    public void borrowCar(){
        if (track){
            this.track=false;
            System.out.println("car borrowed");
        }else {
            System.out.println("car not available");
        }
        }
}