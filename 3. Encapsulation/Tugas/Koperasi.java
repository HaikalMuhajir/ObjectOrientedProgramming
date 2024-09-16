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
                anggota1.pinjam();
            } else if(input.equalsIgnoreCase("angsur")){
                anggota1.angsur();
            } else {
                System.out.println("Ketik PINJAM / ANGSUR / STOP");
            }
        } while(!input.equalsIgnoreCase("stop"));
        sc.close();
    }
    
}
