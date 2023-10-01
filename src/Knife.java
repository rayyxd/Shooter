public class Knife extends Equipment {
    public Knife(){
        super(new Cut(), new Cut());
    }
    @Override
    void display(){
        System.out.println("It is a knife");
    }
}
