package Tugas;
import java.util.Scanner;
public class Koperasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Anggota anggota1 = new Anggota("111333444", "Donny", 5_000_000);
        anggota1.cetakInfo();
        System.out.println("|| PINJAM & ANGSUR ||");
        String input = "";
        do{
            System.out.println("Ketik PINJAM / ANGSUR / STOP");
            System.out.print("Masukkan Input :");
            input= sc.next();
            if(input.equalsIgnoreCase("pinjam")){
                System.out.println("Limit Peminjaman : " + anggota1.getLimitPeminjaman());
                System.out.print("Anda Pinjam Berapa : ");
                double pinjam = sc.nextDouble();
                anggota1.pinjam(pinjam);
            } else if(input.equalsIgnoreCase("angsur")){
                System.out.println("Jumlah Pinjaman : " + anggota1.getJumlahPinjaman());
                System.out.println("Minimal Angsuran : " + anggota1.getJumlahPinjaman() * 0.10);
                System.out.print("Anda Angsur Berapa : ");
                double angsur = sc.nextDouble();
                anggota1.angsur(angsur);
            } else {
                System.out.println("Ketik PINJAM / ANGSUR / STOP");
            }
        } while(!input.equalsIgnoreCase("stop"));
        sc.close();
    }
    
}
