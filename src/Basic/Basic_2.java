package Basic;

/**
 * 01字串
 * 对于长度为5位的一个01串，每一位都可能是0或1，一共有32种可能。它们的前几个是：
 * 00000
 * 00001
 * 00010
 * 00011
 * 00100
 * 请按从小到大的顺序输出这32种01串。
 * 输入格式
 * 本试题没有输入。
 * 输出格式
 * 输出32行，按从小到大的顺序每行一个长度为5的01串。
 * 样例输出
 * 00000
 * 00001
 * 00010
 * 00011
 * <以下部分省略>
 */
public class Basic_2 {
    public static void main(String[] args) {
        /*
         输出32个从小到大，其实就是0-31这32个数的二进制形式，且补足5位
         转换为二进制Integer.toBinaryString(i)
         补足五位String.format("%05d",i)
         在String.format(“%05d”, int)中 int 格式化爲格式化为至少5位十进制整数。
         出現java.util.IllegalFormatConversionException: d != java.lang.String
         发现String.format该方法不适用与二进制，进行手动补零
         使用while循环，以字符串长度作为循环条件
         */
        for (int i = 0; i < 32; i++) {
            String result =Integer.toBinaryString(i);
            while(result.length()<5){
                result = "0" + result;
            }
            System.out.println(result);
            //System.out.println(Integer.toBinaryString(i));
            //System.out.println(String.format("%05d",Integer.toBinaryString(i)));
        }

    }
}
