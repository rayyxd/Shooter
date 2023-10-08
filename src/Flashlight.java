public class Flashlight extends EquipmentDecorator{
    Equipment equipment;
    public Flashlight(Equipment equipment){
        this.equipment=equipment;
    }
    public String getDescription(){
        return equipment.getDescription()+" + Flashlight";
    }
    public double cost(){
        return 300 + equipment.cost();
    }
}
