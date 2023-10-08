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
}
