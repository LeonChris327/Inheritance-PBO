package TugasPraktikum;

public class Guru extends WargaSekolah{
    protected String Bidang;
    private String NIP;
    //konstruktor
    public Guru(String nama, String Bidang, int umur, String NIP){
        super(nama, "Guru", umur);
        this.Bidang = Bidang;
        this.NIP = NIP;
    }

    public String getNIP() {
        return NIP;
    }
    
    //overide metod
    @Override
    public void info(){
        System.out.println("======== Info Guru ========");//hiasan
        
        //calling method from superclass
        super.info();
        
        System.out.println("Bidang Keahlian : " + Bidang);
        System.out.println("NIP : " + getNIP());
        System.out.println("================\n");
    }
    
}
