public class UserLogic{
    public static void main(String[] args){
        Payment p1 = new CreditCard();
        Payment p2 = new UPI();

        p1.pay();
        p2.pay();
    }
}