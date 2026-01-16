package hello_there;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
Drag_panel drag = new Drag_panel();

	public MyFrame() {
		
		
		
		
		
		this.add(drag);
		this.setTitle("it's a demo");
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}
