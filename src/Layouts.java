import javax.swing.*;
import java.awt.*;
public class Layouts {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        //Flow layout
//        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        //leading makes the layout stick on the left side of the frame,
        // you can also use left instead of leading
        //default is center
        //this is just to check if the git clone works
        // Grid Layout
        //places components in the grid of cells
        //Each component takes the available space within its cells
        //each cell is of same size.

        frame.setLayout(new GridLayout(5,5,5,5));

        frame.add(new JButton("btn1"));
        frame.add(new JButton("btn2"));
        frame.add(new JButton("btn3"));
        frame.add(new JButton("btn4"));
        frame.add(new JButton("btn5"));
        frame.add(new JButton("btn6"));
        frame.add(new JButton("btn7"));
        frame.add(new JButton("btn7"));
        frame.setVisible(true);
    }
}
