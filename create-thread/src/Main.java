public class Main {
    public static void main(String[] args) {
        NumberGenerator generator1 = new NumberGenerator();
        Thread thread1 = new Thread(generator1);
        thread1.setName("Generator 1");
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        NumberGenerator generator2 = new NumberGenerator();
        Thread thread2 = new Thread(generator2);
        thread2.setName("Generator 2");
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread2.start();
    }
}
