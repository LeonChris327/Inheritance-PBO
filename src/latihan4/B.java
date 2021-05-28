package latihan4;
public class B extends A{
    
    
    private int b;
    
    public void setB(int nilai){
        b = nilai;
    }
   
    public int getB(){
        return b;
    }
    //override terhadap method tampilkanNilai di A
    public void tampilkanNilai(){
        System.out.println("Nilai b : "+getB());
    }
}
