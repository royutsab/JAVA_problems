package mymy;

import java.awt.*;
import javax.swing.*;
//import javax.swing.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderDemo implements ChangeListener{
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
public SliderDemo() {
	frame = new JFrame("Slider demo");
	panel= new JPanel();
	label = new JLabel();
	slider = new JSlider(0,100,50);//initial,end,middle
	
	slider.setPreferredSize(new Dimension(400,200));
	
	slider.setPaintTicks(true);
	slider.setMinorTickSpacing(10);
	
	slider.setPaintTrack(true);
	slider.setMajorTickSpacing(25);
	
	slider.setPaintLabels(true);
	slider.setFont(new Font("MV Boli",Font.PLAIN,15));
	label.setFont(new Font("MV Boli",Font.PLAIN,25));
	
	slider.setOrientation(SwingConstants.VERTICAL);
	
	
	label.setText("Degree = "+slider.getValue());
	
	slider.addChangeListener(this);
	
	panel.add(slider);
	panel.add(label);
	frame.add(panel);
	frame.setSize(420, 420);
	frame.setVisible(true);
}
	@Override
	public void stateChanged(ChangeEvent e) {
	
		label.setText("Degree = "+slider.getValue());	
	}

}
