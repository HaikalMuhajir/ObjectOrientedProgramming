package Tugas;
import java.util.Scanner;
public class Anggota {
    private String noKTP, nama;
    private double limitPeminjaman, jumlahPinjaman;
    private Scanner sc = new Scanner(System.in);

    Anggota(String noKTP, String nama, double limitPeminjaman) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
    }

    public void pinjam() {
        System.out.println("Limit Peminjaman : " + getLimitPeminjaman());
        System.out.print("Anda Pinjam Berapa : " );
        double pinjam = sc.nextDouble();
        System.out.printf("Meminjam Uang %.0f..\n", pinjam);
        if (pinjam < 50000){
            System.out.println("Minimal Peminjaman Rp50.000 !");
        } else if(pinjam % 50000 != 0){
            System.out.println("Peminjaman Harus Berkelipatan Rp50000 !");
        } else if((pinjam + getJumlahPinjaman()) > getLimitPeminjaman()){
            System.out.println("Jumlah Pinjaman Anda Melebihi Batas !");
        } else {
            System.out.printf("Proses Peminjaman Uang Sejumlah %.2f Anda Berhasil !%n", pinjam);
            limitPeminjaman -= pinjam;
            jumlahPinjaman += pinjam;
            System.out.println("Limit Peminjaman : " + getLimitPeminjaman());
        }
    }

    public void angsur() {
        System.out.println("Total Pinjaman : " + getJumlahPinjaman());
        System.out.println("Minimal Angsuran : " + ( 0.10 * getJumlahPinjaman()));
        System.out.print("Angsuran Anda : ");
        double angsur = sc.nextDouble();
        if (angsur < 50000){
            System.out.println("Minimal Angsuran Rp50.000 !");
        } else if(angsur % 50000 != 0){
            System.out.println("Angsuran Harus Berkelipatan Rp50000");
        } else if(angsur > getJumlahPinjaman()){
            System.out.println("Angsuran Anda Melebihi Jumlah Peminjaman Anda !");
        } else if(angsur < (0.10 * getJumlahPinjaman())){
            System.out.println("Angsuran Anda Harus Diatas Batas Minimum Angsuran !");
        }
        else {
            System.out.printf("Proses Pengangsuran  %.2f Anda Berhasil !%n", angsur);
            jumlahPinjaman -= angsur;
            limitPeminjaman += angsur;
            System.out.println("Sisa Pinjaman : " + getJumlahPinjaman());
        }
    }

    public double getLimitPeminjaman() {
        return limitPeminjaman;
    }

    public double getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public String getNama() {
        return nama;
    }

    public String getNoKTP() {
        return noKTP;
    }
    public void cetakInfo(){
        System.out.println("===========================================");
        System.out.println("Nama             : " + nama);
        System.out.println("No KTP           : " + noKTP);
        System.out.println("Limit Peminjaman : " + limitPeminjaman);
        System.out.println("Jumlah Pinjaman  : " + jumlahPinjaman);
        System.out.println("===========================================");
    }
}
