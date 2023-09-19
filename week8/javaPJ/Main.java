package javaPJ;

import java.awt.GridLayout;

import javax.swing.*;
public class Main extends JFrame{

	public Main() {
		getContentPane().setLayout(new GridLayout(3,3,5,5));
		getContentPane().add(new DrawXSq());
		getContentPane().add(new DrawSine());
		getContentPane().add(new DrawCos());
		getContentPane().add(new DrawTan());
		getContentPane().add(new DrawE());
		getContentPane().add(new DrawF());
		getContentPane().add(new DrawG());
	}
	
	public static void main(String[] args) {
		Main frame = new Main();
		frame.setSize(400,400);
		frame.setTitle("Exercise 10.10");
		frame.setVisible(true);
	}

}
