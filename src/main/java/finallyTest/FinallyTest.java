package finallyTest;

/**
 * @author siliang.zheng
 * Date : 2018/11/14
 * Describle
 */
public class FinallyTest {
    public static void main(String[] args) {
        Integer i = print();
        System.out.println(i);

    }

    private static Integer print() {
        Integer i=11111;
        try {
            return i;
        } finally {
            i=10000;
        }
    }
}
