package Basic;

import java.util.Scanner;

/**
 * 数列排序
 * 问题描述
 * 给定一个长度为n的数列，将这个数列按从小到大的顺序排列。1<=n<=200
 * 输入格式
 * 第一行为一个整数n。
 * 第二行包含n个整数，为待排序的数，每个整数的绝对值小于10000。
 * 输出格式
 * 输出一行，按从小到大的顺序输出排序后的数列。
 * 样例输入
 * 5
 * 8 3 6 4 9
 * 样例输出
 * 3 4 6 8 9
 */
public class Basic_13 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            //循环赋值
            arr[i] = myScanner.nextInt();
        }
        //tmp用来临时存放数值
        int tmp = 0;
        //冒泡排序
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                //如果前面的数大于后面的数
                if (arr[j] > arr[j + 1]){
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < n; i++) {//循环输出
            if (i != n-1){
                System.out.print(arr[i] + " ");
            }else {
                System.out.print(arr[i]);
            }

        }
    }
}
