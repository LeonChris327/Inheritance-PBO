
package TugasPraktikum;

public class Karyawan extends WargaSekolah{
    
    protected String keahlian;
    private String NIP;

    public Karyawan(String nama, String keahlian, int umur, String NIP) {
        super(nama, "Staff Karyawan", umur);
        this.keahlian = keahlian;
        this.NIP = NIP;
    }
    
    public String getNIP() {
        return NIP;
    }
    //overide info metod
    @Override
    public void info(){
        System.out.println("======== Info Karyawan ========");//hiasan
        
        //calling method from superclass
        super.info();
        
        System.out.println("Staff : " + keahlian);
        System.out.println("NIP : " + getNIP());
        System.out.println("================\n");
    }
}
