package test;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        //判断四位数是否是回文数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个四位整数");
        int num = sc.nextInt();
        int qian = num/1000%10;
        int bai = num/100%10;
        int shi = num/10%10;
        int ge = num%10;
        System.out.println(qian == ge && bai == shi);
    }
}
