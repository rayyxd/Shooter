public abstract class Equipment {

    AttackBehavior attack1Behavior;
    AttackBehavior attack2Behavior;

    public Equipment(AttackBehavior attack1Behavior, AttackBehavior attack2Behavior) {
        this.attack1Behavior = attack1Behavior;
        this.attack2Behavior = attack2Behavior;
    }

    void performAttack1(){
        attack1Behavior.attack();
    }

    void performAttack2(){
        attack2Behavior.attack();
    }
    abstract void display();
}
