package Basic;

import java.util.Scanner;

/**
 * Fibonacci数列
 * Fibonacci数列的递推公式为：Fn=Fn-1+Fn-2，其中F1=F2=1。
 * 当n比较大时，Fn也非常大，现在我们想知道，Fn除以10007的余数是多少。
 * 输入格式
 * 输入包含一个整数n。
 * 输出格式
 * 输出一行，包含一个整数，表示Fn除以10007的余数。
 * 样例输入
 * 10
 * 样例输出
 * 55
 * 数据规模与约定
 * 1 <= n <= 1,000,000。
 */
public class Basic_04 {
    /**
     * 思路分析
     * 原本打算先求出Fn，再对10007取余
     * 结果发现当数据规模变大后无法存储造成精度溢出，结果计算不精确
     * 改用在过程中取余
     * @param args
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        ////求Fn
        //long Fn = 1;
        //if (n == 1||n == 2){
        //    Fn = 1;
        //}else{
        //    long[] Fi = new long[n];
        //    Fi[0] = 1;
        //    Fi[1] = 1;
        //    //求出整个数列的前n项
        //    for (int i = 2;i < n;i++){
        //        Fi[i] = Fi[i-1] + Fi[i-2];
        //    }
        //    Fn = Fi[n-1];
        //}
        //long yu = Fn % 10007;
        //System.out.println(yu);
        long yu = 0;
        if (n == 1 ||n == 2){
            yu = 1;
        }else{
            long[] FiYu = new long[n];
            FiYu[0] = 1;
            FiYu[1] = 1;
            for (int i = 2; i < n; i++) {
                FiYu[i] = (FiYu[i-1] + FiYu[i-2]) % 10007;
            }
            yu=FiYu[n-1];
        }
        System.out.println(yu);
    }
}
