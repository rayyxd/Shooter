import Equipments.Equipment;

public class Character {

    private final String name;
    Equipment equip1;
    Equipment equip2;

    public Character(String name){
        this.name=name;
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
}

