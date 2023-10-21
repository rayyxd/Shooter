package Decorators;

import Equipments.Equipment;

public class Compensator extends EquipmentDecorator{
    Equipment equipment;
    public Compensator(Equipment equipment){
        this.equipment=equipment;
    }
    public String getDescription(){
        return equipment.getDescription()+" + Compensator";
    }
    public double cost(){
        return 650 + equipment.cost();
    }

    public void performAttack1(){
        equipment.performAttack1();
    }
    public void performAttack2(){
        equipment.performAttack2();
    }
}
