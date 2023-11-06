package design.patterns.java.structural.flyweight.client;

import design.patterns.java.structural.flyweight.component.Soldier;
import design.patterns.java.structural.flyweight.factory.SoldierFactory;

public class FlyweightDesignPatternClient {
    public static void main(String[] args) {

        Soldier soldier = SoldierFactory.createSoldier(SoldierFactory.SoldierTypeEnum.ARCHER);

        soldier.assignRandomValues();
        System.out.println(soldier.getName());
        System.out.println(soldier.calculateSoldierDamage());

        soldier = SoldierFactory.createSoldier(SoldierFactory.SoldierTypeEnum.CAVALRY);

        soldier.assignRandomValues();
        System.out.println(soldier.getName());
        System.out.println(soldier.calculateSoldierDamage());
    }
}
