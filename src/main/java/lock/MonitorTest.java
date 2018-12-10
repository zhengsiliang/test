package lock;


/**
 * @author siliang.zheng
 * Date : 2018/11/14
 * Describle
 */
public class MonitorTest {
    private Object lock;

    private int value=0;
    public void incream(){
        synchronized(lock){
            value++;
        }
    }
}
