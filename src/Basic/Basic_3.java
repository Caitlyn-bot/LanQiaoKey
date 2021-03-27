package Basic;

import java.util.Scanner;

/**
 * 字母图形
 * 利用字母可以组成一些美丽的图形，下面给出了一个例子：
 *
 * ABCDEFG
 * BABCDEF
 * CBABCDE
 * DCBABCD
 * EDCBABC
 * 这是一个5行7列的图形，请找出这个图形的规律，并输出一个n行m列的图形。
 * 输入格式
 * 输入一行，包含两个整数n和m，分别表示你要输出的图形的行数的列数。
 * 输出格式
 * 输出n行，每个m个字符，为你的图形。
 * 样例输入
 * 5 7
 * 样例输出
 * ABCDEFG
 * BABCDEF
 * CBABCDE
 * DCBABCD
 * EDCBABC
 * 数据规模与约定
 * 1 <= n, m <= 26。
 */
public class Basic_3 {
    public static void main(String[] args) {
        /**
         * 每一行都是先倒序输出，然后正序，关键就在于每一行A所在的位置
         * 注意：当m<n时和m>n时是不一样的
         * 考虑左半边能否完全输出，如果m>n时，右半边不会输出
         */
        Scanner myScanner = new Scanner(System.in);
        //n为行数
        int n = myScanner.nextInt();
        //m为列数
        int m = myScanner.nextInt();
        for (int i = 0;i < n;i++){
            if (i < m){//即左半边能够完全输出

                //先进行左半边的输出
                for (int j = 0;j < i;j++){
                    //将结果从int转为char
                    System.out.print((char)('A'+i-j));
                }

            }else {//左半边输出一部分，右半边不输出
                //先进行左半边的输出
                for (int j = 0;j < m;j++){
                    //将结果从int转为char
                    System.out.print((char)('A'+i-j));
                }

            }

            //进行右半边的输出当左半边不完全输出时,i>m，循环条件不成立，自然就不输出
            for (int k = i;k < m;k++){
                //将结果从int转为char
                System.out.print((char)('A'+k-i));
            }
            //进行换行
            System.out.print("\n");
        }


    }
}
