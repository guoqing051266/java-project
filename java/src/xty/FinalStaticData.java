package xty;
import java.util.Random;
import static java.lang.System.out;
public class FinalStaticData{
    private static Random rand=new Random();
    private final int a1=rand.nextInt(1000);
    private static final int a2=rand.nextInt(1000);
    public static void main(String[] args) {        
        FinalStaticData fData=new FinalStaticData();
        out.println(fData.a1);
        out.println(fData.a2);
        FinalStaticData fData2=new FinalStaticData();
        out.println(fData2.a1);
        out.println(fData2.a2);
    }
}


