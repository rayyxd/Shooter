public class Glock extends Equipment{

    public Glock(){
        super(new Shoot(), new ShootingBurst());
    }

    @Override
    void display(){
        System.out.println("It is glock");
    }
}
