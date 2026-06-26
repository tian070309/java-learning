package test;

import java.util.Scanner;

public class time {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入总秒数");
        int second = sc.nextInt();
        int hour = second / 3600;
        int min = second %3600 /60;
        int sec = second % 3600 % 60;
        System.out.println("小时数："+hour + "  " + "分钟：" + min + "  " + "秒：" + sec);
        sc.close();
    }
}
