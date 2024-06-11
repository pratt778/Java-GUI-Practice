import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Frames {

    void makeFrame() {
        JFrame frame = new JFrame();//creates a frame

        JLabel label = new JLabel("my label");//creates a label
        Border b = BorderFactory.createLineBorder(Color.green ,3);//creates a border object
        label.setForeground(Color.cyan);// sets the color of the label
        label.setFont(new Font("Times New Roman",Font.PLAIN,20));//sets the font style and size of the label
        label.setBackground(Color.black);//sets the background color of label
        label.setOpaque(true);// makes the background opaque, if input is true
        label.setBorder(b);
//        label.setVerticalAlignment(JLabel.LEFT);
        label.setBounds(10,10,100,25);
        frame.add(label);//add label to the frame


        frame.setSize(400,400);//sets size of the frame
        frame.setTitle("this is a title");// sets title of a frame
        frame.setResizable(false);//prevent frame from being resized
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(255,233,12));//sets the background color of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//closes the frame when you click on X
        frame.setVisible(true);//makes frame visible
        
    }
}
