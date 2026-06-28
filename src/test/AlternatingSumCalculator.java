package test;

import java.util.Scanner;

public class AlternatingSumCalculator {
    public static void main(String[] args) {
        /*小诗诗开始学习数列啦。现在他想计算以下数列前n项的和:
        S(n)=1-2+3-4+..
        示例1:
        输入:4
        说明:S(4)=1-2+3-4=-2
        输出:-2*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int n = sc.nextInt();
        int result = 0;
        for(int i = 1; i <= n;i++){
            if(i % 2 == 0) result -= i;
            else result += i;
        }
        System.out.println("结果是：" + result);
    }
}
