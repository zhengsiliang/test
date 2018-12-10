package enumTest;

import annotationTest.Test;

import java.io.Serializable;

/**
 * @author siliang.zheng
 * Date : 2018/6/5
 * Describle
 */

public class Singleton implements Serializable {
    private static final long serialVersionUID = -144894508610278370L;
    private volatile static Singleton singleton;
    private static volatile boolean flag = true;

    private Singleton() {
        if (flag) {
            flag = false;
        } else {
            throw new RuntimeException("The instance  already exists ！");
        }
    }

    @Test(name = "123")
    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public Object readResolve() {
        return singleton;
    }
}
