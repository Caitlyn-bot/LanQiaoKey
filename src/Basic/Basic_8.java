package Basic;

/**
 * 回文数
 * 问题描述
 * 1221是一个非常特殊的数，它从左边读和从右边读是一样的，编程求所有这样的四位十进制数。
 * 输出格式
 * 按从小到大的顺序输出满足条件的四位十进制数。
 */
public class Basic_8 {
    public static void main(String[] args) {
        //该题有两种思路
        //第一、将四个数分开，对应比较
        //第二、反转字符串，与原数进行比较
        //这里采用第二种方法，更具有泛用性

        //temp用来临时存放数字
        char temp ;
        for (int i = 1000; i < 10000; i++) {
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
            if (res == i){
                System.out.println(i);
            }
        }
    }
}
