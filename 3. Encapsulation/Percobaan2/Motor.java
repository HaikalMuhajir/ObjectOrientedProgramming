package Percobaan2;

public class Motor {
    private String platNomor;
    private boolean isMesinOn;
    private int kecepatan;

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

    private int asignKecepatan(boolean isMesinOn, int kecepatanBaru) {
        if (isMesinOn) {
            if(kecepatanBaru > 100){
                System.out.println("Kecepatan Maksimal Adalah 100 !");
            } else if(kecepatanBaru < 0){
                System.out.println("Tidak Bisa Memasukkan Kecepatan Negatif !");
            } else {
                return kecepatanBaru;
            }
        } else {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
            }
        return 0;
    }

    public void setKecepatan(int kecepatan){
        this.kecepatan = asignKecepatan(this.isMesinOn, kecepatan);
    }

    public String getPlatNomor(){
        return platNomor;
    }

    public void setPlatNomor(String platNomor){
        this.platNomor = platNomor;
    }
    public boolean isIsMesinOn(){
        return isMesinOn;
    }
    public void setIsMesinOn(boolean isMesinOn){
        this.isMesinOn = isMesinOn;
    }
    public int getKecepatan(){
        return kecepatan;
    }
}
