import java.util.Random;

public class Car implements Runnable{
    public static int DISTANCE = 100;
    public static int STEP = 2;

    // Khai báo Tên của xe đua
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        // Khởi tạo điểm start(hay km ban đầu)
        int runDistance = 0;
        // Khởi tạo time bắt đầu cuộc đua
        long startTime = System.currentTimeMillis();

        // Kiểm tra chừng nào còn xe chưa kết thúc quãng đường đua thì xe vẫn tiếp tục chạy
        while (runDistance < DISTANCE) {
            try {
                // Calculate traveled distance
                runDistance += (new Random()).nextInt(20);
                // Build result graphic
                StringBuilder log = new StringBuilder("|");
                int percentTravel = (runDistance * 100) / DISTANCE;
                for (int i = 0; i < DISTANCE; i += STEP) {
                    if (percentTravel >= i + STEP) {
                        log.append("=");
                    } else if (percentTravel >= i && percentTravel < i + STEP) {
                        log.append("O");
                    } else {
                        log.append("-");
                    }
                }
                log.append("|");
                System.out.println("Car" + this.name + ": " + log + " " + Math.min(DISTANCE, runDistance) + "KM");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car" + this.name + " broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.name + " Finish in " + (endTime - startTime) / 1000 + "s");
    }
}