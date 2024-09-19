package Academy;

public class MataKuliah {
    private String mataKuliah, kode;
    private int sks;
    private Dosen dosenPengampu;

    MataKuliah(String kode, String mataKuliah, int sks, Dosen dosenPengampu) {
        this.mataKuliah = mataKuliah;
        this.sks = sks;
        this.kode = kode;
        this.dosenPengampu = dosenPengampu;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public int getSks() {
        return sks;
    }

    public Dosen getDosenPengampu() {
        return dosenPengampu;
    }
    public String getKode() {
        return kode;
    }
    public void displayInfo(){
        System.out.println("=============================================================");
        System.out.printf("Mata Kuliah    : %s%n", getMataKuliah());
        System.out.printf("Kode           : %s%n", getKode());
        System.out.printf("Dosen Pengampu : %s%n", getDosenPengampu().getNamaResmi());
        System.out.printf("SKS            : %s%n", getSks());
        System.out.println("=============================================================");
    }
}
