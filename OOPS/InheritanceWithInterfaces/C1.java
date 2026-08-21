class C1 {
    public void eat(){
        System.out.println("From class C1");
    }
}
class C extends C1 implements I3{
    public void eat(){
        System.out.println("From I3");
    }
    class C extends I{
 public void walk(){
        System.out.println("From I1");
    }
    public void run(){
        System.out.println("From I2");
    }
    public void sleep(){
        System.out.println("From I3");
    }
    }
   
    public static void main(String[] args){
        C obj = new C();
        obj.walk();
        obj.eat();
        obj.run();
        obj.sleep();
    }
}