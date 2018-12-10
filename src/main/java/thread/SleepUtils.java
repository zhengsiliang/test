package thread;

import java.util.concurrent.TimeUnit;

/**
 * @author siliang.zheng
 * Date : 2018/10/16
 * Describle
 */
public class SleepUtils {
    public static final void second(long seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
        }
    }
}
