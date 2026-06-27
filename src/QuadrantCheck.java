import java.util.Scanner;

public class QuadrantCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入x坐标：");
        double x = sc .nextDouble();
        System.out.println("请输入y坐标：");
        double y = sc .nextDouble();
        if(x == 0 && y == 0){
            System.out.println("点在原点");
        }else if(x > 0 && y > 0){
            System.out.println("点在第一象限");
        }else if(x < 0 && y > 0){
            System.out.println("点在第二象限");
        }else if(x < 0 && y < 0){
            System.out.println("点在第三象限");
        }else if(x > 0 && y < 0){
            System.out.println("点在第四象限");
        }else if(x == 0 && y != 0){
            System.out.println("点在y轴上");
        }else{
            System.out.println("点在x轴上");
        }
    }
}
