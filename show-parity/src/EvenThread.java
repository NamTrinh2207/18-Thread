public class EvenThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Number is a: " + i);
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
