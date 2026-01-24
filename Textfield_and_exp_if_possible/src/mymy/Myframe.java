package mymy;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Myframe extends JFrame implements ActionListener{
	JButton button;
	JTextField text;
	
	public Myframe() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Submit:");
		button.setFocusable(false);
		button.addActionListener(this);
		
		text = new JTextField();
		text.setPreferredSize(new Dimension(250,40));
		text.setFont(new Font("Consolas",Font.PLAIN,25));
		text.setText("Username");
		
		this.add(button);
		this.add(text);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource()== button) {
		System.out.println("Welcome,"+text.getText());
		button.setEnabled(false);//disabling the button and textfield
	text.setEnabled(false);
//	this.dispose(); //if i want to dispose the frame of course
	}
		
	}
	
}
