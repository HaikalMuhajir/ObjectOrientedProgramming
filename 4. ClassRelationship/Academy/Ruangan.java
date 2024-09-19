package Academy;
import java.util.ArrayList;

public class Ruangan {  
    private String kode;
    private int ukuran;
    private ArrayList<String> peralatan;
        Ruangan(String kode, int ukuran){
            this.kode = kode;
            this.ukuran = ukuran;
        }
        Ruangan(String kode, int ukuran, ArrayList<String> peralatan){
            this.kode = kode;
            this.ukuran = ukuran;
            this.peralatan = peralatan;
        }
        public void setKode(String kode) {
            this.kode = kode;
        }
        public void setUkuran(int ukuran) {
            this.ukuran = ukuran;
        }
        public void addPeralatan(String alat){
            peralatan.add(alat);
        }
        public void setPeralatan(ArrayList<String> peralatan) {
            this.peralatan = peralatan;
        }
        public String getKode() {
            return kode;
        }
        public ArrayList<String> getPeralatan() {
            return peralatan;
        }
        public int getUkuran() {
            return ukuran;
        }
        public void displayInfo(){
            System.out.println("=============================================================");
            System.out.printf("Kode      : %s%n", getKode());
            System.out.printf("Ukuran    : %dm^2%n", getUkuran());
            System.out.println("Peralatan : ");
            for (String alat : getPeralatan()) {
                System.out.println("            - " + alat);
            }
            System.out.println("=============================================================");         
        }
}
