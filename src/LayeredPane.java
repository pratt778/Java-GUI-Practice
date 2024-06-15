import javax.swing.*;
import java.awt.*;

public class LayeredPane {
    public static void main(String[] args) {

        JLabel lab1 = new JLabel();
        lab1.setBounds(30,30,100,100);
        lab1.setOpaque(true);
        lab1.setBackground(Color.RED);

        JLabel lab2 = new JLabel();
        lab2.setBounds(60,60,100,100);
        lab2.setOpaque(true);
        lab2.setBackground(Color.BLUE);

        JLabel lab3 = new JLabel();
        lab3.setBounds(90,90,100,100);
        lab3.setOpaque(true);
        lab3.setBackground(Color.GREEN);



        JLayeredPane layeredpane = new JLayeredPane();
        layeredpane.setBounds(0,0,500,500);
        layeredpane.add(lab1,Integer.valueOf(0));
        layeredpane.add(lab2,Integer.valueOf(2));
        layeredpane.add(lab3,Integer.valueOf(1));

        //Layered pane give the depth or Z-index to the components.
        //it creates a third dimension to see which element is infront of another.


        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(layeredpane);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
