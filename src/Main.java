import Characters.Character;
import Equipments.*;
import Grenades.*;
import UpdateCenter.*;
import Behaviors.*;
import Decorators.*;

class Main{
    public static void main(String[] args)
    {
        //Factory pattern
        EquipmentFactory factory = new EquipmentFactory();
        Equipment ak47 = factory.createEquipment("ak47");
        Equipment glock = factory.createEquipment("glock");

        System.out.println("-------------------");

        //Strategy pattern
        ak47.setAttackBehavior(new BShoot(), new BNoAttack());
        glock.setAttackBehavior(new BShoot(), new BShootingBurst());

        System.out.println("--------------------");

        //Decorator pattern
        ak47=new Sight(ak47);
        ak47=new Compensator(ak47);
        ak47.display();

        glock=new Flashlight(glock);
        glock.display();

        System.out.println("--------------------");

        //Observer pattern
        UpdateLog updates = new UpdateLog();

        Character char1 = new Character("Agent 1", updates);
        Character char2 = new Character("Agent 2", updates);

        updates.setUpdateVer("1.0");
        updates.addSubscriber(char1);
        updates.addSubscriber(char2);
        updates.setUpdateVer("1.1");

        System.out.println("-------------------");

        /*Adapter pattern*/
        IGrenade flashbang = new Flashbang();

        char1.setEquipment1(new EquipmentAdapter(flashbang));
        char1.setEquipment2(ak47);
        char1.changeEquipment(1);

        char1.performAttack1();
        char1.performAttack2();

        char1.changeEquipment(2);
        char1.performAttack1();
        char1.performAttack2();

        System.out.println("-------------------");

        //Singletone pattern
        Server server = Server.getInstance();
        server.display();

    }
}