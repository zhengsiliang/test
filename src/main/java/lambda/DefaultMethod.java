package lambda;

/**
 * @author siliang.zheng
 * Date : 2018/2/26
 * Describle
 */
public class DefaultMethod {
    interface IF1{
        default void test(){
            System.out.println("IF1");
        }
    }

    interface IF2{
        default void test(){
            System.out.println("IF1");
        }
    }

    class Test1 implements IF1,IF2{
        @Override
        public void test() {
            IF1.super.test();
        }
    }
}
