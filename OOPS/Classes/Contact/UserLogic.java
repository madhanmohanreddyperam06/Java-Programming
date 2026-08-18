public class UserLogic{
    public static void main(String[] args){
        Contact c1=new Contact();
        c1.name = "John";
        c1.phn_number = 9374782292l;
        c1.save();
        System.out.println("Contact Name is : " + c1.name);
        System.out.println("Phone Number is : " + c1.phn_number);
System.out.println("===============================================================================");
        Contact c2=new Contact();
        c2.name = "Mary";
        c2.phn_number = 7372847383l;
        c2.save();
        System.out.println("Contact Name is : " + c2.name);
        System.out.println("Phone Number is : " + c2.phn_number);
    }
}
