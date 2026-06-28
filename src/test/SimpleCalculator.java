package test;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. 获取用户输入
        System.out.print("请输入第一个数字: ");
        double num1 = sc.nextDouble();

        System.out.print("请输入第二个数字: ");
        double num2 = sc.nextDouble();

        System.out.print("请输入运算符 (+, -, *, /): ");

        char operator = sc.next().charAt(0);

        double result = switch(operator){
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> {
                if(num2 == 0) throw new IllegalArgumentException("除数不能为零");
                yield num1 / num2;
            }
            default -> throw new IllegalArgumentException("运算符错误");
        };
        System.out.println("结果是: " + result);
    }
}
