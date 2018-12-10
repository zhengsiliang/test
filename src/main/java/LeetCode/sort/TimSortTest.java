package LeetCode.sort;

/**
 * @author siliang.zheng
 * Date : 2018/5/23
 * Describle
 */
public class TimSortTest {
    public static void main(String[] args) {
        int MIN_MERGE = 32;
        int n = 657;
        int r = 0;      // 只要不是 2的幂就会置 1
        while (n >= MIN_MERGE) {
            r |= (n & 1);
            System.out.println(n&1);
            System.out.println(r);
            n >>= 1;
            System.out.println(n);
        }
        System.out.println("result:"+(n + r));
    }
}
