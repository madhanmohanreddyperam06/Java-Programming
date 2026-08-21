// method overriding --> the process of re-implementing/re-designing the behaviour of parent class in child class is called method overriding

class Payment{
    void pay(){
        System.out.println("Make Payment");
    }
}
class CreditCard extends Payment{
    @Override
    void pay(){
        System.out.println("Make Payment through Credit Card");
    }
}
class UPI extends Payment{
    @Override
    void pay(){
        System.out.println("Make Payment through UPI");
    }
}