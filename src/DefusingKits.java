public class DefusingKits extends Equipment{

    public DefusingKits(){
        super(new Defusing(), new NoAttack());
    }
    void display(){
        System.out.println("It is defusing kits");
    }
}
