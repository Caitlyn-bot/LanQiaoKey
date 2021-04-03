package Basic;

import java.util.Scanner;

/**
 * 矩形面积交
 * 问题描述
 * 平面上有两个矩形，它们的边平行于直角坐标系的X轴或Y轴。
 * 对于每个矩形，我们给出它的一对相对顶点的坐标，请你编程算出两个矩形的交的面积。
 * 输入格式
 * 输入仅包含两行，每行描述一个矩形。
 * 在每行中，给出矩形的一对相对顶点的坐标，每个点的坐标都用两个绝对值不超过10^7的实数表示。
 * 输出格式
 * 输出仅包含一个实数，为交的面积，保留到小数后两位。
 * 样例输入
 * 1 1 3 3
 * 2 2 4 4
 * 样例输出
 * 1.00
 */
public class Basic_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1, x2, x3, x4, y1, y2, y3, y4;
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        x3 = sc.nextDouble();
        y3 = sc.nextDouble();
        x4 = sc.nextDouble();
        y4 = sc.nextDouble();
        double m1, n1;// 左上角交点坐标
        double m2, n2;// 右下角交点坐标
        double a1, a2, a3, a4, a5, a6, a7, a8;
        a1 = min(x1, x2);
        a2 = min(x3, x4);
        m1 = max(a1, a2);
        a3 = min(y1, y2);
        a4 = min(y3, y4);
        n1 = max(a3, a4);
        a5 = max(x1, x2);
        a6 = max(x3, x4);
        m2 = min(a5, a6);
        a7 = max(y1, y2);
        a8 = max(y3, y4);
        n2 = min(a7, a8);
        if (m2 > m1 && n2 > n1)
            System.out.printf("%.2f", (m2 - m1) * (n2 - n1));
        else
            System.out.println("0.00");
    }

    private static double max(double x, double y) {
        if (x > y)
            return x;
        else
            return y;
    }

    private static double min(double x, double y) {
        if (x < y)
            return x;
        else
            return y;
    }

}
