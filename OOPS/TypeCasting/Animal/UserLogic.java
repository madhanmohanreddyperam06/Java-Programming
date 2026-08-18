public class UserLogic{
    public static void main(String[] args){
        //UpCasting
        Animal a = new Puppy();
        a.eat();

        //DownCasting
        Puppy p = (Puppy) a;

        p.eat();
        p.play();
    }
}