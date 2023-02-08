public class OddThread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Number is a: " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
