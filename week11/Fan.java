import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fan extends JFrame {

    public Fan() {
        setTitle("Fan");
        ArcsPanel ap = new ArcsPanel();
        // fanPanel.add(ap);
        // add(fanPanel);
        add(ap, BorderLayout.CENTER);
        Timer timer = new Timer(70, new TimerListener(ap));
        timer.start();
        // add(panel);
    }

    private class TimerListener implements ActionListener {

        private JPanel ap;

        TimerListener(JPanel ap) {
            this.ap = ap;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            ap.repaint();
        }

    }

    /** Main method */
    public static void main(String[] args) {
        Fan frame = new Fan();
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 500);
        // frame.pack();
        frame.setVisible(true);
    }
}

// The class for drawing arcs on a panel
class ArcsPanel extends JPanel {
    JButton n0Button = new JButton("0");
    JButton n1Button = new JButton("1");
    JButton n2Button = new JButton("2");
    JButton n3Button = new JButton("3");

    ArcsPanel() {

        n0Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                setSpeed(0);
            }

        });
        n1Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                setSpeed(10);
            }

        });
        n2Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                setSpeed(20);
            }

        });
        n3Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                setSpeed(30);
            }

        });

        JPanel panel = new JPanel();
        panel.add(n0Button);
        panel.add(n1Button);
        panel.add(n2Button);
        panel.add(n3Button);
        add(panel, BorderLayout.SOUTH);
    }

    private int angle = 0;
    private int speed = 0;

    private void updateAngle() {
        angle = (angle + speed) % 360;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        updateAngle();
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;
        int radius = (int) (Math.min(getWidth(), getHeight()) * 0.4);
        int x = xCenter - radius;
        int y = yCenter - radius;
        g.setColor(Color.BLUE);
        g.fillArc(x, y, 2 * radius, 2 * radius, 0 + angle, 30);
        g.fillArc(x, y, 2 * radius, 2 * radius, 90 + angle, 30);
        g.fillArc(x, y, 2 * radius, 2 * radius, 180 + angle, 30);
        g.fillArc(x, y, 2 * radius, 2 * radius, 270 + angle, 30);
    }
}
