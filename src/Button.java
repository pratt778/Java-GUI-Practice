import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button implements ActionListener {
    JFrame frame;
    JButton button;
    JLabel label;

    void btnClicked(){
        frame = new JFrame();
        label = new JLabel("Only display when button is clicked");
        label.setBounds(100,120,350,150);
        label.setVisible(false);
        frame.add(label);

        button = new JButton("Click Me");
        button.setBounds(0,0,200,20);
//        button.addActionListener(e -> System.out.println("Clicked")); without using ActionLister clas
        button.addActionListener(this);
        button.setFocusable(false);
        button.setBorder(BorderFactory.createLineBorder(Color.black,3,true));

        frame.add(button);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);



    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
//            System.out.println("Clicked!!!!!");
            button.setBackground(Color.cyan);
            label.setVisible(true);
        }
    }

    public static void main(String[] args){
        Button b1 = new Button();
        b1.btnClicked();

    }
}
