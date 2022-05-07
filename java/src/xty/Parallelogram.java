package xty;

import Quadrangle;
import Square;

/* class Quadrangle {
    public static void draw(Quadrangle q){
    }
}
public class Parallelogram extends Quadrangle{
        public static void main(String[] args) {
            Parallelogram p=new Parallelogram();
            draw(p); 
            draw(new Parallelogram());
            Quadrangle q=new Parallelogram();
            Parallelogram p=(Parallelogram) q;
        }
    }    */ 

    class Quadrangle {
        public static void draw(Quadrangle q){
        }
    }
    class Square extends Quadrangle{

    }
    class Anything{

        public boolean AnyThing(String string) {
        }

    }
    public class Parallelogram extends Quadrangle{
        public static void main(String[] args) {
            Quadrangle q=new Quadrangle();
            if(q instanceof Parallelogram){
                Parallelogram p=(Parallelogram) q;

            }
            if(q instanceof Square){
                Square s=(Square) q;
            }
            //System.out.println(q instanceof Anything);

        }}