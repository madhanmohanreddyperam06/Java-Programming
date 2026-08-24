public class UserLogic{
    public static void main(String[] args){
        Bank obj = new Bank();
        ATM card = obj.atm();
        card.withdraw();
        card.balance();
    }
}