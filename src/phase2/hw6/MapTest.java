package phase2.hw6;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {

        People p1 = new People("001");
        People p2 = new People("002");
        People p3 = new People("003");
        Map<People, Integer> map1 = new HashMap<>();
        double sum = 0;
        double average;

        //Map中的key是People物件，value是金額

        map1.put(p1, 91);
        map1.put(p2, 81);
        map1.put(p3, 72);

        //實作1:請用for迴圈或者iterator，計算map1中三人的平均金額，列印到小數以下第一位。

        for (int v : map1.values()) {
            sum += v;
        }
        average = sum / map1.size();
        System.out.printf("實作1: 三人的平均金額 = %.1f%n", average);

        //實作2：現在有另一個Map(map2)，請將map2的資料利用迴圈合併到map1(相同id的People，金額必須累加),最後印出map1資料確認
        //提示 Map.containsKey()

        Map<People, Integer> map2 = new HashMap<>();
        People p4 = new People("004");
        map2.put(p1, 109);
        map2.put(p2, 219);
        map2.put(p4, 429);

        for (People p : map2.keySet()) {
            if (map1.containsKey(p)) {
                map1.replace(p, map1.get(p) + map2.get(p));
            } else {
                map1.put(p, map2.get(p));
            }
        }

        System.out.print("實作2： ");

        for (People p : map1.keySet()) {
            System.out.printf("ID_%s = %d | ", p.getId(), map1.get(p));
        }

        System.out.println();

        //實作3:現在再有另一個map3，請將map3中的資料利用迴圈再合併到目前map1(相同id的People，金額必須累加),最後印出map1資料確認
        //印出來001應該要有300，002要有400，003要有72，004要有529

        Map<People, Integer> map3 = new HashMap<>();
        map3.put(new People("001"), 100);//DO NOT CHANGE
        map3.put(new People("002"), 100);//DO NOT CHANGE
        map3.put(new People("004"), 100);//DO NOT CHANGE

        for (People p : map3.keySet()) {
            boolean found = false;
            for (People q : map1.keySet()) {
                if (q.getId().equals(p.getId())) {
                    map1.replace(q, map1.get(q) + map3.get(p));
                    found = true;
                    break;
                }
            }
            if (!found) {
                map1.put(p, map3.get(p));
            }
        }

        System.out.print("實作3： ");

        for (People p : map1.keySet()) {
            System.out.printf("ID_%s = %d | ", p.getId(), map1.get(p));
        }

        System.out.println();
    }
}