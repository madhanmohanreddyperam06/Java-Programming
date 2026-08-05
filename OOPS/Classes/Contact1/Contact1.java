public class Contact1{
    String name;
    long phone;

    Contact1(String name, long phone) {
        this.name = name;
        this.phone = phone;
    }

    public void save() {
        System.out.println("Contact Saved Successfully");
    }
}