package Decorators;

import Equipments.Equipment;

public class Sight extends EquipmentDecorator{
    Equipment equipment;
    public Sight(Equipment equipment){
        this.equipment=equipment;
    }
    public String getDescription(){
        return equipment.getDescription()+" + Sight";
    }
    public double cost(){
        return 600 + equipment.cost();
    }

    public void performAttack1(){
        equipment.performAttack1();
    }
    public void performAttack2(){
        equipment.performAttack2();
    }
}
