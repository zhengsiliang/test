package lock;

/**
 * @author siliang.zheng
 * Date : 2018/9/5
 * Describle
 */
public class ThreadSafeCount {
    public static volatile int flag = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                for (int j = 0; j < 10000; j++) {
                    if (ThreadSafeCount.flag < 10000) {
                        synchronized (ThreadSafeCount.class) {
                            if (ThreadSafeCount.flag < 10000) {
                                ThreadSafeCount.flag++;
                            }
                        }
                    }

                }
            }).start();
        }
        try {
            Thread.sleep(5000);
            System.out.println(ThreadSafeCount.flag);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
