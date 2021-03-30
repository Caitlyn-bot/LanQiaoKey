package Basic;

import java.util.Scanner;

/**
 * 字符串对比
 * 给定两个仅由大写字母或小写字母组成的字符串(长度介于1到10之间)，它们之间的关系是以下4中情况之一：
 * 1：两个字符串长度不等。比如 Beijing 和 Hebei
 * 2：两个字符串不仅长度相等，而且相应位置上的字符完全一致(区分大小写)，比如 Beijing 和 Beijing
 * 3：两个字符串长度相等，相应位置上的字符仅在不区分大小写的前提下才能达到完全一致（也就是说，它并不满足情况2）。比如 beijing 和 BEIjing
 * 4：两个字符串长度相等，但是即使是不区分大小写也不能使这两个字符串一致。比如 Beijing 和 Nanjing
 * 编程判断输入的两个字符串之间的关系属于这四类中的哪一类，给出所属的类的编号。
 * 输入格式
 * 包括两行，每行都是一个字符串
 * 输出格式
 * 仅有一个数字，表明这两个字符串的关系编号
 * 样例输入
 * BEIjing
 * beiJing
 * 样例输出
 * 3
 */
public class Basic_15 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        //输入的第一个字符串
        String str1 = myScanner.next();
        //输入的第二个字符串
        String str2 = myScanner.next();
        //定义字符串状态，默认两个长度不等，即状态1
        int status = 1;
        //如果完全一致，输出2
        if (str1.equals(str2)){
            status = 2;
        }else {
            if (str1.length()==str2.length()){
                //两个字符串长度相等
                //判断不区分大小写是否一致
                //调用写好的静态方法
                if (toLowercase(str1).equals(toLowercase(str2))){
                    //不区分大小写情况下两者一致
                    status = 3;
                }else {
                    //两者仅长度相等
                    status = 4;
                }
            }
        }
        System.out.println(status);
    }
    public static String toLowercase(String str){
        //该方法用来将字符串统一转为小写字母
        char[]arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            //统一将字母转为小写
            if (arr[i]>='A'&& arr[i]<='Z'){
                arr[i] = (char)(arr[i] + 32);
            }
        }
        str = String.valueOf(arr);
        return  str;
    }
}
