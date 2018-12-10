package offer;

import java.math.BigDecimal;
import java.util.*;

/**
 * @author siliang.zheng
 * Date : 2018/10/31
 * Describle
 */
public class Jump {
    public List<Map.Entry<Integer, Double>> dicesSum(int n) {
        final int face = 6;
        final int pointNum = face * n;
        long[][] dp = new long[n + 1][pointNum + 1];

        for (int i = 1; i <= face; i++)
            dp[1][i] = 1;

        for (int i = 2; i <= n; i++)
            for (int j = i; j <= pointNum; j++)     /* 使用 i 个骰子最小点数为 i */
                for (int k = 1; k <= face && k <= j; k++)
                    dp[i][j] += dp[i - 1][j - k];

        final double totalNum = Math.pow(6, n);
        List<Map.Entry<Integer, Double>> ret = new ArrayList<>();
        for (int i = n; i <= pointNum; i++)
            ret.add(new AbstractMap.SimpleEntry<>(i, dp[n][i] / totalNum));

        return ret;
    }
    public int LastRemaining_Solution(int n, int m) {
        if (n == 0)     /* 特殊输入的处理 */
            return -1;
        if (n == 1)     /* 递归返回条件 */
            return 0;
        return (LastRemaining_Solution(n - 1, m) + m) % n;
    }

    public int Sum_Solution(int n) {
        int sum = n;
        boolean b = (n > 0) && ((sum += Sum_Solution(n - 1)) > 0);
        return sum;
    }
    public static void main(String[] args) {
        Jump jump = new Jump();
        //List<Map.Entry<Integer, Double>> entries = jump.dicesSum(4);
        //for (Map.Entry e:entries) {
        //    System.out.println(e.getKey()+":"+e.getValue());
        //}
        //int i = jump.LastRemaining_Solution(3, 2);
        //System.out.println(i);
        //int i = jump.Sum_Solution(1);
        //System.out.println(i);

        double d=4.015;
        BigDecimal bigDecimal=new BigDecimal(Double.valueOf(d).toString());
        System.out.println(d*100);
        System.out.println(bigDecimal.multiply(BigDecimal.valueOf(100)));

    }
}
