import java.awt.*;
import java.awt.event.*;

public class MouseAdapterEx extends MouseAdapter {
    Frame f;
    public MouseAdapterEx(){
        f=new Frame("Mouse Adapter");
        f.addMouseListener(this);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Graphics g = f.getGraphics();
        g.setColor(Color.red);
        g.fillOval(e.getX(),e.getY(),30,30);
    }
}
