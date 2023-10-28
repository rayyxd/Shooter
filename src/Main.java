import Characters.Character;
import Equipments.*;
import Grenades.*;
import UpdateCenter.*;
import Behaviors.*;
import Decorators.*;

class Main{
    public static void main(String[] args)
    {
        /*Observer pattern*/
        UpdateLog updates = new UpdateLog();

        Character char1 = new Character("Agent 1", updates);
        Character char2 = new Character("Agent 2", updates);

        updates.setUpdateVer("1.0");
        updates.addSubscriber(char1);
        updates.addSubscriber(char2);
        updates.notifySubs();
        updates.setUpdateVer("1.1");


        /*Adapter pattern*/
        IGrenade flashbang = new Flashbang();
        Equipment ak47 = new AK47();
        ak47.setAttackBehavior(new BShoot(), new BNoAttack());

        char1.setEquipment1(new EquipmentAdapter(flashbang));
        char1.setEquipment2(ak47);
        char1.changeEquipment(1);

        char1.performAttack1();
        char1.performAttack2();

        char1.changeEquipment(2);
        char1.performAttack1();
        char1.performAttack2();
















    }
}