package homework23;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String [] words = {"Rasta", "Gasta", "Gastal", "df", "Rasta", "Gasta", "Gastal", "gfdfg", "Rasta", "Gasta", "gfdfg", "fdgf"};
        Map <String, Integer> map = new HashMap<>();
        for (String sl: words) {
            map.put(sl, map.getOrDefault(sl, 0) + 1);
        }

        System.out.println(map + " и количество уникальных слов " + map.size());
    }
}
