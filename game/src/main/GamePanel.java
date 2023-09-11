package main;

import javax.swing.JPanel;

import input.KeyboardInput;
import input.MouseInput;

import java.awt.Graphics;

public class GamePanel extends JPanel {
    int MXpos = 0, MYpos = 0;
    MouseInput mouseInput;

    public GamePanel() {
        mouseInput = new MouseInput(this);
        addKeyListener(new KeyboardInput(this));
        addMouseListener(mouseInput);
        addMouseMotionListener(mouseInput);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(MXpos, MYpos, 72, 200);
    }

    public void mouseClickSetPos(int x, int y) {
        this.MXpos = x;
        this.MYpos = y;
    }
}
