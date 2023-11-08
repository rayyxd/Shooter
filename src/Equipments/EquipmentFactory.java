package Equipments;

public class EquipmentFactory {
    public Equipment createEquipment(String type) {
        if ("ak47".equalsIgnoreCase(type)) {
            return new AK47();
        }else if ("deagle".equalsIgnoreCase(type)) {
            return new Deagle();
        }else if ("glock".equalsIgnoreCase(type)) {
            return new Glock();
        }else if ("knife".equalsIgnoreCase(type)) {
            return new Knife();
        }else if ("defusingkits".equalsIgnoreCase(type)) {
            return new DefusingKits();
        } else {
            throw new IllegalArgumentException("Invalid equipment type: " + type);
        }
    }
}
