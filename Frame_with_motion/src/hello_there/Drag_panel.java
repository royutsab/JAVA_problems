package hello_there;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Drag_panel extends JPanel{
	ImageIcon image = new ImageIcon(getClass().getResource("download1.png"));
final int WIDTH = image.getIconWidth();
final int HEIGHT = image.getIconHeight();
Point imageCorner;
Point prepoint;
	
public Drag_panel() {
	imageCorner = new Point(0,0);
	ClickListener clicklisten = new ClickListener();
	DragListener draglisten = new DragListener();
	this.addMouseListener(clicklisten);
	this.addMouseMotionListener(draglisten);
}


public void paintComponent(Graphics g) {
	super.paintComponent(g);
	image.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
}

private class ClickListener extends MouseAdapter {
	public void mousePressed(MouseEvent e) {
		prepoint = e.getPoint();
	}
}

private class DragListener extends MouseMotionAdapter{
	public void mouseDragged(MouseEvent e) {
		Point CurrentPt = e.getPoint();
		imageCorner.translate(
				(int)(CurrentPt.getX()-prepoint.getX()),
				(int)(CurrentPt.getY()-prepoint.getY())
				);
		prepoint = CurrentPt;
		repaint();
	}
}
}
