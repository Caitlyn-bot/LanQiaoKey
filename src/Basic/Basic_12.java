package Basic;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 十六进制转八进制
 * 问题描述
 * 给定n个十六进制正整数，输出它们对应的八进制数。
 * 输入格式
 * 输入的第一行为一个正整数n （1<=n<=10）。
 * 接下来n行，每行一个由0~9、大写字母A~F组成的字符串，表示要转换的十六进制正整数，每个十六进制数长度不超过100000。
 * 输出格式
 * 输出n行，每行为输入对应的八进制正整数。
 *【注意】
 * 输入的十六进制数不会有前导0，比如012A。
 * 输出的八进制数也不能有前导0。
 * 样例输入
 * 2
 * 39
 * 123ABC
 * 样例输出
 * 71
 * 4435274
 *【提示】
 * 先将十六进制数转换成某进制数，再由某进制数转换成八进制。
 */
public class Basic_12 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        //n里面存放要输入的数值个数
        int n = myScanner.nextInt();
        //arr数组存放待转换的数
        String[] arr = new String[n];
        //res数组存放转换结束的数
        String[] res = new String[n];
        //循环赋值，并转换
        for (int i = 0; i < n;i++){
            arr[i] = myScanner.next();
            //字符串转字符数组，大写转小写
            char[] c = arr[i].toCharArray();
            for (int j = 0; j < c.length; j++) {
                if (c[j] >= 'A'&& c[j] <= 'Z'){
                    c[j] = (char)(c[j] + 32);
                }
            }
            arr[i] = String.valueOf(c);
            //将十六进制转为八进制
            res[i] = new BigInteger(arr[i],16).toString(8);
        }
        for (int i = 0; i < n; i++) {
            //输出
            System.out.println(res[i]);
        }
    }
}
