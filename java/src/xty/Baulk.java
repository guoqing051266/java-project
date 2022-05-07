package xty;

public class Baulk {
    public static void main(String[] args) {
       try{

        int result=3/0;
        System.out.println((result));
        
    }
    catch(Exception e){
        //e.printStackTrace();
        System.out.println("有错");
    }
    System.out.println("继续");
    }
}
