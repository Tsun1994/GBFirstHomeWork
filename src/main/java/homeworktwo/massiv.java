package homeworktwo;

public class massiv {
    public static void main (String[] args) {
        int [] arr = {1 , 1, 0, 1, 0, 1, 0, 1, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            //System.out.print(arr[i] + " ");
            if (arr[i] == 0) {
                arr[i] = 1;
            }
            else {
                arr[i] = 0;
            }
            //System.out.println(arr[i]);
        }
        int [] arr3 = new int[8];
        for (int i = 0; i < arr3.length ; i++) {
            arr[i] = i * 3;
            //System.out.print(arr[i] + " ");
        }
        int [] art = new int[15];
        for (int i = 0; i < art.length; i++) {
            art[i] = (int) (Math.random() * 10);
            System.out.print(art[i] + " ");
            if (art[i] < 7) {
                art [i] = art[i] * 2;
            }
            System.out.println(art[i]);
        }
    }

}
