class UserLogic{
    public static void main(String[] args){
        Contact c1 = new Contact();
        c1.name = "Madhu";
        c1.phone = 9110395993l;
        c1.save();
        System.out.println(c1.name);
        System.out.println(c1.phone);

        Contact c2 = new Contact();
        c2.name = "Vishnu";
        c2.phone = 9223747491l;
        c2.save();
        System.out.println(c2.name);
        System.out.println(c2.phone);
    }
}