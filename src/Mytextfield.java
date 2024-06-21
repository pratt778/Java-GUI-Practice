import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mytextfield extends JFrame implements ActionListener {
    JButton button;
    JTextField mytext;
    JCheckBox mycheck;
    Mytextfield(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        mytext= new JTextField();
        mytext.setPreferredSize(new Dimension(200,40));//more flexible than setSize,more dynamic
        mytext.setForeground(Color.RED);
        mytext.setBackground(Color.black);
        mytext.setCaretColor(Color.green);
        button = new JButton("Submit");
        button.addActionListener(this);
        button.setFocusable(false);
        mycheck = new JCheckBox();
        mycheck.setText("I am not real");
        this.add(mytext);
        this.add(button);
        this.add(mycheck);
        this.pack();//it sizes the frame so that all its contents are at or above their preferred sizes.
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            System.out.println(mytext.getText());
            System.out.println(mycheck.isSelected());
        }
    }
}
