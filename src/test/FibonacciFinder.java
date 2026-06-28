package test;

import java.util.Scanner;

public class FibonacciFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找第几项斐波那契数列：");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        if(n == 1) System.out.println("第"+ n +"项是"+ a);
        else if(n == 2) System.out.println("第"+ n +"项是"+ b);

        else{
            for(int i = 3;i <= n;i++){
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println("第"+ n +"项是"+ c);
        }
    }
}
