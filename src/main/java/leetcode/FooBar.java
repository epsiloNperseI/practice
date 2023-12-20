package leetcode;

class FooBar extends Thread {
    private int n;
    private int[] counter = new int[1];
    boolean fooTurn;

    public FooBar(int n) {
        this.n = n;
        counter[0] = n;
        fooTurn = true;
    }

    public void foo(Runnable foo) throws InterruptedException {


        for (int i = 0; i < n; i++) {
            synchronized (this) {
                while (!fooTurn) {
                    wait();
                }
                foo.run();
                fooTurn = false;
                notifyAll();
            }
        }

    }

    public void bar(Runnable bar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            synchronized (this) {
                while (fooTurn) {
                    wait();
                }
                bar.run();
                fooTurn = true;
                notifyAll();
            }
        }
    }


}
