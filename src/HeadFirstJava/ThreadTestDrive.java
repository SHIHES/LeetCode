package HeadFirstJava;

import java.util.concurrent.TimeUnit;

public class ThreadTestDrive {

    /**
     * ouput 結果會是
     * main
     * main
     * main
     *
     * dumpstack exception msg
     * dumpstack exception msg
     * dumpstack exception msg
     *
     * top...
     * top...
     * top...
     *
     * dumpstack exception msg
     * dumpstack exception msg
     * dumpstack exception msg
     *
     * 每個thread的執行是根據method stack 來決定，因此即使test function已執行完再執行下一個test function了
     * 對於子線程來說是沒有結束的，因為子線程堆疊的method stack 是 Dummy.run()，並沒有包含test function
     * @param args
     */
    public static void main(String[] args) {
        ThreadTestDrive ttd = new ThreadTestDrive();

        ttd.test();
        ttd.test();
        ttd.test();
        ttd.test();
        ttd.test();
        ttd.test();
        ttd.test();
        ttd.test();
        ttd.test();
    }

    public void test() {
//        ExecutorService executor = Executors.newSingleThreadExecutor();
//        executor.execute(() ->
//                System.out.println("top o’ the stack"));
//        System.out.println("back in main");
//        executor.shutdown();


        Runnable runnable = new Dummy();
        Thread myThread = new Thread(runnable);
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

    static class Dummy implements Runnable{
        @Override
        public void run() {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("top o’ the stack");
            Thread.dumpStack();
        }
    }
}
