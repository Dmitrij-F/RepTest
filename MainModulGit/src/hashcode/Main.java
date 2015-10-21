package hashcode;

import java.util.*;

/**
 * Created by Bro on 15.10.15.
 */
public class Main {
    public static void main(String[] args) {
        Map<Itemable, Double> map = new HashMap<>(500_000, 0.75f);
        List<Itemable> list = new LinkedList<>();

        for (int i = 0; i < 10_000; i++) {
            Itemable currentItem = ItemFactory.createItemable();
            map.put(currentItem, (double) Math.random());
            list.add(currentItem);
        }

        Collections.sort(list);

//        for (Map.Entry<Item, Double> entry : map.entrySet()) {
//            System.out.println("entry = " + entry.getKey() + " >> " + entry.getValue());
//        }

        for (Itemable item : list)
            System.out.println(item);

        long startTime = System.nanoTime();
        for (Itemable currentItem : list) {
            // Longest.
            double value = map.get(currentItem);
        }
        System.out.println("Time (ms) = " + (System.nanoTime() - startTime) / 1_000_000.0);
    }
}
