import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mytextfield extends JFrame implements ActionListener {
    JButton button;
    JTextField mytext;
    JCheckBox mycheck;
    JRadioButton r1;
    JRadioButton r2;
    JRadioButton r3;
    JComboBox combo;
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

        r1=new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        r3 = new JRadioButton("Others");

        ButtonGroup btngroup= new ButtonGroup();
        btngroup.add(r1);
        btngroup.add(r2);
        btngroup.add(r3);
        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);

        String[] course = {"python","java","javascript","dbsqlite"};
        combo = new JComboBox(course);
        combo.addItem("c#");
        combo.insertItemAt("postgressql",0);
        combo.setSelectedIndex(0);
//        combo.removeItem("c#");
//        combo.removeItemAt(0);
        combo.addActionListener(this);
        this.add(combo);
        this.add(r1);
        this.add(r2);
        this.add(r3);
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
        else if(e.getSource()==r1){
            System.out.println(r1.getText());
        }
        else if (e.getSource()==r2){
            System.out.println(r2.getText());
        }
        else if(e.getSource()==r3){
            System.out.println(r3.getText());
        }
        else if(e.getSource()==combo){
            System.out.println(combo.getSelectedItem());
        }
    }
}
