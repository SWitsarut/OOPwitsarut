package No10;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import javax.swing.Timer;

public class Clock extends JFrame {
    private StillClock clock = new StillClock();
    private StillClock foreignClock = new StillClock();
    // JPanel p1 = new JPanel(new GridLayout(1, 2, 5, 5));

    JTextField textFeild = new JTextField(25);
    String Country = "japan";
    JLabel label = new JLabel("Thai " + Country);
    int hour = 2;
    JButton btn = new JButton("OK");

    public Clock() {
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Country = textFeild.getText();
                label.setText("Thai " + Country);
                if (Country.trim().equals("japan")) {
                    hour = 2;
                }
                if (Country.trim().equals("usa")) {
                    hour = 12;
                }
                if (Country.trim().equals("eng")) {
                    hour = -7;
                    System.out.println("work");
                }
                foreignClock.setCurrentTime();
                foreignClock.setHour(clock.getHour() + hour);
                foreignClock.repaint();
            }

        });
        label.setHorizontalAlignment(SwingConstants.CENTER);
        JPanel container = new JPanel(new GridLayout(3, 1, 5, 5));
        container.add(label);

        JPanel clockContainer = new JPanel(new GridLayout(1, 2, 5, 5));
        container.add(clockContainer);
        clockContainer.add(clock);
        clockContainer.add(foreignClock);

        JPanel inputContainer = new JPanel();
        inputContainer.add(new Label("input contry"));
        inputContainer.add(textFeild);
        inputContainer.add(btn);
        container.add(inputContainer);
        // inputContainer.setHorizontalAlignment(SwingConstants.CENTER);

        add(container);
        // Create a timer with delay 1000 ms
        Timer timer = new Timer(1000, new TimerListener());
        timer.start();
    }

    private class TimerListener implements ActionListener {
        @Override /** Handle the action event */
        public void actionPerformed(ActionEvent e) {
            // Set new time and repaint the clock to display current time
            clock.setCurrentTime();
            clock.repaint();
            foreignClock.setCurrentTime();
            foreignClock.setHour(clock.getHour() + hour);
            foreignClock.repaint();
        }
    }

    /** Main method */
    public static void main(String[] args) {
        JFrame frame = new Clock();
        frame.setTitle("ClockAnimation");
        frame.setSize(200, 200);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
