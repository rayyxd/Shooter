public class Deagle extends Equipment {
    public Deagle() {
        super(new Shoot(), new NoAttack());
    }

    @Override
    void display(){
        System.out.println("It is desert eagle");
    }
}
