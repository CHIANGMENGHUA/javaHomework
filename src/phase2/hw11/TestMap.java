package phase2.hw11;

import java.util.*;

public class TestMap {

    public static void main(String[] args) {

        List<String> classes = Arrays.asList("Java", ".Net", "CISCO",
                "iPhone App", "Python","AI智慧");
        Map<Integer,List<String>> map = new HashMap<>();

        for (String s : classes) {
            map.putIfAbsent(s.length(), new ArrayList<>());
            map.get(s.length()).add(s);
        }

        System.out.println(map.get(4));
        System.out.println(map.get(5));
        System.out.println(map.get(6));
        System.out.println(map.get(10));
    }
}
