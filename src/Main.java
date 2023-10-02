class Main{
    public static void main(String args[])
    {
        Equipment ak47 = new AK47();
        Equipment deagle = new Deagle();
        Equipment defkits = new DefusingKits();
        Equipment glock = new Glock();

        ak47.performAttack1();
        ak47.performAttack2();
        ak47.display();

        glock.display();
        glock.performAttack1();
        glock.attack1Behavior=new BShootingBurst();
        glock.performAttack1();






    }
}