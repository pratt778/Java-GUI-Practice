import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keylisten extends JFrame implements KeyListener {
    JLabel label;
    public keylisten(){
        label=new JLabel();
        label.setBounds(0,0,100,100);
        label.setForeground(Color.white);
        label.setBackground(Color.BLUE);
        label.setOpaque(true);
        this.add(label);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.addKeyListener(this);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println("You pressed the key: "+e.getKeyChar());
        switch (e.getKeyChar()){
            case 'a':
                label.setLocation(label.getX()-1,label.getY());
                break;
            case 'd':
                label.setLocation(label.getX()+1,label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(),label.getY()-1);
                break;
            case 's':
                label.setLocation(label.getX(), label.getY()+1);
                break;
            default:label.setText("invalid input");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
//        System.out.println("You released the key character:"+e.getKeyChar());
    }
}
