package multithreading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class StreamsAPI {
    public static void main(String[] args) {
        Integer[] input = new Integer[100];
        for (int i = 0; i < 100; i++) {
            input[i] = (int) Math.round(Math.random() * 10000);
        }
        List<Integer> arrayList = Arrays.asList(input);
        System.out.println(arrayList);
        ArrayList<Integer> result = new ArrayList<>();
        while (true) {
            arrayList
                .stream()
                .parallel()
                .map(i -> i + 10000)
                .filter(i -> i > 19000)
                .sorted()
                .forEach(System.out::println);
            System.out.println(result);
        }


    }
}
