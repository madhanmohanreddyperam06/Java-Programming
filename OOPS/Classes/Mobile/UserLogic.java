public class UserLogic{
    public static void main(String[] args){
        Mobile m1 = new Mobile("Realme", 19000, 256, 8);
        Mobile m2 = new Mobile("OPPO", 21000, 128, 6);
        if(m1.price > m2.price){
            m1.getInfo();
        }else if(m2.price > m1.price){
            m2.getInfo();
        }else{
            m1.getInfo();
            m2.getInfo();
        }
    }
}