package Characters;

import Equipments.Equipment;
import UpdateCenter.UpdateLog;

public class Character implements ICharacter{

    private final UpdateLog updateLog;
    private final String name;
    private Equipment equip1;
    private Equipment equip2;
    private Equipment currentEquipment;

    public Character(String name, UpdateLog updateLog){
        this.name=name;
        this.updateLog=updateLog;
    }
    public void setEquipment1(Equipment equip1){
        this.equip1 = equip1;
    }
    public void setEquipment2(Equipment equip2){
        this.equip2=equip2;
    }
    public void display(){
        System.out.println("I am "+name);
    }
    public void update(){
        System.out.println(name+" notified for update: " + updateLog.getUpdateVersion());
    }
    public void changeEquipment(int num){
        if (num==1){
            currentEquipment=equip1;
            System.out.println("Changing equipment");

        } else if (num==2) {
            currentEquipment=equip2;
            System.out.println("Changing equipment");

        }else {
            System.out.println("No such equipment");
        }
    }

    public void performAttack1(){
        currentEquipment.performAttack1();
    }
    public void performAttack2(){
        currentEquipment.performAttack2();
    }

}

