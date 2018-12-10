package thread;

import java.util.concurrent.Executors;

/**
 * @author siliang.zheng
 * Date : 2018/10/15
 * Describle
 */
public class VolatileExample {
    int a = 0;
    boolean flag = false;

    public void writer() {
        a = 1; // 1
        flag = true; // 2
    }

    public void reader() {
        while (true) { // 3
            if (flag){
                if (a == 0) {
                    System.out.println(a);
                }
                break;
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i=0;;i++) {
            VolatileExample volatileExample = new VolatileExample();
            Thread t1 = new Thread(() -> volatileExample.writer());
            t1.start();
            volatileExample.reader();
            t1.join();
        }
    }
}