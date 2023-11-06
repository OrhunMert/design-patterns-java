package design.patterns.java.structural.flyweight.component.impl;

import design.patterns.java.structural.flyweight.component.Soldier;

import java.util.Random;

public class Archer implements Soldier {

    public static int objectCounter = 0;

    private int health;
    private int agility;
    private int power;

    private String name;
    private String weapon;

    public Archer(){
        name = "Archer";
        weapon = "blow";

        objectCounter++;
    }

    @Override
    public void assignRandomValues(){
        Random random = new Random();
        health = random.nextInt(100)+80;
        agility = random.nextInt(100)+90;
        power = random.nextInt(100)+85;
    }

    @Override
    public double calculateSoldierDamage() {
        return ((health*2)+(agility*3)+(power*2))/12.0;
    }

    @Override
    public String getName() {
        return name;
    }
}
