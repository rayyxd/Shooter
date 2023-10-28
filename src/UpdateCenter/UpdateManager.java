package UpdateCenter;

import Characters.ICharacter;

import java.util.ArrayList;

public class UpdateManager {

    private final ArrayList<ICharacter> subs;
    public void addSubscriber(ICharacter character){
        subs.add(character);
    }

    public void removeSubscriber(ICharacter character){
        subs.remove(character);
    }
    public UpdateManager(){
        this.subs=new ArrayList<>();
    }

    public void notifySubs(){
        for (ICharacter sub : subs) {
            sub.update();
        }
    }

}
