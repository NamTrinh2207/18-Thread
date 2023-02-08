public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        Thread thread = new Thread(oddThread);
        Thread thread1 = new Thread(evenThread);
        thread.start();
        thread.join();
        thread1.start();

    }
}
