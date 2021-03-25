package homework23;

import java.util.ArrayList;
import java.util.Arrays;

public class RandomWords {
    public static void main (String [] args){
        ArrayList <String> rand = new ArrayList<>(Arrays.asList("abra", "shvabra", "shvabra", "shvabra", "shvabra", "man", "tort", "bongo", "strips", "shvabra", "abra", "marta", "super", "foot", "abra", "abra", "polo", "polo"));
        System.out.println(rand);
        ArrayList <String> rand1 = new ArrayList<>();
        rand1 = rand;

        for (int i = 0; i < rand1.size(); i++) {
            String word = rand1.get(i);
            int check = 0;
            for (int j = 0; j < rand1.size(); j++) {
                if (word.equals(rand1.get(j))) {
                    check++;
                }
            }
            if (check == 1) {
                System.out.println(rand1.get(i) + " уникальное слово");
            } else {
                System.out.println(rand1.get(i) + " встречается " + check + " раз(а)");
                while (rand1.remove(word));
                i--;
            }
        }
    }
}
