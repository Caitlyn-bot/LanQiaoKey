package Basic;

import java.util.Scanner;

/**
 * 特殊回文数
 * 问题描述
 * 123321是一个非常特殊的数，它从左边读和从右边读是一样的。
 * 输入一个正整数n， 编程求所有这样的五位和六位十进制数，满足各位数字之和等于n 。
 * 输入格式
 * 输入一行，包含一个正整数n。
 * 输出格式
 * 按从小到大的顺序输出满足条件的整数，每个整数占一行。
 * 样例输入
 * 52
 * 样例输出
 * 899998
 * 989989
 * 998899
 * 数据规模和约定
 * 1<=n<=54。
 */
public class Basic_9 {
    public static void main(String[] args) {
        /**
         * 要各个位数之和等于一个数
         * 要将各个位数分开求和
         * 同时保证是回文数
         */
        Scanner myScanner = new Scanner(System.in);
        //n就是各个位数相加的和
        int n = myScanner.nextInt();
        //temp用来临时存放数字
        char temp ;
        //要求是五位数和六位数
        for (int i = 10000 ;i < 1000000;i++){
            //将数字转为char类型的数组
            char[] arr = String.valueOf(i).toCharArray();
            //因为如果是单数，中间的数不必动，所以折半对应进行交换
            for (int j = 0; j < arr.length/2;j++){
                temp = arr[j];
                arr[j] = arr[arr.length - 1 - j];
                arr[arr.length - 1 - j] = temp;
            }
            //将反转后的数组转为int，即反转后的数字
            int res = Integer.parseInt(String.valueOf(arr));
            if (res == i){//此时该数为回文数，只需判断各个位数之和
                int total = 0;
                for (int k = 0; k < arr.length;k++){
                    total = total + Integer.parseInt(String.valueOf(arr[k]));
                }
                if (total == n){
                    //如果其各个位数之和等于n，则符合条件，进行输出
                    System.out.println(i);
                }
            }
        }
    }
}
