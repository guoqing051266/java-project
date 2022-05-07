package xty;
import java.awt.*;
import javax.swing.*;

import javafx.scene.paint.Color;

public class Example1 extends JFrame{
    public void CreateJFrame(String title){
        JFrame jf=new JFrame(title);
        Container container=jf.getContentPane();
        JLabel jl=new JLabel("这是一个JFrame窗体的标签名称");
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jl);
        //container.setBackground(Color.rgb(100, 100, 100));
        jf.setVisible(true);
        jf.setSize(200,150);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
public static void main(String[] args) {
    new Example1().CreateJFrame("创建一个JFrame窗体");
}    
}
