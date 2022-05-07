package xty;
import java.text.DecimalFormat;
public class DecimalFormatSimpleDemo {
    static public void SimpleFormat(String pattern, double value){
        DecimalFormat myFormat=new DecimalFormat(pattern);
        String output =myFormat.format(value);
        myFormat.applyPattern(pattern);
        System.out.println(value+" "+ pattern +" "+ output);
        System.out.println(value+" "+pattern+" "+myFormat.format(value));

    }
    static public void UseApplyPatternMethodFormat(String pattern, double vaule){
        DecimalFormat myFormat=new DecimalFormat();
        myFormat.applyPattern(pattern);
        System.out.println(vaule+" "+pattern+" "+myFormat.format(vaule));

    }
    public static void main(String[] args) {
        SimpleFormat("###,###.###", 123456.789);
        SimpleFormat("00000000.###kg", 123456.789);
        SimpleFormat("00000000.000", 123.78);
        UseApplyPatternMethodFormat("#.###%", 0.789);
        UseApplyPatternMethodFormat("###.##", 123456.789);
        UseApplyPatternMethodFormat("0.00\u2030",0.789);

    }
}

