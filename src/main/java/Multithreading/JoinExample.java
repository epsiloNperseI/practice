package Multithreading;

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("Thread is running");
        });

        thread.start();
        thread.join(); // Ожидание завершения потока

        System.out.println("Main thread finished");
    }


}
