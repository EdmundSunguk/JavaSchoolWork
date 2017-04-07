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
import javax.swing.JPanel;
import java.text.DecimalFormat;

/**
 * <p>This program has</p>
 * 
 * @author Sunguk (Edmund) Ham, A00979841
 * @version 1.0
 * 
 */
public class StopWatchPanel extends JPanel{
    
    DecimalFormat fmt = new DecimalFormat("00");
    private int second;
    private int tenths;
    private int moveW;
    private int pivotH = 100;
    private JButton start = new JButton("Start");
    private JButton reset = new JButton("Reset");
    private JButton stop = new JButton("Stop");
    private JLabel time = new JLabel(fmt.format(second) + ":" + fmt.format(tenths));
    private Timer secondTimer = new Timer(10, new SecondStopWatchListener());

    public StopWatchPanel() {
        setBackground(Color.black);
        setPreferredSize(new Dimension(400, 300));
        
        time.setFont(new Font("Helveltica", Font.PLAIN, 36));
        time.setForeground (Color.white);
        start.addActionListener(new ButtonListener());
        stop.addActionListener(new ButtonListener());
        reset.addActionListener(new ButtonListener());

        
        add(Box.createRigidArea(new Dimension(400, 190)));
        add(time);
        add(Box.createRigidArea(new Dimension(400, 5)));
        add(start);
        add(reset);
        add(stop);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(Color.white);
        g.fillRect(50, 50, 300, 100);
        
        g.setColor(Color.green);
        g.fillRect(50, 50, moveW, pivotH);
    }
    
    private class SecondStopWatchListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            tenths++;
            moveW += 3;
            
            if (tenths > 99 && moveW > 300) {
                tenths = 0;
                second++;
                moveW = 0;
            }
            time.setText(fmt.format(second) + ":" + fmt.format(tenths));
            repaint();
        }
    }
    
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {

            if (event.getSource() == start) {
                secondTimer.start();
            }
            if (event.getSource() == reset) {
                secondTimer.stop();
                second = 0;
                tenths = 0;
                moveW = 0;
                time.setText(fmt.format(second) + ":" + fmt.format(tenths));
                repaint();
            }
            if (event.getSource() == stop) {
                secondTimer.stop();
            }
            
        }
    }
    
    
}
