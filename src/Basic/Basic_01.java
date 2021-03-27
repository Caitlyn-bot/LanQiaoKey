package Basic;

import java.util.Scanner;

/**
 * A+B问题
 * 输入A、B，输出A+B。
 * 输入格式
 * 输入的第一行包括两个整数，由空格分隔，分别表示A、B。
 * 输出格式
 * 输出一行，包括一个整数，表示A+B的值。
 * 样例输入
 * 12 45
 * 样例输出
 * 57
 * 数据规模与约定
 * -10000 <= A, B <= 10000。
 */
public class Basic_01 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int a = myScanner.nextInt();
        int b = myScanner.nextInt();
        System.out.println(a + b);
    }
}
