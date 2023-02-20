package HeadFirstJava;

class RunTester {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println(Thread.currentThread().getName() + ": back in main");
        Thread.dumpStack();
    }
}

