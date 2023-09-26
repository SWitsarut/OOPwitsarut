import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class No6 extends JFrame {
    No6() {
        add(new Panel());
    }

    class Panel extends JPanel {

        private boolean isGoingBack = false;
        private int maxDistance = 20;
        private int addX = 0;
        Timer timer = new Timer(1, new Listener());

        Panel() {
            timer.start();
        }

        public void updateSwing() {
            if (addX >= maxDistance) {
                isGoingBack = true;
            }
            if (addX <= -maxDistance) {
                isGoingBack = false;
            }
            if (isGoingBack) {
                addX--;
            } else {
                addX++;
            }
        }

        class Listener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }

        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            updateSwing();
            g.drawArc(20, 220, 80, 40, 0, 180);
            g.drawLine(20 + 40, 220, 20 + 40, 20);
            g.drawLine(20 + 40, 20, 20 + 40 + 100, 20);
            g.drawLine(20 + 40 + 100,
                    20,
                    20 + 40 + 100 + addX,
                    40); // rope
            int radius = 20;
            g.drawOval(20 + 40 + 100 - radius + addX, 40, 2 * radius, 2 * radius);
            g.drawLine(20 + 40 + 100 - (int) (radius *
                    Math.cos(Math.toRadians(45))) + addX,
                    40 + radius + (int) (radius * Math.sin(Math.toRadians(45))),
                    20 + 40 + 100 - 60 + addX,
                    40 + radius + 60); // left arm
            g.drawLine(20 + 40 + 100 + (int) (radius *
                    Math.cos(Math.toRadians(45))) + addX,
                    40 + radius + (int) (radius * Math.sin(Math.toRadians(45))),
                    20 + 40 + 100 + 60 + addX,
                    40 + radius + 60); // right arm
            g.drawLine(20 + 40 + 100 + addX,
                    40 + 2 * radius,
                    20 + 40 + 100 + addX,
                    40 + radius + 80); // body
            g.drawLine(20 + 40 + 100 + addX,
                    40 + radius + 80,
                    20 + 40 + 100 - 40 + addX,
                    40 + radius + 80 + 40);// left leg
            g.drawLine(20 + 40 + 100 + addX,
                    40 + radius + 80,
                    20 + 40 + 100 + 40 + addX,
                    40 + radius + 80 + 40);// right leg
        }
    }

    public static void main(String[] args) {
        No6 hm = new No6();
        hm.setSize(300, 400);
        hm.setDefaultCloseOperation(EXIT_ON_CLOSE);
        hm.setVisible(true);
    }
}
