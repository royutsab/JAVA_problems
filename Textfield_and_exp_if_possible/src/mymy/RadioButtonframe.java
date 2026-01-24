package mymy;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonframe extends JFrame implements ActionListener{
	JRadioButton pizzabutton;
	JRadioButton burgerbutton;
	JRadioButton sodabutton;
public RadioButtonframe() {
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLayout(new FlowLayout());
	
	 pizzabutton = new JRadioButton("pizza");
	burgerbutton = new JRadioButton("burger");
	 sodabutton = new JRadioButton("soda");
	
	ButtonGroup group = new ButtonGroup();
	group.add(sodabutton);
	group.add(burgerbutton);
	group.add(pizzabutton);
	
	pizzabutton.addActionListener(this);
	burgerbutton.addActionListener(this);
	sodabutton.addActionListener(this);
	
	this.add(sodabutton);
	this.add(burgerbutton);
	this.add(pizzabutton);
	this.pack();
	this.setVisible(true);
}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==pizzabutton) {
			System.out.println("you ordered pizza");
		}
		else if(e.getSource()==burgerbutton)
		{
			System.out.println("you ordered burger");
		}
		else if(e.getSource()==sodabutton) {
			System.out.println("yoou ordered soda");
		}
		
	}

}
