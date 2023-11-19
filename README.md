# Shooter
Project Shooter implies pracrtise of realization several proggraming patterns.


## Singletone
Pattern "Singletone" provides a  logic of Server that shows status of game server:

```java
Server server = Server.getInstance();
server.display();
```

## Strategy
Pattern "Strategy" provides a shooting mechanic to created weapon, so when player left-clicks of right-clicks, certain shooting behavior will be.

```java
ak47.setAttackBehavior(new BShoot(), new BNoAttack());
glock.setAttackBehavior(new BShoot(), new BShootingBurst());
```

## Factory
Pattern "Factory" responsible for creating a certain equipment type like: AK47, GLOCK and etc.

```java
EquipmentFactory factory = new EquipmentFactory();
Equipment ak47 = factory.createEquipment("ak47");
Equipment glock = factory.createEquipment("glock");
```

## Decorator
"Decarator" used to create a addition on weapons like sight, flashlight and etc.

```java
ak47=new Sight(ak47);
ak47=new Compensator(ak47);
ak47.display();

glock=new Flashlight(glock);
glock.display();
```


## Observer

"Observer" pattern creates a subscriber array list that will be notified when update log will get new version.

```java
UpdateLog updates = new UpdateLog();

Character char1 = new Character("Agent 1", updates);
Character char2 = new Character("Agent 2", updates);

updates.setUpdateVer("1.0");
updates.addSubscriber(char1);
updates.addSubscriber(char2);
updates.setUpdateVer("1.1");

```



## Adapter
"Adapter" provides new class Grenade that has method throw(). Adapter adapts this method so the object of class
Grenade can be set to a Equipment field and can adapt to the method attack()

```java
IGrenade flashbang = new Flashbang();

char1.setEquipment1(new EquipmentAdapter(flashbang));
char1.setEquipment2(ak47);
char1.changeEquipment(1);

char1.performAttack1();
char1.performAttack2();

char1.changeEquipment(2);
char1.performAttack1();
char1.performAttack2();
```
