class Main{
    public static void main(String[] args)
    {
        Equipment ak47 = new AK47();
        ak47.SetAttackBehavior(new BShoot(), new BNoAttack());
        ak47 = new Compensator(ak47);
        ak47 = new Sight(ak47);
        ak47 = new Flashlight(ak47);
        ak47.display();

        ak47.performAttack1();
        ak47.performAttack2();

        Equipment glock = new Glock();
        glock.SetAttackBehavior(new BShoot(), new BShootingBurst());
        glock = new Silencer(glock);
        glock = new Flashlight(glock);
        glock.display();







    }
}