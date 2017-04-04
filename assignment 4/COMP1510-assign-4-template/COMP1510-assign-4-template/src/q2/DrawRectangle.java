package q2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * <p></p>
 * 
 * @author Your Name goes here
 * @version 1.0
 */
public class DrawRectangle extends JFrame {

    /**
     *
     */
    public DrawRectangle() {
        super("Sunguk Ham");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new DrawRectanglePanel());
        setSize(400, 400);
        setVisible(true);
    }

    /**
     *
     */
    private class DrawRectanglePanel extends JPanel implements MouseListener,
            MouseMotionListener {
        
        private Point point1 = null;
        
        private Point point2 = null;
        
        /**
         */
        public DrawRectanglePanel() {
            addMouseListener(this);
            addMouseMotionListener(this);
            
            setBackground(Color.black);
        }

        /**
         *
         */
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            g.setColor(Color.cyan);
            if (point1 != null || point2 != null) {
                if (point1.x < point2.x && point1.y < point2.y) {
                    g.fillRect(point1.x, point1.y, 
                            point2.x - point1.x, point2.y - point1.y);
                }
                if (point2.x < point1.x && point2.y < point1.y) {
                    g.fillRect(point2.x, point2.y, point1.x - point2.x,
                            point1.y - point2.y);
                }
                if (point1.x < point2.x && point2.y < point1.y) {
                    g.fillRect(point1.x, point2.y, 
                            point2.x - point1.x, point1.y - point2.y);
                }
                if (point2.x < point1.x && point1.y < point2.y) {
                    g.fillRect(point2.x, point1.y, 
                            point1.x - point2.x, point2.y - point1.y);
                }
            }
        }

        public void mousePressed(MouseEvent e) {
            point1 = e.getPoint();
        }


        public void mouseDragged(MouseEvent e) {
            point2 = e.getPoint();
            repaint();
        }

        public void mouseReleased(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
        public void mouseClicked(MouseEvent e) {}
        public void mouseMoved(MouseEvent e) {}

    }

    /**
     *
     */
    public static void main(String[] args) {
        new DrawRectangle();
    }

};
