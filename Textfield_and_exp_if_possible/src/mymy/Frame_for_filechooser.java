package mymy;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class Frame_for_filechooser extends JFrame implements ActionListener{
	JButton button;
public Frame_for_filechooser() {
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLayout(new FlowLayout());
	
	 button = new JButton("Select file");
	button.addActionListener(this);
	
	this.add(button);
	this.pack();
	this.setVisible(true);
}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			JFileChooser filechose = new JFileChooser();
			
			filechose.setCurrentDirectory(new File("C:\\Users\\Utsab"));
			
		int response =filechose.showOpenDialog(null);//this will select file to open
		if(response ==JFileChooser.APPROVE_OPTION) {
			File file = new File(filechose.getSelectedFile().getAbsolutePath());
			System.out.println(file);
		}
		}
		
	}

}
