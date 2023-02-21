package HeadFirstJava;

import java.util.concurrent.TimeUnit;

public class ThreadTestDrive {
    public static void main(String[] args) {
        ThreadTestDrive ttd = new ThreadTestDrive();

        for (int i = 0; i < 10; i++) {
            ttd.test();
        }
    }

    public void test() {
//        ExecutorService executor = Executors.newSingleThreadExecutor();
//        executor.execute(() ->
//                System.out.println("top o’ the stack"));
//        System.out.println("back in main");
//        executor.shutdown();

        Thread myThread = new Thread(() -> sleepThenPrint());
        myThread.start();
        System.out.println(Thread.currentThread().getName());
        Thread.dumpStack();
    }

    private static void sleepThenPrint() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("top o’ the stack");
        Thread.dumpStack();
    }
}
