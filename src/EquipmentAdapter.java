import Equipments.Equipment;
import Grenades.IGrenade;

public class EquipmentAdapter extends Equipment {

    IGrenade grenade;
    public EquipmentAdapter(IGrenade grenade){
        this.grenade=grenade;
    }
    @Override
    public void performAttack1(){
        grenade.throwFar();
    }
    @Override
    public void performAttack2(){
        grenade.throwClose();
    }

    @Override
    public String getDescription(){
        return grenade.getDescription();
    }
    @Override
    public double cost(){return grenade.cost();}

    @Override
    public void display(){
        grenade.display();
    }
}
