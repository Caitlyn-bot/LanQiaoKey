package Basic;

/**
 * 特殊的数字
 * 问题描述
 * 153是一个非常特殊的数，它等于它的每位数字的立方和，即153=1*1*1+5*5*5+3*3*3。
 * 编程求所有满足这种条件的三位十进制数。
 * 输出格式
 * 按从小到大的顺序输出满足条件的三位十进制数，每个数占一行。
 */
public class Basic_7 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            //a存放百位
            int a = i/100;
            //b存放十位
            int b = (i%100)/10;
            //c存放个位
            int c = i%10;
            if (i == (a * a * a + b * b * b + c * c * c)){//判断满足条件
                //输出该数，每行一个，默认就是从小到大
                System.out.println(i);
            }
        }
    }
}
