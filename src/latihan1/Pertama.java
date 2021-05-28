
package latihan1;

public class Pertama {
    
    private int a = 10;
    
    protected void terlindungi(){
        System.out.println("method hanya untuk sub class atau anaknya");
    }
    
    public void info(){
        System.out.println("a = "+a);
        System.out.println("Dipanggil pada = "+this.getClass().getName());
    }
}
