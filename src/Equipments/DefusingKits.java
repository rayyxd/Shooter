package Equipments;

public class DefusingKits extends Equipment {

    public DefusingKits(){
        description="Defusing kits";
    }

    @Override
    public double cost() {
        return 400;
    }
}