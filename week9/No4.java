import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class No4 extends JFrame {
    JLabel dollarLabel = new JLabel("US Dollar");
    JLabel CanadianLabel = new JLabel("Canadian Dollar");
    JTextField dollarField = new JTextField(10);
    JTextField CanadianField = new JTextField(10);
    JButton converButton = new JButton("Convert");
    JPanel jPanel = new JPanel();

    No4() {
        CanadianField.setEditable(false);
        CanadianField.setHorizontalAlignment(JTextField.RIGHT);
        dollarField.setHorizontalAlignment(JTextField.RIGHT);
        // GridLayout grid = new GridLayout(2, 2, 0, 0);
        JPanel p1 = new JPanel();
        p1.setLayout(new BorderLayout());

        // p1.setLayout();
        JPanel LeftBox = new JPanel();
        LeftBox.setLayout(new GridLayout(2, 1, 0, 0));
        LeftBox.add(dollarLabel);
        LeftBox.add(CanadianLabel);

        JPanel rightBox = new JPanel();
        rightBox.setLayout(new GridLayout(2, 1, 0, 0));
        rightBox.add(dollarField);
        rightBox.add(CanadianField);

        JPanel botBox = new JPanel();
        botBox.setLayout(new BorderLayout());
        botBox.add(converButton, BorderLayout.EAST);

        p1.add(LeftBox, BorderLayout.WEST);
        p1.add(rightBox, BorderLayout.CENTER);
        p1.add(botBox, BorderLayout.SOUTH);

        jPanel.add(p1);

        converButton.addActionListener(new Listener());
    }

    class Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand() == "Convert") {
                double val = Double.parseDouble(dollarField.getText());
                CanadianField.setText("" + val * 1.5);
            }
        }

    }

    public static void main(String[] args) {
        No4 frame = new No4();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // frame.setSize(500, 600);
        frame.setTitle("smell like wet puppy");
        // frame.add(panel)
        frame.add(frame.jPanel);
        frame.pack();
        frame.setVisible(true);
    }
}
