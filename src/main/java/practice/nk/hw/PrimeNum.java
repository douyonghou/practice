package practice.nk.hw;

import java.util.Scanner;

/**
 * Author: dougonghou
 * Date: 2022/6/23 14:30
 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质因子（重复的也要列举）（如180的质因子为2 2 3 3 5 ）
 */
public class PrimeNum {
    public  static int primeNum(int primeNum){
        if(primeNum % 2 == 0){
            // 偶数
            for (int i=2; i <= primeNum; i = i + 2){
                if(primeNum % i == 0){
                    System.out.print(i + " ");
                    return primeNum(primeNum / i);
                }
            }
        }else {
            // 奇数
            for (int i=3; i <= primeNum; i = i + 2){
                if(primeNum % i == 0){
                    System.out.print(i + " ");
                    return primeNum(primeNum / i);
                }
            }
        }

        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        primeNum(num);
    }
}
