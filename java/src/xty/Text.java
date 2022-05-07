package xty;

import java.util.Scanner;
public class Text {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    System.out.println("请输入 年龄：");
    int age=sc.nextInt();
    System.out.println("年龄是"+age);
    System.out.println("请输入名字：");
    String name=sc.next();
    System.out.println("欢迎"+name);
    }
    
}
