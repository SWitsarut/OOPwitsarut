import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Umbrella extends JFrame {

    Umbrella() {
        setTitle("keep walking");
        Pane pane = new Pane();
        add(pane);
        Timer timer = new Timer(100, new TimerListener(pane));
        timer.start();
    }

    class TimerListener implements ActionListener {

        Pane pane;

        TimerListener(Pane pane) {
            this.pane = pane;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            pane.repaint();
        }

    }

    public static void main(String[] args) {
        JFrame wd = new Umbrella();
        wd.setSize(600, 400);
        wd.setDefaultCloseOperation(EXIT_ON_CLOSE);
        wd.setVisible(true);
    }
}

class Pane extends JPanel {
    int radius = 20;
    int x = 0;

    private void updateWalking() {
        x = (x + 10) % getWidth();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        updateWalking();
        g.fillRect(0, getHeight() / 2, getWidth(), 20);
        g.drawOval(20 + 40 - radius + x, 40, 2 * radius, 2 * radius);
        g.drawLine(20 + 40 - (int) (radius *
                Math.cos(Math.toRadians(45))) + x,
                40 + radius + (int) (radius * Math.sin(Math.toRadians(45))),
                20 + 40 - 60 + x,
                40 + radius + 60); // left arm
        g.drawLine(20 + 40 + (int) (radius *
                Math.cos(Math.toRadians(45))) + x,
                40 + radius + (int) (radius * Math.sin(Math.toRadians(45))),
                20 + 40 + 60 + x,
                40 + radius + 60); // right arm

        g.drawLine(20 + 40 + 60 + x,
                40 + radius + 60,
                20 + 40 + 60 + x,
                radius);

        g.fillArc((20 + 40 + 60 - (radius * 10) / 2) + x, radius, 10 * radius, 2 * radius, 0, 180);

        g.drawLine(20 + 40 + x,
                40 + 2 * radius,
                20 + 40 + x,
                40 + radius + 80); // body

        if (x % 3 != 0) {
            if (x % 3 == 1) {

                g.drawLine(20 + 40 + x,
                        40 + radius + 80,
                        20 + 40 - 40 + x,
                        40 + radius + 80 + 40);// left leg
            } else if (x % 3 == 2) {
                g.drawLine(20 + 40 + x,
                        40 + radius + 80,
                        20 + 40 + 40 + x,
                        40 + radius + 80 + 40);// right leg
            }
        }

    }
}
