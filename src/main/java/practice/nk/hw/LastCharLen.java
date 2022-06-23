package practice.nk.hw;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Author: dougonghou
 * Date: 2022/6/23 10:18
 * 计算字符串最后一个单词的长度，单词以空格隔开，字符串长度小于5000。（注：字符串末尾不以空格为结尾）
 */
public class LastCharLen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String next = scanner.nextLine();
            String pattern = ".* ([\\S]+$)";
            Pattern r = Pattern.compile(pattern);
            Matcher matcher = r.matcher(next);
            if (matcher.find()) {
                System.out.println(matcher.group(1).length());
            }else {
                System.out.println(next.length());
            }
        }
    }
}
