package Behaviors;

public class BNoAttack implements AttackBehavior {
    @Override
    public void attack(){
        System.out.println("I am not doing anything");
    }
}
