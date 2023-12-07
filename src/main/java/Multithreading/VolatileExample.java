package Multithreading;

public class VolatileExample {
    private volatile boolean flag = false;

    public void writer() {
        flag = true;
    }

    public void reader() {
        if (flag) {
            System.out.println("Flag is true");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileExample example = new VolatileExample();
        Thread writerThread = new Thread(example::writer);
        Thread readerThread = new Thread(example::reader);

        writerThread.start();
        readerThread.start();

        writerThread.join();
        readerThread.join();
    }
}

