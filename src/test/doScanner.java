package test;

import java.util.Scanner;

public class doScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入num1：");
        int num1 = sc.nextInt();
        System.out.println("请输入num2：");
        int num2 = sc.nextInt();
        int sum = num1 +num2;
        System.out.println("两个数之和为"+sum);
        }
    }

