package test;

import java.util.Scanner;

public class LuckySeven {
    public static void main(String[] args) {
        //判断一个三位数是否是7的有缘数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位整数");
        int num = sc.nextInt();
        int bai = num/100%10;
        int shi = num/10%10;
        int ge = num%10;
        System.out.println(bai == 7 || shi == 7 || ge == 7 || num % 7 == 0);

  }
}