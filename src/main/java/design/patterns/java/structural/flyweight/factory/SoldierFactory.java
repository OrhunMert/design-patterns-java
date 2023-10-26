package design.patterns.java.structural.flyweight.factory;

import design.patterns.java.structural.flyweight.component.Soldier;
import design.patterns.java.structural.flyweight.component.impl.Archer;
import design.patterns.java.structural.flyweight.component.impl.Cavalry;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SoldierFactory {

    private final static Map<SoldierTypeEnum, Soldier> soldiers = new HashMap();

    public static Soldier createSoldier(SoldierTypeEnum soldierType){
        Soldier soldier = null;
        if (Objects.isNull(soldiers.get(soldierType))) {
            if(soldierType.equals(SoldierTypeEnum.CAVALRY)){
                soldier = new Cavalry();
            }
            else if(soldierType.equals(SoldierTypeEnum.ARCHER)){
                soldier = new Archer();
            }
            soldiers.put(soldierType, soldier);
        }
        else {
            soldier = soldiers.get(soldierType);
        }

        return soldier;
    }

    public enum SoldierTypeEnum {
        CAVALRY, ARCHER;
    }
}
