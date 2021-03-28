package Basic;

import java.util.Scanner;

/**
 * 杨辉三角形
 * 杨辉三角形又称Pascal三角形，它的第i+1行是(a+b)i的展开式的系数。
 * 它的一个重要性质是：三角形中的每个数字等于它两肩上的数字相加。
 * 下面给出了杨辉三角形的前4行：
 *    1
 *   1 1
 *  1 2 1
 * 1 3 3 1
 * 给出n，输出它的前n行。
 * 输入格式
 * 输入包含一个数n。
 * 输出格式
 * 输出杨辉三角形的前n行。每一行从这一行的第一个数开始依次输出，中间使用一个空格分隔。请不要在前面输出多余的空格。
 * 样例输入
 * 4
 * 样例输出
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 数据规模与约定
 * 1 <= n <= 34。
 */
public class Basic_6 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        //n记录要输出的行数
        int n = myScanner.nextInt();
        int[][] arr = new int[n][];
        //每一行的数是行数加一，第0行一个，第1行二个
        for (int i = 0; i < arr.length; i++) {//遍历每一个一维数组
            arr[i] = new int[i+1];
            //遍历给一维数组的每一个元素赋值
            for (int j = 0 ;j < arr[i].length; j++){
                if (j == 0||j== arr[i].length-1){
                    arr[i][j] = 1;
                }else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }
        //遍历输出二维数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0;j < arr[i].length; j++){
                if (j!=arr[i].length-1){
                    System.out.print(arr[i][j] + " ");
                }else {
                    System.out.print(arr[i][j] + "\n");
                }
            }
        }
    }
}
