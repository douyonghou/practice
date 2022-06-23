package practice.nk.hw;

import java.util.Scanner;

/**
 * Author: dougonghou
 * Date: 2022/6/23 10:18
 * 写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字符，然后输出输入字符串中该字符的出现次数。（不区分大小写字母）
 */
public class CharNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=0;
        while (scanner.hasNext()) {
            String next = scanner.nextLine().toLowerCase();
            String next1 = scanner.nextLine().toLowerCase();
            for (char a: next.toCharArray()) {
                if (a==next1.charAt(0)) i++;
            }
            System.out.println(i);
        }
    }
}
