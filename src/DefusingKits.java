public class DefusingKits extends Equipment{

    public DefusingKits(){
        super(new BDefusing(), new BNoAttack());
    }
    void display(){
        System.out.println("It is defusing kits");
    }
}
