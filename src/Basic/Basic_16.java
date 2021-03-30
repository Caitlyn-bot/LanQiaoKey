package Basic;


import java.util.Scanner;

/**
 * 分解质因数
 * 求出区间[a,b]中所有整数的质因数分解。
 * 输入格式
 * 输入两个整数a，b。
 * 输出格式
 * 每行输出一个数的分解，形如k=a1*a2*a3...(a1<=a2<=a3...，k也是从小到大的)(具体可看样例)
 * 样例输入
 * 3 10
 * 样例输出
 * 3=3
 * 4=2*2
 * 5=5
 * 6=2*3
 * 7=7
 * 8=2*2*2
 * 9=3*3
 * 10=2*5
 * 提示
 * 先筛出所有素数，然后再分解。
 * 数据规模和约定
 * 2<=a<=b<=10000
 */
public class Basic_16 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int a = myScanner.nextInt();
        int b = myScanner.nextInt();
        //求素数
        for (int i = a; i <= b ; i++) {
            if (prime(i)){//是素数
                System.out.println(i + "=" + i);
            }else {//分解质因数
                Decomposition(i);
            }
        }

    }

    /**
     * 这个方法用来判断是否为素数
     * 返回false说明不是素数
     * 返回true说明是素数
     * @param num
     * @return
     */
    public static boolean prime(int num){
        boolean flag =true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                flag = false;
            }
        }
        return flag;
    }

    /**
     *这个方法用来分解质因数
     * @param num
     */
    public static void Decomposition(int num){
        int temp = 2;
        int count = 0;
        //cout存放用来输出的值
        String cout ="";
        while(num!=1){
            if (num % temp == 0){
                if (count == 0){
                    //说明是第一个因子
                    cout = cout + num + "=" + temp;
                    count = 1;
                }else {
                    //不是第一个因子
                    cout = cout + "*" + temp;
                }
                //当得到一个因子时，将从2从头开始
                num = num / temp;
                temp = 2;
            }else {
                //未得到因子
                temp++;
            }
        }
        //当跳出循环,说明已经是最后一个因子了,输出并换行
        System.out.print(cout + "\n");
    }

}
