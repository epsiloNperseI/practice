package Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

    private final Lock lock = new ReentrantLock();
    private int count = 0;

    public void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReentrantLockExample example = new ReentrantLockExample();

        Thread t1 = new Thread(example::increment);
        Thread t2 = new Thread(example::increment);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count: " + example.count);
    }

}
