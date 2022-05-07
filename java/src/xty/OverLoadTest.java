package xty;

public class OverLoadTest {
   /*  public static int add(int a, int b){
        return a+b;
    }
    public static double add(double a,double b){
        return a+b;
    }
    public static int add(int a){
        return a;
    }
    public static double add(int a,double b){
        return a+b;
    } */
    public static int add(int...a){
        int s=0;
        for(int i=0; i<a.length; i++){
            s+=a[i];
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(1,2));
        System.out.println(add(3));
        System.out.println(add(1, 3));
        System.out.println(add(1,2,3,4,5,6,7,8,9));
        System.out.println(add(1));
    }
}
