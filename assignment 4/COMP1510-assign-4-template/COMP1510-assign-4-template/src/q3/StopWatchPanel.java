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
    
    private int second;
    private int minute;

    public StopWatchPanel() {
        setBackground(Color.white);
        setPreferredSize(new Dimension(400, 500));
        
        JButton start = new JButton("Start");
        JButton reset = new JButton("Reset");
        JButton stop = new JButton("Stop");
        JLabel time = new JLabel("hahahah");
        Timer timer = new Timer(second, null);
        
        add(Box.createRigidArea(new Dimension(400, 400)));
        add(time);
        add(Box.createRigidArea(new Dimension(400, 20)));
        add(start);
        add(reset);
        add(stop);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(Color.black);
        g.fillOval(0, 0, 400, 400);
        
        g.setColor(Color.white);
        g.fillOval(195, 195, 10, 10);
    }
    
    public void Timer() {
        
    }
}
