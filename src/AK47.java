public class AK47 extends Equipment {

    public AK47() {
        super(new BShoot(), new BNoAttack());
    }

    @Override
    void display(){
        System.out.println("It is ak47");
    }
}
