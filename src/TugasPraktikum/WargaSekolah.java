package TugasPraktikum;

public class WargaSekolah {
    
    protected String nama, status;
    protected int umur;
    
    //konstruktor
    public WargaSekolah(String nama, String status, int umur){
this.nama = nama;
this.status = status;
this.umur = umur;
    }
    
       public void info(){
    System.out.println("Nama : " + this.nama);
    System.out.println("Umur : " + this.umur);
    System.out.println("Status : " + this.status);
    }
}
