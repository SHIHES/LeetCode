package HeadFirstJava;

public class Synchronized {
    public static void main(String[] args) {

        Number number = new Number(0);
        Thread threadA = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                number.plus(1);
            }
        }, "Thread A");

        Thread threadB = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                number.minus(1);
            }
        }, "Thread B");

        threadA.start();
        threadB.start();
    }
}
class Number {
    private int value;

    public Number(int value) {
        this.value = value;
    }

    public synchronized void plus(int increment) {
        value += increment;
        System.out.println(Thread.currentThread().getName() + " is executing plus() method. Value is now " + value);
    }

    public synchronized void minus(int decrement) {
        value -= decrement;
        System.out.println(Thread.currentThread().getName() + " is executing minus() method. Value is now " + value);
    }
}
