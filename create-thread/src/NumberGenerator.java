import java.util.Objects;

public class NumberGenerator implements Runnable{
    private String generator;
    public NumberGenerator() {
    }

    public NumberGenerator(String generator) {
        this.generator = generator;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("running generator is:" + Thread.currentThread().hashCode());
                System.out.println("running priority is:" + Thread.currentThread().getPriority());
                Thread.sleep(500);
            }
            System.out.println("My generator run end");
        } catch (InterruptedException e) {
            System.out.println("my thread interrupted");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumberGenerator that = (NumberGenerator) o;
        return Objects.equals(generator, that.generator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(generator);
    }
}
