package Academy;

public class Nilai {
    private MataKuliah mataKuliah;
    private String namaNilai;
    private double bobotNilai, nilai;

    Nilai(MataKuliah mataKuliah, String namaNilai, double bobotNilai, double nilai) {
        this.mataKuliah = mataKuliah;
        this.namaNilai = namaNilai;
        this.bobotNilai = bobotNilai;
        this.nilai = nilai;
    }

    public void setBobotNilai(double bobotNilai) {
        this.bobotNilai = bobotNilai;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public void setNamaNilai(String namaNilai) {
        this.namaNilai = namaNilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

    public double getBobotNilai() {
        return bobotNilai;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public String getNamaNilai() {
        return namaNilai;
    }

    public double getNilai() {
        return nilai;
    }

    public void displayInfo() {
        System.out.printf("Mata Kuliah    : %s%n", getMataKuliah().getMataKuliah());
        System.out.printf("Dosen Pengampu : %s%n", getMataKuliah().getDosenPengampu().getNamaResmi());
        System.out.printf("Nama Nilai     : %s%n", getNamaNilai());
        System.out.printf("Nilai          : %.2f%n", getNilai());
        System.out.printf("Bobot Nilai    : %.2f%n", getBobotNilai());
    }
}
