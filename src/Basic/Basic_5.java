package Basic;

import java.util.Scanner;

/**
 * 查找整数
 * 给出一个包含n个整数的数列，问整数a在数列中的第一次出现是第几个。
 * 输入格式
 * 第一行包含一个整数n。
 * 第二行包含n个非负整数，为给定的数列，数列中的每个数都不大于10000。
 * 第三行包含一个整数a，为待查找的数。
 * 输出格式
 * 如果a在数列中出现了，输出它第一次出现的位置(位置从1开始编号)，否则输出-1。
 * 样例输入
 * 6
 * 1 9 4 8 3 9
 * 9
 * 样例输出
 * 2
 * 数据规模与约定
 * 1 <= n <= 1000。
 */
public class Basic_5 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        //n为数的个数
        int n = myScanner.nextInt();
        //arr存放数组内容
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = myScanner.nextInt();
        }
        //search为待查找的数
        int search = myScanner.nextInt();
        //赋初值为-1，如待查找的未出现则输出-1
        int Index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == search){
                //当该数第一次出现就跳出循环
                Index = i + 1;
                break;
            }
        }
        System.out.println(Index);
    }
}
