package Multithreading;

public class WaitNotifyExample {
    private final Object monitor = new Object();
    private boolean condition = false;

    public void produce() throws InterruptedException {
        synchronized (monitor) {
            System.out.println("Producer is running");
            condition = true;
            monitor.notify();
        }
    }

    public void consume() throws InterruptedException {
        synchronized (monitor) {
            while (!condition) {
                monitor.wait();
            }
            System.out.println("Consumer is running");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        WaitNotifyExample example = new WaitNotifyExample();

        Thread consumerThread = new Thread(() -> {
            try {
                example.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread producerThread = new Thread(() -> {
            try {
                example.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        consumerThread.start();
        Thread.sleep(1000); // Для демонстрации, что потребитель ждет
        producerThread.start();

        consumerThread.join();
        producerThread.join();
    }
}


