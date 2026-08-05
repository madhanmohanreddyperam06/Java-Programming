public class UserLogic {
    public static void main(String[] args) {

        Rectangle rect2D = new Rectangle();
        rect2D.length = 10;
        rect2D.breadth = 5;

        Rectangle rect3D = new Rectangle();
        rect3D.length = 10;
        rect3D.breadth = 5;
        rect3D.height = 4;

        System.out.println("Area of 2D Rectangle = " + rect2D.findArea());

        System.out.println("Surface Area of 3D Rectangle = " + rect3D.findArea3D());
    }
}