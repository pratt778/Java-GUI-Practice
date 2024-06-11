import javax.swing.*;
import java.awt.*;
public class borderLayout {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.blue);
        panel3.setBackground(Color.green);
        panel4.setBackground(Color.yellow);
        panel5.setBackground(Color.orange);
        panel6.setBackground(Color.cyan);
        panel7.setBackground(Color.black);
        panel8.setBackground(Color.white);
        panel9.setBackground(Color.darkGray);
        panel10.setBackground(Color.lightGray);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));
        panel6.setPreferredSize(new Dimension(100,100));
        panel7.setPreferredSize(new Dimension(100,100));
        panel8.setPreferredSize(new Dimension(100,100));
        panel9.setPreferredSize(new Dimension(100,100));
        panel10.setPreferredSize(new Dimension(100,100));

        panel5.setLayout(new BorderLayout());

        panel5.add(panel6,BorderLayout.EAST);
        panel5.add(panel7,BorderLayout.WEST);
        panel5.add(panel8,BorderLayout.NORTH);
        panel5.add(panel9,BorderLayout.SOUTH);
        panel5.add(panel10,BorderLayout.CENTER);

        frame.add(panel1,BorderLayout.EAST);
        frame.add(panel2,BorderLayout.WEST);
        frame.add(panel3,BorderLayout.NORTH);
        frame.add(panel4,BorderLayout.SOUTH);
        frame.add(panel5,BorderLayout.CENTER);
        frame.setVisible(true);

    }
}
