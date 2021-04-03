package Basic;

import java.util.Scanner;

/**
 * 完美的代价
 * 问题描述
 * 回文串，是一种特殊的字符串，它从左往右读和从右往左读是一样的。
 * 小龙龙认为回文串才是完美的。现在给你一个串，它不一定是回文的，请你计算最少的交换次数使得该串变成一个完美的回文串。
 * 交换的定义是：交换两个相邻的字符
 * 例如mamad
 * 第一次交换 ad : mamda
 * 第二次交换 md : madma
 * 第三次交换 ma : madam (回文！完美！)
 * 输入格式
 * 第一行是一个整数N，表示接下来的字符串的长度(N <= 8000)
 * 第二行是一个字符串，长度为N.只包含小写字母
 * 输出格式
 * 如果可能，输出最少的交换次数。
 * 否则输出Impossible
 * 样例输入
 * 5
 * mamad
 * 样例输出
 * 3
 */
public class Basic_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        if(IsPossible(str)) {
            System.out.println(getResult(str));
        }
        else {
            System.out.println("Impossible");
        }
        in.close();
    }
    //检验能否构成回文串
    public static boolean IsPossible(String str) {
        boolean ans = true;
        int []cnt = new int[26];
        int odds=0;
        //用数组存储数组元素下标对应的序号字母出现的次数
        for(int i = 0;i<str.length();i++) {
            cnt[str.charAt(i)-'a']++;
        }
        //统计只出现奇数次的字母的个数
        for(int i = 0;i<26;i++) {
            if(cnt[i]%2==1)
                odds++;
        }
        //如果只出现奇数次的字母多于1个，则不能构成回文串
        if(odds>1) {
            ans=false;
        }
        return ans;
    }

    //如果能够构成回文串，返回交换的次数
    public static int getResult(String str) {
        if(str.length()==1 || str.length()==2) {
            return 0;
        }

        int tmp = str.lastIndexOf(str.charAt(0));//获取首字符对应的字符在此字符串中最后一次出现处的索引
        //tmp为0说明此字符为只出现一次的字母，
        // 返回将tmp位置的字符移动到字符串最中间的次数（str.length()/2），
        // 递归调用getResult（）方法
        if(tmp==0) {
            return str.length()/2 + getResult(str.substring(1,str.length()));
        }
        else {
            //tmp不为0说明首字符有匹配的字母，
            // 移除首字母及其对应字母，
            // 返回将tmp位置的字符移动到末位置的次数（str.length()-tmp-1），
            // 递归调用getResult（）方法
            StringBuilder sb = new StringBuilder(str);
            sb.deleteCharAt(tmp);
            sb.deleteCharAt(0);
            return str.length()-tmp-1+getResult(sb.toString());
        }
    }



}
