package Basic;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 十进制转十六进制
 * 十六进制数是在程序设计时经常要使用到的一种整数的表示方式。
 * 它有0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F共16个符号，分别表示十进制数的0至15。
 * 十六进制的计数方法是满16进1，
 * 所以十进制数16在十六进制中是10，
 * 而十进制的17在十六进制中是11，
 * 以此类推，十进制的30在十六进制中是1E。
 * 给出一个非负整数，将它表示成十六进制的形式。
 * 输入格式
 * 输入包含一个非负整数a，表示要转换的数。0<=a<=2147483647
 * 输出格式
 * 输出这个整数的16进制表示
 * 样例输入
 * 30
 * 样例输出
 * 1E
 */
public class Basic_10 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        //这里选择使用BigInteger
        Long n = myScanner.nextLong();
        String result = Long.toHexString(n);
        //直接输出result时，字母为小写，题目要求为大写
        char[] arr = result.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'a'&& arr[i] <= 'f'){
                arr[i] = (char) (arr[i] - 32);
            }
        }
        result = String.valueOf(arr);
        System.out.println(result);
    }
}
