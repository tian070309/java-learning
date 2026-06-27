package test;

import java.util.Scanner;

public class TakeoutCompare {
    public static void main(String[] args){
       /* 需求:小明在每次订外卖都会在多家平台对比，看谁的优惠力度更大已知:
        饱了么App:全场9折优惠
        美单App:满30减10元
        请问：
        在哪家下单更划算*/
        double price;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入价格：");
        price = sc.nextDouble();
        if(price < 0){
            System.out.println("价格不能为负数");
        }else if(price < 30 && price > 0){
            System.out.println("饱了么更划算");
        }else if(price *0.9 < price -10){
            System.out.println("饱了么更划算");
        }else if(price == 100){
            System.out.println("两个商家价格一样");
        }else{
            System.out.println("美单更划算");
        }

    }
}
