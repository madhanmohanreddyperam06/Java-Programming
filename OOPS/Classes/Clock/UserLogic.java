public class UserLogic{
    public static void main(String[] args) {
        Clock c1 = new Clock(10, 30, 45);
        System.out.println("Original Time:");
        c1.showTime();

        c1.setHour(12);
        c1.setMinute(50);
        c1.setSecond(20);

        System.out.println("Updated Time:");
        c1.showTime();

        System.out.println("Using Getters");
        System.out.println("Hour   : " + c1.getHour());
        System.out.println("Minute : " + c1.getMinute());
        System.out.println("Second : " + c1.getSecond());

        System.out.println("Trying Invalid Values:");

        c1.setHour(30);
        c1.setMinute(80);
        c1.setSecond(75);

        System.out.println("Final Time:");
        c1.showTime();
    }
}