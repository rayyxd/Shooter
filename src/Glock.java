public class Glock extends Equipment{

    public Glock(){
        super(new BShoot(), new BShootingBurst());
    }

    @Override
    void display(){
        System.out.println("It is glock");
    }
}
