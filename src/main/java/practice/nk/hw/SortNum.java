package practice.nk.hw;

import java.util.Scanner;

/**
 * Author: dougonghou
 * Date: 2022/6/23 10:18
 * 明明生成了NN个1到500之间的随机整数。请你删去其中重复的数字，即相同的数字只保留一个，把其余相同的数去掉，然后再把这些数从小到大排序，按照排好的顺序输出。
 */
public class SortNum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr=new int[501];
        int k=1;
        while ( k <= n && scanner.hasNext() ) {
            k++;
            int next = scanner.nextInt();
            arr[next]=next;

        }
        for (int a: arr ) {
            if(a > 0)
            System.out.println(a);
        }
    }
}
