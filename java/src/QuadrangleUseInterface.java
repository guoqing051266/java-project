
interface drawTest{
    public void draw();
    public void doAnyThing();
}
class ParallelogramgleUseInterface extends QuadrangleUseInterface implements drawTest{
    public void draw(){
        System.out.println("平行四边形.draw()");
    }
    public void doAnyThing(){
        System.out.println("1+1");
    }
}
class SquareUseInterface extends QuadrangleUseInterface implements drawTest{
    public void draw(){
        System.out.println("正方形.draw()");
    }
    public void doAnyThing(){
        System.out.println("2+2");
    }
} 
class AnyThingUseInterface extends QuadrangleUseInterface{
    public void doAnyThing(){
        System.out.println("3+3");
    }
}
public class QuadrangleUseInterface {
    public void doAnyThing(){
        System.out.println("4+4");
    }
    public static void main(String[] args) {
        drawTest[] d={new SquareUseInterface(), new ParallelogramgleUseInterface()};
            for(int i=0;i<d.length;i++){
                d[i].draw();
                d[i].doAnyThing();
            }
    }
}
