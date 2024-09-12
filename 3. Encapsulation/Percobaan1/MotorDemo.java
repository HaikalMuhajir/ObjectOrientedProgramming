package Percobaan1;

public class MotorDemo {
    public static void main(String[] args) {
        int kecepatanBaru = 50;
        Motor motor1 = new Motor();
        motor1.displayStatus();

        motor1.platNomor = "B 0830 XZ";
        motor1.kecepatan = motor1.asignKecepatan(motor1.isMesinOn, kecepatanBaru);
        motor1.displayStatus();

        Motor motor2 = new Motor();
        motor2.platNomor = "N 9840 AB";
        motor2.isMesinOn = true;
        kecepatanBaru = 40;
        motor2.kecepatan = motor2.asignKecepatan(motor2.isMesinOn, kecepatanBaru);
        motor2.displayStatus();

        Motor motor3 = new Motor();
        motor3.platNomor = "D 8343 CV";
        kecepatanBaru = 60;
        motor3.kecepatan = motor3.asignKecepatan(motor3.isMesinOn, kecepatanBaru);
        motor3.displayStatus();
    }
}
