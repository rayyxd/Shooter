public class Silencer extends EquipmentDecorator{
    Equipment equipment;
    public Silencer(Equipment equipment){
        this.equipment=equipment;
    }
    public String getDescription(){
        return equipment.getDescription()+" + Silencer";
    }
    public double cost(){
        return 1200 + equipment.cost();
    }
}

