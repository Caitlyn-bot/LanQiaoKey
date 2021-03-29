package Basic;

import java.util.Scanner;

/**
 * 十六进制转十进制
 * 问题描述
 * 从键盘输入一个不超过8位的正的十六进制数字符串，将它转换为正的十进制数后输出。
 * 注：十六进制数中的10~15分别用大写的英文字母A、B、C、D、E、F表示。
 * 样例输入
 * FFFF
 * 样例输出
 * 65535
 */
public class Basic_11 {
    public static void main(String[] args) {
        //先将大写字母转为小写
        Scanner myScanner = new Scanner(System.in);
        String n = myScanner.next();
        //将字符串转为字符数组
        char[] arr = n.toCharArray();
        for (int i = 0;i < arr.length;i++){
            if (arr[i] >= 'A'&& arr[i] <= 'Z'){
                arr[i] = (char)(arr[i] + 32);
            }
        }
        //将转换后的字符数组转为字符串
        n = String.valueOf(arr);
        //注明是16位
        Long result = Long.parseLong(n,16);
        System.out.println(result);
    }
}
