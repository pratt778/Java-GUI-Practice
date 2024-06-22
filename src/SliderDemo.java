import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderDemo extends JFrame implements ChangeListener {
    JSlider slider;
    JPanel panel;
    JLabel label;
    public SliderDemo(){
        slider = new JSlider(0,100,50);
        slider.setPreferredSize(new Dimension(200,200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(5);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);
        slider.addChangeListener(this);
        slider.setOrientation(SwingConstants.VERTICAL);
        label = new JLabel(slider.getValue()+"% Marks in exam");
        panel = new JPanel();
        panel.add(slider);
        panel.add(label);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.add(panel);
        this.setVisible(true);
    }

    public void stateChanged(ChangeEvent e){
        if(e.getSource()==slider){
            label.setText(slider.getValue()+"% Marks in exam");
        }
    }
}
