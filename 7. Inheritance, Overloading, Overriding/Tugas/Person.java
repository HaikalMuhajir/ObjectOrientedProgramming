package Tugas;

public class Person {
    private String name;
    private int age;
    private double netWorth;

    public Person() {
    }

    public Person(String name, int age, double netWorth) {
        this.name = name;
        this.age = age;
        this.netWorth = netWorth;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getNetWorth() {
        return netWorth;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNetWorth(double netWorth) {
        this.netWorth = netWorth;
    }

    public String getInfo() {
        String info = "";
        info += "Name      : " + this.getName() + "\n";
        info += "Age       : " + this.getAge() + "\n";
        info += "Net Worth : $" + this.getNetWorth() + "\n";
        return info;
    }

    public void goWork(){
        System.out.println(this.getName() + "Go to the office");
    }
}
