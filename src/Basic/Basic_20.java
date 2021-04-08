package Basic;

import java.util.Scanner;

/**
 * 数的读法
 * Tom教授正在给研究生讲授一门关于基因的课程，有一件事情让他颇为头疼：
 * 一条染色体上有成千上万个碱基对，它们从0开始编号，到几百万，几千万，甚至上亿。
 * 比如说，在对学生讲解第1234567009号位置上的碱基时，光看着数字是很难准确的念出来的。
 * 所以，他迫切地需要一个系统，然后当他输入12 3456 7009时，会给出相应的念法：
 * 十二亿三千四百五十六万七千零九
 * 用汉语拼音表示为
 * shi er yi san qian si bai wu shi liu wan qi qian ling jiu
 * 这样他只需要照着念就可以了。
 * 你的任务是帮他设计这样一个系统：
 * 给定一个阿拉伯数字串，你帮他按照中文读写的规范转为汉语拼音字串，相邻的两个音节用一个空格符格开。
 * 注意必须严格按照规范，
 * 比如说“10010”读作“yi wan ling yi shi”而不是“yi wan ling shi”，
 * “100000”读作“shi wan”而不是“yi shi wan”，“2000”读作“er qian”而不是“liang qian”。
 * 输入格式
 * 有一个数字串，数值大小不超过2,000,000,000。
 * 输出格式
 * 是一个由小写英文字母，逗号和空格组成的字符串，表示该数的英文读法。
 * 样例输入
 * 1234567009
 * 样例输出
 * shi er yi san qian si bai wu shi liu wan qi qian ling jiu
 */
public class Basic_20 {
    public static void main(String[] args) {
        //可以使用int
        //java中int的取值范围为-2147483648到+-2147483648
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        scanner.close();

        int len = str.length();
        int n = len; //用来做循环判断
        int m = n; //用来遍历每一位
        int[] a = new int[n]; //保存输入的数字
        StringBuffer b = new StringBuffer(); //存放输出

        for (int i = 0; i < len; i++) {
            if (i < n - 1)
                a[i] = Integer.parseInt(str.substring(i, i + 1));
            else
                a[i] = Integer.parseInt(str.substring(n - 1));
        }

        for (int i = 0; i < len; i++) {
            if (len == 1 && a[i] == 0) {
                System.out.println("ling");
            }
            if (m == 10) { // 十亿
                if (a[i] == 1)
                    b.append("shi ");
                else
                    b.append("er shi ");
            }
            if (m == 9) { // 亿
                if (a[i] > 0) {
                    b.append(check(a[i]) + " yi ");
                } else {
                    if (a[i] == 0) {
                        b.append(" yi ");
                    }
                }
            }
            if (m == 8) { // 千万
                if (a[i] > 0) {
                    b.append(check(a[i]) + " qian ");
                } else {
                    if (a[i] == 0 && a[i + 1] != 0) {
                        b.append("ling ");
                    }
                }
            }
            if (m == 7) { // 百万
                if (a[i] > 0) {
                    b.append(check(a[i]) + " bai ");
                } else {
                    if (a[i] == 0 && a[i + 1] != 0) {
                        b.append("ling ");
                    }
                }
            }
            if (m == 6) { // 十万
                if (a[i] > 0) {
                    if (a[i] == 1) {
                        b.append("shi "); //注意：不能输入yi shi wan，而应该是shi wan
                    } else {
                        b.append(check(a[i]) + " shi ");
                    }
                } else {
                    if (a[i] == 0 && a[i + 1] != 0) {
                        b.append("ling ");
                    }
                }
            }
            if (m == 5) { // 万
                if (a[i] > 0) {
                    b.append(check(a[i]) + " wan ");
                } else {
                    if (a[i] == 0 && a[i + 1] != 0) {
                        b.append("ling ");
                    } else {
                        //注意:当千万,百万,十万位都为0且万位不为0时候,不会输出万,例如:十三亿,二十亿
                        if (a[i - 1] != 0 || a[i - 2] != 0 || a[i - 3] != 0)
                            b.append("wan ");
                    }
                }
            }
            if (m == 4) { // 千
                if (a[i] > 0) {
                    b.append(check(a[i]) + " qian ");
                } else {
                    if (a[i] == 0 && a[i + 1] != 0) {
                        b.append("ling ");
                    }
                }
            }
            if (m == 3) { // 百
                if (a[i] > 0) {
                    b.append(check(a[i]) + " bai ");
                } else {
                    if (a[i] == 0 && a[i + 1] != 0) {
                        b.append("ling ");
                    }
                }
            }
            if (m == 2) { // 十
                if (a[i] > 0) {
                    if (a[i] == 1) {
                        b.append("shi "); //注意：不能输入yi shi，而应该是shi
                    } else {
                        b.append(check(a[i]) + " shi ");
                    }
                } else {
                    if (a[i] == 0 && a[i + 1] != 0) {
                        b.append("ling ");
                    }
                }
            }
            if (m == 1) { // 个
                if (a[i] > 0) {
                    b.append(check(a[i]));
                }
            }
            m--;
        } // End for
        System.out.println(b);
    }

    public static String check(int i) {
        String s = "";
        switch (i) {
            case 1:s = "yi";break;
            case 2:s = "er";break;
            case 3:s = "san";break;
            case 4:s = "si";break;
            case 5:s = "wu";break;
            case 6:s = "liu";break;
            case 7:s = "qi";break;
            case 8:s = "ba";break;
            case 9:s = "jiu";break;
        }
        return s;
    }

}
