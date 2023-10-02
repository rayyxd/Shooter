public class Knife extends Equipment {
    public Knife(){
        super(new BCut(), new BCut());
    }
    @Override
    void display(){
        System.out.println("It is a knife");
    }
}
