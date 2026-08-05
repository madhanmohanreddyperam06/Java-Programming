class UserLogic {
    public static void main(String[] args) {

        Rectangle1 r1 = new Rectangle1(10, 5);
        Rectangle1 r2 = new Rectangle1(10, 5, 4);

        System.out.println("Area of 2D Rectangle : " + r1.area());
        System.out.println("Surface Area of 3D Rectangle : " + r2.area3D());
    }
}