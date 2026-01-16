package hello_there;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame_for_mouselistener extends JFrame implements MouseListener{
	JLabel label;
public Frame_for_mouselistener() {
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLayout(null);
	this.setSize(500, 500);
	
	label = new JLabel();
	label.setBounds(0, 0, 100, 100);
	label.setBackground(Color.red);
	label.setOpaque(true);
	label.addMouseListener(this);
	
	this.add(label);
	this.setVisible(true);
}
	@Override
	public void mouseClicked(MouseEvent e) {
		// mouse clicked
		label.setBackground(Color.GREEN);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setBackground(Color.YELLOW);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setBackground(Color.black);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setBackground(Color.BLUE);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setBackground(Color.red);
	}

}
