import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Launchpage implements ActionListener {
    JFrame frame = new JFrame();
    JButton Button = new JButton("click me");
    public Launchpage(){
        Button.setBounds(50,50,200,40);
        Button.setFocusable(false);
        Button.setBackground(Color.GREEN);
        Button.addActionListener(this);
        frame.add(Button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
                NewWindow n1 = new NewWindow();
    }

}
