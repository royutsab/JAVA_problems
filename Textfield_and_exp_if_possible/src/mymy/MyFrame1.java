package mymy;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame1 extends JFrame implements ActionListener{
	JButton button;
	JCheckBox checkbox;
	ImageIcon yes;
	ImageIcon no;
public MyFrame1() {
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLayout(new FlowLayout());
	
	yes = new ImageIcon(getClass().getResource("yes_mark.png"));
	no = new ImageIcon(getClass().getResource("no_mark.png"));
	 button = new JButton();
	button.setText("Submit");
	button.addActionListener(this);
	
	checkbox = new JCheckBox();
	checkbox.setText("Reday to go!");
	checkbox.setFocusable(false);
	checkbox.setFont(new Font("Consolas",Font.PLAIN,25));
	checkbox.setIcon(no);
checkbox.setSelectedIcon(yes);	
	
	this.add(button);
	this.add(checkbox);
	this.pack();
	this.setVisible(true);
}
	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource()== button) {
		System.out.println(checkbox.isSelected());
	}
		
	}

}
