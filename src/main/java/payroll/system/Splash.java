package payroll.system;

import java.awt.*;
import javax.swing.*;

public class Splash {
    public static void main(String[] args) {
        SFrame f1 = new SFrame("Payroll System");
        f1.setVisible(true);
        int i, x = 1;
        for (i=2; i<=600; i+=4, x+=1) {
            f1.setLocation((700-((i+x)/2)),400-(i/2));
            f1.setSize(i+x, i);
            
            try {
                Thread.sleep(10);
            } catch(Exception e) {}
        }
    }
}

class SFrame extends JFrame implements Runnable {
    
    Thread t1;
    SFrame(String s) {
        super(s);
        setLayout(new FlowLayout());
        ImageIcon c1 = new ImageIcon("/home/dell/icon/payroll_system.jpg");
        Image i1 = c1.getImage().getScaledInstance(730, 550, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        
        JLabel m1 = new JLabel(i2);
        add(m1);
        
        t1 = new Thread(this);
        t1.start();
    }
    
    public void run() {
        try {
            t1.sleep(7000);
            this.setVisible(false);
//            Login f1 = new Login();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
