package Tugas;

public class SuperHero extends Person {
    private String superHeroName, power;

    public SuperHero() {
        super();
    }

    public SuperHero(String name, int age, double netWorth, String superHeroName, String power) {
        super(name, age, netWorth);
        this.superHeroName = superHeroName;
        this.power = power;
    }

    public String getPower() {
        return power;
    }

    public String getSuperHeroName() {
        return superHeroName;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setSuperHeroName(String superHeroName) {
        this.superHeroName = superHeroName;
    }

    @Override
    public String getInfo(){
        String info = "======================================\n";
        info += super.getInfo();
        info += "Hero Name : " + this.getSuperHeroName() + "\n";
        info += "Power     : " + this.getPower() + "\n";
        info += "======================================\n";
        return info;
    }

    @Override
    public void goWork(){
        System.out.println(this.getSuperHeroName() + "Save the World !");
    }

}
