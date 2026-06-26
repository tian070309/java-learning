package test;

import java.util.Scanner;

public class time1 {
    public static void main(String[] args) {
        System.out.println("请输入分钟数：");
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int hour = min / 60;
        min = min%60;
        System.out.println("转换后的时间为：" + hour + "小时" + min + "分钟");
    }
}
