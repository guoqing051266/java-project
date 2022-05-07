

public class Quadrangle {
    private Quadrangle[] qtest=new Quadrangle[6];
    private int nextindex=0;
    public void draw(Quadrangle q){
        if(nextindex<qtest.length){
            qtest[nextindex]=q;
            System.out.println(nextindex);
            nextindex++;
        }
    }
    public static void main(String[] args) {
        Quadrangle q=new Quadrangle();
        q.draw(new Square());
        q.draw(new parallelogramgle());
        q.draw(new Square());
        }
}
class Square extends Quadrangle{
    public Square(){
        System.out.println("正方形");
    }
}
class parallelogramgle extends Quadrangle{
    public parallelogramgle(){
        System.out.println("平行四边形");
    }
}
