package lock;

public class Demo1 {
    volatile boolean flag = false;
    long value = 0;

    public void methodA() {
        value = 1 << 33;
    }

    public void methodB() {
        value = 1 << 32;

        if (value != 1 << 33 && value != 1 << 32) {
            System.out.println(value);
        }

    }

    public static void main(String[] args) {
        while (true) {
            Demo1 demo1 = new Demo1();
            Thread t1 = new Thread(() -> {
                demo1.methodA();
            });

            Thread t2 = new Thread(() -> {
                demo1.methodB();
            });

            t2.start();
            t1.start();
        }
    }
}
