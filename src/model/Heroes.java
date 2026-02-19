package model;

public class Heroes {

    private String name;
    private int hp;
    private double strength;
    private double speed;
    private double defence;

    public Heroes (String name, int hp, double strangth, double speed, double defence) {
        this.name = name;
        this.hp = hp;
        this.strength = strangth;
        this.speed = speed;
        this.defence = defence;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public double getStrength() {
        return strength;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDefence() {
        return defence;
    }
}
