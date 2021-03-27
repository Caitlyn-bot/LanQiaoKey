package Basic;

import java.util.Scanner;

/**
 * 序列求和
 * 求1+2+3+...+n的值。
 * 输入格式
 * 输入包括一个整数n。
 * 输出格式
 * 输出一行，包括一个整数，表示1+2+3+...+n的值。
 * 样例输入
 * 4
 * 样例输出
 * 10
 * 数据规模与约定
 * 1 <= n <= 1,000,000,000。
 */
public class Basic_02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        //定义count存放总和
        //注意：这里不能使用int，因为int不足以存放本题的大规模结果
        long count = 0;
        for (int i = 1; i <= n;i++){
            count += i;
        }
        System.out.println(count);
    }
}
