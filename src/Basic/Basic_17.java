package Basic;

import java.util.Scanner;

/**
 * 矩阵乘法
 * 给定一个N阶矩阵A，输出A的M次幂（M是非负整数）
 * 输入格式
 * 第一行是一个正整数N、M（1<=N<=30, 0<=M<=5），表示矩阵A的阶数和要求的幂数
 * 接下来N行，每行N个绝对值不超过10的非负整数，描述矩阵A的值
 * 输出格式
 * 输出共N行，每行N个整数，表示A的M次幂所对应的矩阵。相邻的数之间用一个空格隔开
 * 样例输入
 * 2 2
 * 1 2
 * 3 4
 * 样例输出
 * 7 10
 * 15 22
 */
public class Basic_17 {
    /**
     * 注意考虑特殊的单位矩阵，0次幂
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //n存放矩阵的阶数
        int n = scanner.nextInt();
        //m存放矩阵的次幂
        int m =scanner.nextInt();
        //arr存放最初的矩阵
        int[][] arr = new int[n][n];
        //res存放结果矩阵
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
                res[i][j] = arr[i][j];
            }
        }
        if (m != 0){//当为零时，是单位矩阵
            //运算m次矩阵乘法
            for (int i = 0; i < m - 1; i++) {
                //将数组临时存放，避免中途赋值影响矩阵数值从而影响计算结果
                int[][] temp = new int[n][n];
                //开始运算
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        //给res[i][j]进行赋值
                        //int tmp临时存放矩阵中的部分值
                        int tmp = 0;
                        for (int l = 0; l < n; l++) {
                            tmp += res[j][l] * arr[l][k];
                        }
                        temp[j][k] = tmp;
                    }
                }
                //将结果赋值给结果矩阵
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        res[j][k] = temp[j][k];
                    }
                }
            }
        }else {
            //将结果矩阵转为单位矩阵
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j){
                        res[i][j] = 1;
                    }else {
                        res[i][j] = 0;
                    }
                }
            }
        }

        //输出结果矩阵
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
