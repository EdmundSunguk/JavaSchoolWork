package q3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.Timer;
import java.text.DecimalFormat;
import javax.swing.JPanel;

public class StopWatchPanel extends JPanel{
    
    DecimalFormat fmt = new DecimalFormat("00");
    private int second;
    private int minute;
//    private final int pivotX = 200;
//    private final int pivotY = 200;
//    private int moveX = 200;
//    private int moveY = 0;
//    private final int maxDistanceSquare = 40000;
    private JButton start = new JButton("Start");
    private JButton reset = new JButton("Reset");
    private JButton stop = new JButton("Stop");
    private JLabel time = new JLabel(fmt.format(minute)+ " : " + fmt.format(second));
    private Timer minuteTimer = new Timer(60000, new MinuteStopWatchListener());
    private Timer secondTimer = new Timer(1000, new SecondStopWatchListener());

    public StopWatchPanel() {
        setBackground(Color.white);
        setPreferredSize(new Dimension(400, 500));
        
        time.setFont(new Font("Helveltica", Font.PLAIN, 36));
        start.addActionListener(new ButtonListener());
        stop.addActionListener(new ButtonListener());
        reset.addActionListener(new ButtonListener());

        
        add(Box.createRigidArea(new Dimension(400, 390)));
        add(time);
        add(Box.createRigidArea(new Dimension(400, 5)));
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
        
//        g.drawLine(pivotY, pivotY, moveX, moveY);
    }
    
    private class SecondStopWatchListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            second++;
            time.setText(fmt.format(minute)+ " : " + fmt.format(second));
        }
    }
    
    private class MinuteStopWatchListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            minute++;
            time.setText(fmt.format(minute)+ " : " + fmt.format(second));
        }
    }
    
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {

            if (event.getSource() == start) {
                minuteTimer.start();
                secondTimer.start();
            }
            if (event.getSource() == reset) {
                minuteTimer.stop();
                secondTimer.stop();
                minute = 0;
                second = 0;
                time.setText(fmt.format(minute)+ " : " + fmt.format(second));
            }
            if (event.getSource() == stop) {
                minuteTimer.stop();
                secondTimer.stop();
            }
            
        }
    }
    
    
}
