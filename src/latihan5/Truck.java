package latihan5;
public class Truck {
    
    
    public int cadence, gear, speed;
    public Truck(int startCadence, int startSpeed, int startGear){
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
    

    public void setCadence(int cadence) {
        this.cadence = cadence;
    }
    public void setGear(int gear) {
        this.gear = gear;
    }
    public void applybrake(int decrement) {
        speed -= decrement;
    }
    public void speedUp(int increment) {
        this.speed += increment;
    }
    
}
