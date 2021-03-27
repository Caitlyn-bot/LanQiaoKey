package Basic;

import java.util.Scanner;

/**
 * 圆的面积
 * 给定圆的半径r，求圆的面积。
 * 输入格式
 * 输入包含一个整数r，表示圆的半径。
 * 输出格式
 * 输出一行，包含一个实数，四舍五入保留小数点后7位，表示圆的面积。
 * 样例输入
 * 4
 * 样例输出
 * 50.2654825
 * 数据规模与约定
 * 1 <= r <= 10000。
 * 提示
 * 本题对精度要求较高，请注意π的值应该取较精确的值。
 * 你可以使用常量来表示π，比如PI=3.14159265358979323，
 * 也可以使用数学公式来求π，比如PI=atan(1.0)*4。
 */
public class Basic_03 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int r = myScanner.nextInt();
        double PI = 3.14159265358979323;
        double s = 0;
        s = PI*r*r;
        //String.format("",Object);
        //其中第一个参数表示格式，%.3f表示浮点数，小数点后面3位
        System.out.println(String.format("%.7f",s));
    }
}
