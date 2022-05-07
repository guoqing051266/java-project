

public class OutClass {
    innerClass in=new innerClass();
    public void ouf(){
        in.inf();
    }
    class innerClass{
        innerClass(){            
        }
        public void inf(){            
        }
        int y=0;
        }
        public  innerClass doit(){
            in.y=4;
            return new innerClass();
        }
        public static void main(String[] args) {
            OutClass out=new OutClass();
            OutClass.innerClass in=out.doit();
            OutClass.innerClass in2=out.new innerClass();
        }
}
