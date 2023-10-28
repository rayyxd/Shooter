package Grenades;

public class Flashbang implements IGrenade {
    private final String description;
    @Override
    public void throwFar() {
        System.out.println("Throwing grenade on 60 meters");
    }

    @Override
    public void throwClose(){
        System.out.println("Throwing grenade on 10 meters");
    }
    public Flashbang(){this.description="Flashbang";}
    public double cost(){return 150;}

    public String getDescription(){
        return description;
    }
    public void display(){
        System.out.println(description+" $"+cost());
    }
}
