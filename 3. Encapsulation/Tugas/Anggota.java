package Tugas;

public class Anggota {
    private String noKTP, nama;
    private double limitPeminjaman, jumlahPinjaman;

    Anggota(String noKTP, String nama, double limitPeminjaman) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
    }

    public void pinjam(double pinjaman) {
        System.out.printf("Meminjam Uang %.0f..\n", pinjaman);
        jumlahPinjaman += (pinjaman < 0 ) ? 0 : (limitPeminjaman < pinjaman) ? 0 : pinjaman;
        limitPeminjaman -= jumlahPinjaman;
    }

    public void angsur(double angsuran) {
    System.out.printf("Angsuran Minimum Pertransaksi %.2f \n", (jumlahPinjaman * 0.10));
    System.out.printf("Membayar Angsuran %.0f..\n", angsuran);
        jumlahPinjaman -= (angsuran < 0) ? 0 : (jumlahPinjaman < angsuran) ? 0 : angsuran;
        limitPeminjaman += jumlahPinjaman;
        getJumlahPinjaman();
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
