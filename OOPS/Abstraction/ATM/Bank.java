// Abstraction --> the process of hiding the implementation details and only shows the  essential functionality to the user

abstract interface ATM{
    abstract public void withdraw();
    abstract public void balance();
}
class Bank{
    private class SBI implements ATM{
        public void withdraw(){
            System.out.println("Withdrawn Successfully");
        }
        public void balance(){
            System.out.println("Balance checked sucessfully");
        }
        }
        public ATM atm(){
            SBI s = new SBI();
            return s;
    }
}