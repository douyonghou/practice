package practice.nk.hw;

import java.util.Scanner;

/**
 * Author: dougonghou
 * Date: 2022/6/23 10:18
 * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。
 */
public class HexTo10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        char[] chars = num.substring(2).toCharArray();
        int s = 0 ;
        for (int i=0; i < chars.length; i++ ) {
            char ch = chars[i];
            int k=0;
            switch (ch){
                case 'A': k=10; break;
                case 'B': k=11; break;
                case 'C': k=12; break;
                case 'D': k=13; break;
                case 'E': k=14; break;
                case 'F': k=15; break;
                default: k = Integer.parseInt(ch+"");
            }
            double pow = Math.pow(16, chars.length - i - 1) * k;
            s = s + (int)pow;
        }
        System.out.println(s);
    }
}
