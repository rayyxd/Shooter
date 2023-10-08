public class Knife extends Equipment {
    public Knife(){
        description="Knife";
    }

    @Override
    public double cost() {
        return 100;
    }
}