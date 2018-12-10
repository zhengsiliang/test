package classLoad;

/**
 * @author siliang.zheng
 * Date : 2018/5/29
 * Describle
 */
public class Initable {
    //编译期静态常量
    static final int staticFinal = 47;
    //非编期静态常量
    static final int staticFinal2 =
            ClassInitialization.rand.nextInt(1000);
    static {
        System.out.println("Initializing Initable");
    }
}
