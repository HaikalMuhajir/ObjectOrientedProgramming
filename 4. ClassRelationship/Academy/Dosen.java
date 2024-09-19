package Academy;

public class Dosen {
    private String nip, nama, gelar;

    Dosen(String nip, String nama, String gelar) {
        this.nip = nip;
        this.nama = nama;
        this.gelar = gelar;
    }

    public String getGelar() {
        return gelar;
    }

    public String getNama() {
        return nama;
    }

    public String getNamaResmi() {
        return nama + " " + gelar;
    }

    public String getNip() {
        return nip;
    }

    public void setGelar(String gelar) {
        this.gelar = gelar;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void displayInfo() {
        System.out.println("=============================================================");
        System.out.printf("NIP         : %s%n", getNip());
        System.out.printf("Nama        : %s%n", getNamaResmi());
        System.out.println("=============================================================");
    }

    
}
