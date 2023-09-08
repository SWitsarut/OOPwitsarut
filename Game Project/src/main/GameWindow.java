package main;

import javax.swing.JFrame;

public class GameWindow {
    private JFrame jframe;

    GameWindow(GamePanel gp) {
        jframe = new JFrame();

        jframe.setSize(1200, 720);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(gp);
        jframe.setResizable(false);
        jframe.setLocationRelativeTo(null);
        // keep last
        jframe.setVisible(true);
    }
}
