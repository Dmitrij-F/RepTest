package multithreading;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;


public class ForkJoin extends RecursiveAction {
    static int[] inputData;
    int beginning;
    int length;
    static int[] result;
    static int dataSize = 10000000;

    @Override
    protected void compute() {
        if (length < 10) {
            System.out.println(String.format("Computing directly from [%d] to [%d]", beginning, beginning + length));
            computeDirectly();
            return;
        }

        int split = length / 2;

        System.out.println(String.format(
                "Splitting task [%d to %d] into two:\n\tFirst half [from %d to %d]\n\tSecond half [from %d to %d]",
                beginning,
                beginning + length,
                beginning, beginning + split,
                beginning + split + 1, beginning + length
            )
        );

        invokeAll(new ForkJoin(inputData, beginning, split, result),
            new ForkJoin(inputData, beginning + split, length - split, result));
    }

    public int process(int input) {
        return input * (input - 1) * (input - input * input);
    }

    public void computeDirectly() {
        for (int i = beginning; i < beginning + length - 1; i++) {
            if (i > 0 && i < dataSize) {
                result[i] = process(inputData[i]);
            }
        }
    }

    ForkJoin(int[] input, int beginning, int length, int[] result) {
        inputData = input;
        this.beginning = beginning;
        this.length = length;
        this.result = result;
    }

    public static void main(String[] args) {
        System.out.println("Hello!");

        inputData = new int[dataSize];
        result = new int[dataSize];
        for (int i = 0; i < dataSize; i++) {
            inputData[i] = (int) Math.round(Math.random() * 10000);
        }

        ForkJoin fork = new ForkJoin(inputData, 0, dataSize, result);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(fork);
    }
}
