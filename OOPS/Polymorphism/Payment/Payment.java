// using run time polymorphism 

class Payment{
    void pay(){
        System.out.println("Make Payment");
    }
}
class CreditCard extends Payment{
    @Override
    void pay(){
        System.out.println("Make payment through Credit Card");
    }
}
class DebitCard extends Payment{
    @Override
    void pay(){
        System.out.println("Make payment through Debit Card");
    }
}
class UPI extends Payment{
    @Override
    void pay(){
        System.out.println("Make payment through UPI");
    }
}