package homeworkseven;

import java.util.Random;
import java.util.Scanner;

public class CatServis {
    public static void main (String [] args) {
        Random rand = new Random(100);
        int a = rand.nextInt(50) + 1;
        Cat cat = new Cat(false, "Pol", a);
        System.out.println("Написать количество еды для одного кота");
        Scanner cs = new Scanner(System.in);
        int food = cs.nextInt();
        Plate plate = new Plate(food);
        while (!cat.satiety) {
            plate.info();
            cat.eat(plate);
            if (!cat.satiety){
                plate.addFood(plate);
            }
            plate.info();
        }
        Cat[] cats = new Cat[5];
        a = rand.nextInt(50) + 1;
        cats[0] = new Cat(false, "Barsik", a);
        a = rand.nextInt(50) + 1;
        cats[1] = new Cat(false, "Murzik", a);
        a = rand.nextInt(50) + 1;
        cats[2] = new Cat(false, "Vasja", a);
        a = rand.nextInt(50) + 1;
        cats[3] = new Cat(false, "Klop", a);
        a = rand.nextInt(50) + 1;
        cats[4] = new Cat(false, "Moska", a);
        System.out.println("Написать количество еды для "+ cats.length + " кота");
        food = cs.nextInt();
        Plate plate1 = new Plate(food);
        plate1.info();
        for (Cat n: cats) {
            while (!n.satiety){
                n.eat(plate1);
                if (!n.satiety){
                    plate1.addFood(plate1);
                }
                plate1.info();
            }
        }
    }
}
