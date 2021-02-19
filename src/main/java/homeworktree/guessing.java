package homeworktree;

import java.util.Random;
import java.util.Scanner;

public class guessing {
    public static void main (String [] args) {
        System.out.println("Играем в игру угадай чило, вводите ваше");
        Random rand1 = new Random();
        int quessed = rand1.nextInt(10);
        game:
        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            int chislo = scanner.nextInt();
            if (chislo == quessed) {
                System.out.println("Вы угадали");
                i = 2;
            } else if (chislo > quessed) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
            if (i == 2) {
                System.out.println("Хотите поиграть еще? 1 - Yes, 2 - No");
                int rep = scanner.nextInt();
                if (rep == 1) {
                    quessed = (int) (Math.random() * 10);
                    i = -1;
                    continue game;
                } else {
                    break;
                }
            }
        }
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random rand2 = new Random();
        int i = rand2.nextInt(24);
        System.out.println("А теперь мы загадил слово!");
        System.out.println(words[i].length());
        int n = 1;
        while (n > 0) {
            Scanner scanner1 = new Scanner(System.in);
            String slovo = scanner1.nextLine();
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == slovo.charAt(j)) {
                    System.out.print(words[i].charAt(j));
                    if (j + 1 == words[i].length()){
                        System.out.println();
                        System.out.println("Вы угадали");
                        n--;
                        break;
                    }
                } else {
                    System.out.print("###################");
                    System.out.println();
                    break;
                }
            }
        }
    }
}
