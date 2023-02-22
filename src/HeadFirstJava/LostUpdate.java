package HeadFirstJava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class LostUpdate {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(6);
        Balance balance = new Balance();
        for (int i = 0; i < 1000; i++) {
            pool.execute(() -> balance.increment());

        }
        pool.shutdown();
        if (pool.awaitTermination(1, TimeUnit.MINUTES)) {
            System.out.println("balance = " + balance.balance);
        }
    }
}
class Balance {
    AtomicInteger balance = new AtomicInteger(0);
    // 正確是要加上 sychronized
    public  void increment() {
        balance.incrementAndGet();
        // 超神奇，加上print thread 都可以得到1000 OAO
//        System.out.println(Thread.currentThread().getName());
    }
}
