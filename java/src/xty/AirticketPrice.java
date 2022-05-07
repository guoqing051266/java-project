package xty;

import java.time.Month;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class AirticketPrice {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("机票原价：");
      double price =sc.nextDouble();
      System.out.println("月份：");
      int month=sc.nextInt();
      System.out.println("舱位：");
      String type=sc.next();
      double rs= caic(price, month, type);
      System.out.println(rs);
    }

    public static double caic(double money, int month, String type){
        if (month>4&&month<11){
            switch(type){
                case "经济舱":
                money*=0.85;
                break;
                case "头等舱":
                money*=0.9;
                default:
                System.out.println("您输入的仓位不正确");
                money=-1;
            }
        }
        else if (month== 11|| month==12||month >0&&month <5){
            switch(type){
                case "经济舱":
                money*=0.65;
                break;
                case "头等舱":
                money*=0.7;
                default:
                System.out.println("您输入的仓位不正确");
                money=-1;

        }
    }else {
        System.out.println("月份有问题");
        money=-1;        
    }
    return money;
}
}
