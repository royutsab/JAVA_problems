package hello_there;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame_for_keylistener extends JFrame implements KeyListener{
	JLabel label;
	ImageIcon icon;
public Frame_for_keylistener() {
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(500, 500);
	this.setLayout(null);
	this.addKeyListener(this);
	
	icon = new ImageIcon(getClass().getResource("download1.png"));
	
	label = new JLabel();
	label.setBounds(0, 0, 100, 100);
	label.setIcon(icon);
	//label.setBackground(Color.RED);
	//label.setOpaque(true);
	
	this.getContentPane().setBackground(Color.BLACK);
	this.add(label);
	this.setVisible(true);
}

@Override
public void keyTyped(KeyEvent e) {
	//invoked when a key is typed. Uses KeyChar, char output
	switch(e.getKeyChar()) {
	case 'a' : label.setLocation(label.getX()-10, label.getY());
	break;
	case 'w' : label.setLocation(label.getX(), label.getY()-10);
	break;
	case 's' : label.setLocation(label.getX(), label.getY()+10);
	break;
	case 'd' : label.setLocation(label.getX()+10, label.getY());
	break;
	}
}

@Override
public void keyPressed(KeyEvent e) {
	//invoked when a physical key is pressed down. uses KeyCode, integer output
	switch(e.getKeyCode()) {
	case 37: label.setLocation(label.getX()-10, label.getY());
	break;
	case 38: label.setLocation(label.getX(), label.getY()-10);
	break;
	case  39: label.setLocation(label.getX()+10, label.getY());
	break;
	case  40: label.setLocation(label.getX(), label.getY()+10);
	break;
	}
}

@Override
public void keyReleased(KeyEvent e) {
	//called when a button is released
	
}
}
