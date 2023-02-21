package HeadFirstJava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ClosingTime {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        threadPool.execute(() -> longJob("Long Job"));
        threadPool.execute(() -> shortJob("Short Job"));
        threadPool.shutdown();
        try {
            boolean finished = threadPool.awaitTermination(1, TimeUnit.SECONDS);
            System.out.println("Finished? " + finished);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadPool.shutdownNow();
    }

    private static void shortJob(String shortJob) {
        try {
            TimeUnit.SECONDS.sleep(1);
            System.out.println(shortJob);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void longJob(String longJob) {
        try {
            TimeUnit.SECONDS.sleep(2);
            System.out.println(longJob);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
