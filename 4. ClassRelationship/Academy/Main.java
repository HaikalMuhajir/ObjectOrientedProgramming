package Academy;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        
        Dosen dosen1 = new Dosen("12345313", "GedaGediGedaO", "S.Kom M.Kom");
        dosen1.displayInfo();
        Dosen dosen2 = new Dosen("12305842", "Paris Pernandez Salam Dari Binjay", "S.Bnjy M.Psg");

        MataKuliah pbo = new MataKuliah("PBO24V", "Pemrograman Berbasis Objek", 2, dosen1);
        pbo.displayInfo();
        MataKuliah web = new MataKuliah("WEB0012", "Pemrograman Web", 3, dosen2);


        Mahasiswa mahasiswa1 = new Mahasiswa("2341760138", "Moch. Haikal Putra Muhajir");
        Nilai nilai1 = new Nilai(pbo, "Pertemuan 1", 1, 100);
        Nilai nilai2 = new Nilai(pbo, "Kuis", 2, 92);
        Nilai nilai3 = new Nilai(pbo, "UTS", 3, 87);
        Nilai nilai4 = new Nilai(pbo, "UAS", 3, 95);
        nilai1.displayInfo();
        
        mahasiswa1.addNilai(pbo.getMataKuliah(), nilai1);
        mahasiswa1.addNilai(pbo.getMataKuliah(), nilai2);
        mahasiswa1.addNilai(pbo.getMataKuliah(), nilai3);
        mahasiswa1.addNilai(pbo.getMataKuliah(), nilai4);

        Nilai nilaiw1 = new Nilai(web, "Pertemuan 1", 1, 75);
        Nilai nilaiw2 = new Nilai(web, "Kuis", 2, 84);
        Nilai nilaiw3 = new Nilai(web, "UTS", 3, 62);
        Nilai nilaiw4 = new Nilai(web, "UAS", 3, 59);

        mahasiswa1.addNilai(web.getMataKuliah(), nilaiw1);
        mahasiswa1.addNilai(web.getMataKuliah(), nilaiw2);
        mahasiswa1.addNilai(web.getMataKuliah(), nilaiw3);
        mahasiswa1.addNilai(web.getMataKuliah(), nilaiw4);

        mahasiswa1.displayAllNilai();

        mahasiswa1.displayInfo();

        System.out.printf("Average PBO: %.2f%n", mahasiswa1.getAvg(pbo.getMataKuliah()));
        System.out.printf("Average WEB: %.2f%n", mahasiswa1.getAvg(web.getMataKuliah()));

        System.out.printf("IPK: %.2f%n", mahasiswa1.getIpk());  
    }
}
