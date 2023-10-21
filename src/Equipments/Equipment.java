package Equipments;

import Behaviors.*;

public abstract class Equipment {

    private AttackBehavior attack1Behavior;
    private AttackBehavior attack2Behavior;

    protected String description ="Unknown equipment";

    public void SetAttackBehavior(AttackBehavior attack1Behavior, AttackBehavior attack2Behavior) {
        this.attack1Behavior = attack1Behavior;
        this.attack2Behavior = attack2Behavior;
    }
    public AttackBehavior getAttack1Behavior() {return attack1Behavior;}
    public AttackBehavior getAttack2Behavior() {
        return attack2Behavior;
    }

    public void performAttack1(){
        attack1Behavior.attack();
    }

    public void performAttack2(){
        attack2Behavior.attack();
    }
    public String getDescription(){
        return description;
    }

    public abstract double cost();

    public void display(){
        System.out.println(getDescription()+" $"+cost());
    }
}
