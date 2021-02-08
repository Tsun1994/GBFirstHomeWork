package homeworkone;

public class Main {
    public static void main (String[] args) {
        byte b1 = 1;
        short sh = 10;
        int in = 100;
        long lL = 45L;
        float fk = 5.5f;
        double dd = 1.54;
        char c = '^';
        String s2f = "Привет, Андрей!";
        boolean is = true;
        System.out.println(HW1(2, 4, 6,6));
//        System.out.println(HW2 (5, 16));
//        System.out.println(HW3(-9));
//        System.out.println(HW4(0));
//        System.out.println(HW5 (4));
//        System.out.println (4 % 400);
    }
    public static float HW1 (float a, float b, float c, float d) {
        return (a * (b + (c / d)));
    }
    public static boolean HW2 (int a1, int a2) {
        if ((a1 + a2) >= 10 && (a1 + a2) <= 20) {
            return (true);
        } else {
            return (false);
        }
    }
}
