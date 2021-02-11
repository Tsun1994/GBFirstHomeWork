package homeworktwo;

public class massiv {
    public static void main (String[] args) {
        int [] arr = {1 , 1, 0, 1, 0, 1, 0, 1, 1, 0};
        for (int i = 0; i < arr.length; i++) { // задание 1
            //System.out.print(arr[i] + " ");
            if (arr[i] == 0) {
                arr[i] = 1;
            }
            else {
                arr[i] = 0;
            }
            //System.out.println(arr[i]);
        }
        int [] arr3 = new int[8]; // задание 2
        for (int i = 0; i < arr3.length ; i++) {
            arr[i] = i * 3;
            //System.out.print(arr[i] + " ");
        }
        int [] art = new int[15]; // задание 3
        for (int i = 0; i < art.length; i++) {
            art[i] = (int) (Math.random() * 10);
            //System.out.print(art[i] + " ");
            if (art[i] < 6) {
                art [i] = art[i] * 2;
            }
           // System.out.println(art[i]);
        }
        int [][] a = new int[5][5]; // задание 4
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 10);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("______________");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if ((i == j) || (j == a[i].length - 1 - i)){
                    a[i][j] = 1;
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }


        int [] arm = new int[15]; // задание 5
        for (int i = 0; i < arm.length; i++) {
            arm[i] = (int) (Math.random() * 15);
            //System.out.print(arm[i] + " ");
        }
       // System.out.println();
        int armmax = arm[0];
        int armmin = arm[0];
//        System.out.print(armmin + " ");
//        System.out.println(armmax);
        for (int i = 1; i < arm.length; i++) {
            if (arm[i] > armmax) {
                armmax = arm[i];
            } else if (arm[i] < armmin) {
                armmin = arm[i];
            }
        }
//        System.out.print(armmin + " ");
//        System.out.print(armmax);
        int [] c = new int[10];
        System.out.println(summa(c));
    }
    public static boolean summa (int [] drr){
        for (int i = 1; i < drr.length; i++) {
            for (int j = 0; j < i; j++) {
                int sum1 = drr[j] + drr [i];
            }
        }
        return (true);
    }
}
