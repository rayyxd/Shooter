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
}
