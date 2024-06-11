import javax.swing.*;
import java.awt.*;
public class Panels {
    public static void main(String[] args){
        JFrame frame = new JFrame();

        JPanel panel = new JPanel();
        panel.setBackground(Color.red);
        panel.setBounds(0,0,200,200);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.blue);
        panel2.setBounds(200,0,200,200);
        panel2.setLayout(null);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.green);
        panel3.setBounds(0,200,400,200);
        panel3.setLayout(new BorderLayout());

        JLabel label = new JLabel("this is the label");
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);
        panel3.add(label);

        JLabel label2 = new JLabel("this is another label");
        label2.setBounds(0,0,150,40);
        panel2.add(label2);

        frame.add(panel3);
        frame.add(panel2);
        frame.add(panel);

        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
