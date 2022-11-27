package light_awt;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JRadioButton;

public class TrafficLight_awt extends Panel{

	Frame f;
	Color redSign, greenSign, yellowSign;
	Checkbox red, green, yellow;
	CheckboxGroup checkBoxGroup;
	
	public TrafficLight_awt() {
		f = new Frame();
		checkBoxGroup = new CheckboxGroup();
		
		red = new Checkbox("red", checkBoxGroup, false);
		green = new Checkbox("green", checkBoxGroup, false);
		yellow = new Checkbox("yellow", checkBoxGroup, false);
		
		f.setSize(400,400);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
		        System.exit(0);
		    }
		});
	}
	
	public void start() {
		red.setBounds(50,50,50,50);
		green.setBounds(120,50,50,50);
		yellow.setBounds(170,50,50,50);

		f.add(red);
		f.add(green);
		f.add(yellow);		
		f.add(this);
		
		redSign = greenSign =  yellowSign = Color.LIGHT_GRAY;
		
		red.addItemListener(listener);
		green.addItemListener(listener);
		yellow.addItemListener(listener);
	}

	ItemListener listener = new ItemListener() {
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			redSign = greenSign =  yellowSign = Color.LIGHT_GRAY;
			if (e.getSource() == red) {
				redSign = Color.red;
			} else if (e.getSource() == green) {
				greenSign = Color.green;
			} if (e.getSource() == yellow) {
				yellowSign = Color.yellow;
			}
			repaint();
		}
	};
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		g.drawOval(20, 100, 50, 50);
		g.setColor(redSign);
		g.fillOval(20, 100, 50, 50);
		
		g.drawOval(20, 160, 50, 50);
		g.setColor(greenSign);
		g.fillOval(20, 160, 50, 50);
		
		g.drawOval(20, 230, 50, 50);
		g.setColor(yellowSign);
		g.fillOval(20, 230, 50, 50);
	}
	
	public static void main(String[] args) {

		TrafficLight_awt tl = new TrafficLight_awt();
		tl.start();
	}
}
