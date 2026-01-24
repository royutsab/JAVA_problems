package mymy;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Frame_of_Menubar extends JFrame implements ActionListener{
	JMenuBar menu;
	JMenu fileMenu;
	JMenu editMenu ;
	JMenu helpMenu;
	JMenuItem loaditem;
	JMenuItem saitem;
	JMenuItem exititem;
	public Frame_of_Menubar() {
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(500, 500);
	this.setLayout(new FlowLayout());
	
	 menu = new JMenuBar();
	fileMenu = new JMenu("File");
editMenu = new JMenu("Edit");
	 helpMenu = new JMenu("Help");
	
	loaditem = new JMenuItem("Load");
	saitem = new JMenuItem("Save");
 exititem = new JMenuItem("Exit");
	
	loaditem.addActionListener(this);
	saitem.addActionListener(this);
	exititem.addActionListener(this);
	
	fileMenu.setMnemonic(KeyEvent.VK_F);// Alt+ f for file
	editMenu.setMnemonic(KeyEvent.VK_E);//Alt+e for edit
	helpMenu.setMnemonic(KeyEvent.VK_H);//Alt+h to get into help menu
	loaditem.setMnemonic(KeyEvent.VK_L);//L for load
	saitem.setMnemonic(KeyEvent.VK_S);//S for save
	exititem.setMnemonic(KeyEvent.VK_E);//E for exit
	
	fileMenu.add(loaditem);
	fileMenu.add(saitem);
	fileMenu.add(exititem);
	
	menu.add(fileMenu);
	menu.add(editMenu);
	menu.add(helpMenu);
	
	this.setJMenuBar(menu);
	
	this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== loaditem) {
			System.out.println("loading successful!");
		}
		else if(e.getSource() == saitem) {
			System.out.println("saving successful!");
		}
		else if(e.getSource()== exititem) {
			System.out.println("exiting successfull");
			this.dispose();
		}
	}

}
