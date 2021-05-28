package TugasPraktikum;
public class Main {

    public static void main(String[] args) {
        
        
//objek guru
Guru pakGuru = new Guru("Pak Yanto", "Matematika", 43, "19850723200502");
 pakGuru.info();
        
//objek murid
Murid murid = new Murid("Andi", "X RPL 1", 19, 16, "171807019");
murid.info();
        
//objek karyawan
Karyawan satpam = new Karyawan("Pak Muklis", "Security", 40, "19850723200532");
satpam.info();
        
    }
    
}
