package test;

import java.util.Scanner;

public class doBMI {
    public static void main(String[] args){
//        BMI = 体重 / 身高的平方
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入体重（千克）：");
        double weight = sc.nextDouble();
        System.out.println("请输入身高（米）：");
        double height =sc.nextDouble();
        double BMI = weight / (height * height);
        System.out.println("BMI = "+ BMI);
    }
}
