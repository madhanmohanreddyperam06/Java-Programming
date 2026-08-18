public class UserLogic{
    public static void main(String[] args){
        //UpCasting
        B obj = new C();
        System.out.println(obj.a);//10
        System.out.println(obj.b);//20
        //System.out.println(obj.c);//CTE
        
        A obj1 = new C();
        System.out.println(obj1.a);//10

        A obj2 = new B();
        System.out.println(obj2.a);//10

        //DownCasting
        B obj3 = (B) obj2;
        System.out.println(obj3.a);//10
        System.out.println(obj3.b);//20

        C obj4 = (C) obj1;
        System.out.println(obj4.a);//10
        System.out.println(obj4.b);//20
        System.out.println(obj4.c);//30

        C obj5 = (C) obj;
        System.out.println(obj5.a);//10
        System.out.println(obj5.b);//20
        System.out.println(obj5.c);//30
    }
}