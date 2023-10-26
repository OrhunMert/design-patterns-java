package design.patterns.java.structural.flyweight.component.impl;

import design.patterns.java.structural.flyweight.component.Soldier;

import java.util.Random;

public class Cavalry implements Soldier {

    public static int objectCounter = 0;

    // intrinct
    private int health;
    private int agility;
    private int power;

    // ixtrinct
    private String name;
    private String weapon;

    public Cavalry() {
        name = "Cavalry";
        weapon = "Sword";

        objectCounter++;
    }

    @Override
    public double calculateSoldierDamage() {
        return ((health*1)+(agility*2)+(power*3))/11.0;
    }

    @Override
    public void assignRandomValues() {
        Random random = new Random();
        health = random.nextInt(100)+80;
        agility = random.nextInt(100)+85;
        power = random.nextInt(100)+90;
    }

    @Override
    public String getName() {
        return name;
    }
}
