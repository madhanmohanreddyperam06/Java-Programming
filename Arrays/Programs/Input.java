//aaabbcccd into a2b2c3d1


public class Input {
    public static void main(String[] args) {

        String s = "aaabbcccd";
        String d = "";
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }
            d = d + s.charAt(i) + count;
        }
        System.out.println(d);
    }
}