import Behaviors.*;
import Decorators.*;
import Equipments.*;
import Grenades.Flashbang;
import Grenades.IGrenade;

class Main{
    public static void main(String[] args)
    {
        Equipment ak47 = new AK47();
        ak47.SetAttackBehavior(new BShoot(), new BNoAttack());
        ak47 = new Compensator(ak47);
        ak47 = new Sight(ak47);
        ak47 = new Flashlight(ak47);

        Equipment glock = new Glock();
        glock.SetAttackBehavior(new BShoot(), new BShootingBurst());
        glock = new Silencer(glock);
        glock = new Flashlight(glock);

        IGrenade flashbang = new Flashbang();

        Character char1 = new Character("Agent 1");


        char1.setEquipment2(new EquipmentAdapter(flashbang));













    }
}