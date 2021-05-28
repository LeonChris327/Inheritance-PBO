package latihan2;
public class Employ extends Person {
    
    
    private String noKaryawan;
    //Konstruktor
    public Employ(String noKaryawan, String nama, int usia){
        
        //eksekusi konstruktor induk dengan parameter nama, usia
        super(nama, usia);
        
        this.noKaryawan = noKaryawan;
    }
    public void info(){
        System.out.println("No. Karyawan : " + this.noKaryawan);
        super.info();
    }
}
