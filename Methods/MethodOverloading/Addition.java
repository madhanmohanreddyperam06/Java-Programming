public class Addition{
    public static void add(int x, int y){
        System.out.println(x+y);
    }
    public static void add(int x, int y, int z){
        System.out.println(x+y+z);
    }
    public static void add(int w, int x, int y, int z){
        System.out.println(x+z+y);
    }
    public static void main(String[] args){
        add(10,20);
        add(20, 30, 50);
        add(29, 29, 29);
    }
}