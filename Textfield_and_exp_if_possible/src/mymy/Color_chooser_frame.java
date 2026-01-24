package mymy;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Color_chooser_frame extends JFrame implements ActionListener{
	JButton button;
	JLabel label;
public Color_chooser_frame() {
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLayout(new FlowLayout());
	
	button = new JButton("Pick a color");
	button.addActionListener(this);
	
	label = new JLabel();
	label.setBackground(Color.white);
	label.setText("This is the demo");
	label.setFont(new Font("MV Boli",Font.PLAIN,100));
	label.setOpaque(true);
	
	this.add(button);
	this.add(label);
	this.pack();
	this.setVisible(true);
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== button) {
			JColorChooser colorpick = new JColorChooser();//no need of this though
			
			Color color = JColorChooser.showDialog(null, "Color picker", Color.BLACK);
			
			label.setForeground(color);
		}
	}

}
