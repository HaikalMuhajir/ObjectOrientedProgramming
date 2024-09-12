package Percobaan1;

public class Motor {
    public String platNomor;
    public boolean isMesinOn;
    public int kecepatan;

    public void displayStatus() {
        System.out.println("Plat Nomor : " + this.platNomor);

        if (isMesinOn) {
            System.out.println("Mesin On");
        } else {
            System.out.println("Mesin Off");
        }
        System.out.println("Kecepatan : " + this.kecepatan);
        System.out.println("===================================");
    }

    public int asignKecepatan(boolean isMesinOn, int kecepatanBaru) {
        if (!isMesinOn && kecepatanBaru > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
            return 0;
        } else {
            return kecepatanBaru;
        }
    }
}
