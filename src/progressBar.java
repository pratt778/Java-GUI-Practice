import javax.swing.*;
import java.awt.*;

public class progressBar extends JFrame {
    JProgressBar bar;
    public progressBar() throws InterruptedException {
        bar = new JProgressBar();
        bar.setBounds(20,30,350,40);
        bar.setValue(39);
        bar.setStringPainted(true);
        bar.setFont(new Font("Times New Roman",Font.BOLD,23));
        bar.setForeground(Color.RED);
        this.add(bar);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(400,400));
        this.setLayout(null);
        this.setVisible(true);
        loading();
    }

    public void loading() throws InterruptedException {
      int load = 100;
      while(load>=0){
          bar.setValue(load);
          Thread.sleep(100);
          load-=1;
      }
      bar.setString("Health Bar is empty");
    }
}
