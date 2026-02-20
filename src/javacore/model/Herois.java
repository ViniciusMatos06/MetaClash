package javacore.model;

import java.util.ArrayList;
import java.util.List;



public class Herois {

    private String heroName;
    private double price;
    private int hp;
    private double strength;
    private double speed;
    private double defence;
    private double inteligence;

    public Herois(String heroName, int hp, double strangth, double speed, double defence, double price, double inteligence) {
        this.heroName = heroName;
        this.hp = hp;
        this.strength = strangth;
        this.speed = speed;
        this.defence = defence;
        this.price = price;
        this.inteligence = inteligence;
    }

    public double getInteligence() {
        return inteligence;
    }

    public String getHeroName() {
        return heroName;
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

    public double getPrice() {
        return price;
    }
}
