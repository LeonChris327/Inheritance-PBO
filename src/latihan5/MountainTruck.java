package latihan5;
public class MountainTruck extends Truck{
  
    public int seatHeight;
   
    public MountainTruck(int startHeight, int startCadence, int startSpeed, int startGear){
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }
    
    public void setHeight(int newValue){
        seatHeight =  newValue;
    }
    
    
    //main method
    public static void main(String [] args){
        System.out.println("mulai Berjalan");
        MountainTruck MB = new MountainTruck(0, 0, 0, 0);
        System.out.println("gear : " + MB.gear);
        System.out.println("speed : "+ MB.speed);
        
        System.out.println("");
        
        MB.setGear(2);
        MB.speedUp(2);
        System.out.println("gear : " + MB.gear);
        System.out.println("speed : "+ MB.speed);
        
        System.out.println("");
        
        MB.speedUp(2);
        System.out.println("gear : " + MB.gear);
        System.out.println("speed : "+ MB.speed);
    }
    
    
}
