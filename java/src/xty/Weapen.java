package xty;

public class Weapen {
    public static void main(String[] args) {
        fire();
        fire("岛国");
        fire("岛国", 5);
    }
    public static void fire(){
        System.out.println("发射一枚导弹");        
    }
    public static void fire(String location){
        System.out.println("发射一枚导弹到"+location);        
    }
    public static void fire(String location, int number){
        System.out.println("发射"+number+"枚导弹到"+location);        
    }
}
