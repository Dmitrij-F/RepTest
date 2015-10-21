package MultiThreading;


import com.sun.xml.internal.bind.v2.util.CollisionCheckStack;
import sun.awt.image.ImageWatched;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest implements Runnable{

    private int[] m;
    private Lock mylock;
    private Condition c;
    private Object os = new Object();


    ThreadTest(int[] m) {
        this.m = m;

        mylock = new ReentrantLock();
        c = mylock.newCondition();

    }


    public static void main(String[] args) throws InterruptedException {

        int[] c = new int[10000000];
        ThreadTest r = new ThreadTest(c);

        BlockingQueue<File> ff = new ArrayBlockingQueue<File>(1);
        ConcurrentHashMap oc = new ConcurrentHashMap(25);
        List<String> ol = Collections.synchronizedList(new ArrayList<String>());
        Executors.newCachedThreadPool().submit(new Runnable() {
            @Override
            public void run() {

            }
        });


/*        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(r);
//            System.out.println(t.getState().toString());
//            t.setDaemon(true);
            t.start();
//            System.out.println(t.getState().toString());

//            if (i==5) sum5=sum;
//            sum+=i;
        }*/

//        System.out.println(sum);

//        System.out.println(t.getState());

//        t.setPriority(10);
//        t.notify();
//        t.getUncaughtExceptionHandler();
//        System.out.println(t.getState());

        new Thread(new Runnable() {

            @Override
            public void run() {
                new ThreadTest(c).pro();
            }
        }).start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                new ThreadTest(c).pro();
            }
        }).start();

    }


    void pro() {
        for (int i = 0; i < m.length; i++) {
            m[i] = (int) (Math.random() * 1000000000);
            System.out.println(m[i]);
        }
    }


    @Override
    public void run() {


        mylock.lock();
        mylock.tryLock();
//        Monitor.class;
        try {
            while (true) {

//                Thread.sleep(2000);
                System.out.println("thread");
//                c.await();
                //wait(1000);

                for (int i = 0; i < m.length; i++) {
                    m[i] = (int) (Math.random() * 1000000000);
                    System.out.println(m[i]);
                }
//                notify();
//                System.out.println(Thread.State.RUNNABLE);

//                c.signalAll();
            }
        } finally {
//        mylock.unlock();
        }
    }
}
