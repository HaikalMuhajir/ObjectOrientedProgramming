package Academy;
import java.util.ArrayList;
import java.util.Hashtable;

public class Mahasiswa {
    private String nim, nama;
    private Hashtable<String, ArrayList<Nilai>> nilai;

    Mahasiswa(String nim, String nama){
        this.nim = nim;
        this.nama = nama;
        this.nilai = new Hashtable<>();
    }

    public void addNilai(String mk, Nilai n){
        nilai.putIfAbsent(mk, new ArrayList<>());
        nilai.get(mk).add(n);
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public Hashtable<String, ArrayList<Nilai>> getNilai() {
        return nilai;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getAvg(String mk) {
        ArrayList<Nilai> nilaiList = nilai.get(mk);
        if (nilaiList == null || nilaiList.isEmpty()) {
            return 0.0;
        }
    
        double totalNilaiBerbobot = 0;
        double totalBobot = 0;
        for (Nilai n : nilaiList) {
            totalNilaiBerbobot += (n.getNilai() * n.getBobotNilai());
            totalBobot += n.getBobotNilai();
        }
    
        return totalBobot > 0 ? totalNilaiBerbobot / totalBobot : 0.0;
    }
    

    public double getIpk() {
        double totalNilaiBerbobot = 0;
        int totalSks = 0;

        for (String mk : nilai.keySet()) {
            ArrayList<Nilai> nilaiList = nilai.get(mk);
            if (!nilaiList.isEmpty()) {
                Nilai n = nilaiList.get(0);  
                int sks = n.getMataKuliah().getSks();  

                totalNilaiBerbobot += (getNilaiBobot(getAvg(mk)) * sks);
                totalSks += sks;
            }
        }

        double ipk = (totalSks > 0) ? totalNilaiBerbobot / totalSks : 0.0;
        return ipk;
    }
    
    public void displayInfo(){
        System.out.println("=============================================================");
        System.out.printf("NIM         : %s%n", getNim());
        System.out.printf("Nama        : %s%n", getNama());
        System.out.printf("IPK         : %.2f%n", getIpk());
        System.out.printf("Nilai Abjad : %s%n", getNilaiHuruf(getIpk()));
        System.out.println("=============================================================");
    }
    public void displayAllNilai() {
        System.out.println("=============================================================");
        System.out.printf("NIM  : %s%n", getNim());
        System.out.printf("Nama : %s%n", getNama());
        System.out.println("Daftar Nilai Mata Kuliah:");
        System.out.println("=============================================================");
        
        for (String mk : nilai.keySet()) {
            System.out.printf("Mata Kuliah: %s%n", mk);
            System.out.println("=============================================================");
            
            ArrayList<Nilai> nilaiList = nilai.get(mk);
            for (Nilai n : nilaiList) {
                double nilaiAkhir = n.getNilai();
                System.out.printf("%s   : %.2f%n", 
                                  n.getNamaNilai(),
                                  nilaiAkhir
                                  );  
            }
            System.out.println();
        }
        System.out.println("=============================================================");
    }
    
    
    public double getNilaiBobot(double nilaiAkhir) {
        double nilaiBobot;
    
        if (nilaiAkhir >= 90 && nilaiAkhir <= 100) {
            nilaiBobot = 4.0;  
        } else if (nilaiAkhir >= 85 && nilaiAkhir < 90) {
            nilaiBobot = 3.75;  
        } else if (nilaiAkhir >= 80 && nilaiAkhir < 85) {
            nilaiBobot = 3.5;   
        } else if (nilaiAkhir >= 75 && nilaiAkhir < 80) {
            nilaiBobot = 3.25;  
        } else if (nilaiAkhir >= 70 && nilaiAkhir < 75) {
            nilaiBobot = 3.0;   
        } else if (nilaiAkhir >= 65 && nilaiAkhir < 70) {
            nilaiBobot = 2.75;  
        } else if (nilaiAkhir >= 60 && nilaiAkhir < 65) {
            nilaiBobot = 2.5;   
        } else if (nilaiAkhir >= 55 && nilaiAkhir < 60) {
            nilaiBobot = 2.0;  
        } else if (nilaiAkhir >= 45 && nilaiAkhir < 55) {
            nilaiBobot = 1.75; 
        } else if (nilaiAkhir >= 40 && nilaiAkhir < 45) {
            nilaiBobot = 1.5;  
        } else if (nilaiAkhir >= 35 && nilaiAkhir < 40) {
            nilaiBobot = 1.25;  
        } else if (nilaiAkhir >= 30 && nilaiAkhir < 35) {
            nilaiBobot = 1.0;   
        } else {
            nilaiBobot = 0.0;  
        }
    
        return nilaiBobot;
    }

    public String getNilaiHuruf(double nilaiAkhir) {
        String nilaiHuruf;
    
        if (nilaiAkhir >= 3.5 && nilaiAkhir <= 4.0) {
            nilaiHuruf = "A";
        }  else if (nilaiAkhir >= 3.25 && nilaiAkhir < 3.50) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir >= 3.00 && nilaiAkhir < 3.25) {
            nilaiHuruf = "B";
        }  else if (nilaiAkhir >= 2.75 && nilaiAkhir < 3.00) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir >= 1 && nilaiAkhir < 2) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 0.5 && nilaiAkhir < 1) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }
    
        return nilaiHuruf;
    }
    
    
}
