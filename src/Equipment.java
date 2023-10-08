public abstract class Equipment {

    AttackBehavior attack1Behavior;
    AttackBehavior attack2Behavior;

    String description ="Unknown equipment";
    public void SetAttackBehavior(AttackBehavior attack1Behavior, AttackBehavior attack2Behavior) {
        this.attack1Behavior = attack1Behavior;
        this.attack2Behavior = attack2Behavior;
    }

    void performAttack1(){
        attack1Behavior.attack();
    }

    void performAttack2(){
        attack2Behavior.attack();
    }
    public String getDescription(){
        return description;
    }

    public abstract double cost();

    void display(){
        System.out.println(getDescription()+" $"+cost());
    }
}
