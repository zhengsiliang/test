package thread;

/**
 * @author siliang.zheng
 * Date : 2018/10/10
 * Describle
 */
public class Interrupt {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new Worker());
        t.start();

        Thread.sleep(10);
        t.interrupt();

        System.out.println("Main thread stopped.");
    }

    public static class Worker implements Runnable {
        @Override
        public void run() {
            System.out.println("Worker started.");

            while (true) {
                System.out.println(Thread.currentThread().getState());
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println(Thread.currentThread().getState());
                    break;
                }
            }

            System.out.println("Worker stopped.");
        }
    }
}