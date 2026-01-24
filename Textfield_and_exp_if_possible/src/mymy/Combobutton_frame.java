package mymy;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Combobutton_frame extends JFrame implements ActionListener{
	JComboBox combobox;
public Combobutton_frame() {
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLayout(new FlowLayout());
	
	String[] animals = {"dog","cat","duck"};//need wrapper class array
	 combobox = new JComboBox(animals);
	 combobox.addActionListener(this); 
	 
	// combobox.setEditable(true);
	//combobox.addItem("horse");
	// combobox.insertItemAt("pig", 0);
	 //combobox.setSelectedIndex(0);
	 
	this.add(combobox);
	this.pack();
	this.setVisible(true);
}
	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource()==combobox) {
	System.out.println(combobox.getSelectedItem());
	}
		
	}

}
