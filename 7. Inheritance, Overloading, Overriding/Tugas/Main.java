package Tugas;

public class Main {
    public static void main(String[] args) {
       SuperHero batman = new SuperHero("Bruce Wayne", 47, 999999, "Batman", "Unlimited Money");
       
       SuperHero captainAmerica = new SuperHero();

       captainAmerica.setName("Steve Rogers"); 
       captainAmerica.setAge(148); 
       captainAmerica.setNetWorth(3400);
       captainAmerica.setPower("Super Soldier"); 
       captainAmerica.setSuperHeroName("Captain America"); 

       System.out.println(batman.getInfo());
       System.out.println(captainAmerica.getInfo());
    }
}
