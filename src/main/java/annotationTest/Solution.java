package annotationTest;

/**
 * @author siliang.zheng
 * Date : 2018/12/7
 * Describle
 */
public class Solution {
    /**
     * @param n: The guest paid
     * @param m: the price
     * @return: the sum of the number of banknotes
     */

    public int coinProblem(int n, int m) {
        // Write your code here
        int rm=n-m;
        int count=0;
        int[] item=new int[]{100,50,20,10,5,2,1};

        for(int i=0;i<item.length;i++){
            int itemCount=rm/item[i];
            count+=itemCount;
            rm-=item[i]*itemCount;
            if(rm==0) break;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.coinProblem(100, 29);
        System.out.println(i);
    }
}