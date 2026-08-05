class UserLogic{
    public static void main(String[] args) {

        Contact1 c1 = new Contact1("Madhu", 9110395993L);
        c1.save();
        System.out.println(c1.name);
        System.out.println(c1.phone);

        Contact1 c2 = new Contact1("Vishnu", 9223747491L);
        c2.save();
        System.out.println(c2.name);
        System.out.println(c2.phone);
    }
}