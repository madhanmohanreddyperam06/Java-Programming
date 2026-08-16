public class P9 {
    static String userData;
    static String password;
    public static void main(String[] args) {
        Registration("Username", "password");
        Login("Username", "password");
    }

    public static void Registration(String username, String pass) {
        if (userData == null) {
            userData = username;
            password = pass;
            System.out.println("Registration Completed, Now go and Login");
        } else {
            System.out.println("User already exists");
        }
    }

    public static void Login(String username, String pass) {
        if (userData != null && userData.equals(username)
                && password.equals(pass)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Username or Password");
        }
    }
}