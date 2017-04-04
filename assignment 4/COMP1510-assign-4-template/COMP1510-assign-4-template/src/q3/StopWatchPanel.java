package q3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.Timer;
import javax.swing.JPanel;

public class StopWatchPanel extends JPanel{

    public StopWatchPanel() {
        setBackground(Color.black);
        setPreferredSize(new Dimension(400, 500));
        
        JButton start = new JButton("Start");
        
        JButton reset = new JButton("Reset");
        JButton stop = new JButton("Stop");
        
        add(Box.createRigidArea(new Dimension(400, 430)));
        add(start);
        add(reset);
        add(stop);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(Color.white);
        g.fillOval(0, 0, 400, 400);
        
        g.setColor(Color.black);
        g.fillOval(195, 195, 10, 10);
    }
    
}
