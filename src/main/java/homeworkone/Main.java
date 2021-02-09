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
        String s2f = "Привет, Давид!";
        boolean is = true;
        System.out.println(HW1(3, 7, 6,12));
        System.out.println(HW2 (5, 16));
        System.out.println(HW3(9));
        System.out.println(HW4(0));
        System.out.println(HW5 (4));
        System.out.println(HW6("Григорий"));
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
    public static String HW3 (int chislo) {
        String str;
        if (chislo >= 0) {
            return (str = "Вы ввели положительное число");
        } else {
            return (str = "Вы ввели отрицательное число");
        }
    }
    public static boolean HW4 (int chislo) {
        if (chislo < 0) {
            return true;
        } else {
            return false;
        }
    }
    public static String HW5 (int year){
        int vis1 = year % 4;
        int vis2 = year % 100;
        int vis3 = year % 400;
        String str;
        if ((vis1 == 0 || vis3 == 0) && (vis2 != 0 || vis3 == 0)) {
            str = "Этот год является високосным";
            return (str);
        } else {
            str = "Этот год не является високосным";
            return (str);
        }
    }
    public static String HW6 (String str1) {
        String str2 = "Привет, ";
        return (str2 + str1 + "!");
    }
}
