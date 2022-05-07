package xty;

//import java.util.jar.Attributes.Name;

 class AnyThing1 {
    public AnyThing1(){
        this("this 调用有参构造方法");
        System.out.println("无参构造方法");
    }
    public AnyThing1(String name){
        System.out.println("有参构造方法");
    }
}
public class AnyThing{
    public static void main(String[] args) {
        AnyThing1 a=new AnyThing1("66");
        

              
    }
}
