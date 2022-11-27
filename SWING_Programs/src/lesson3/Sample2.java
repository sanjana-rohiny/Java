package lesson3;
/* NOT extending from Frame and NOT implementing ActionListener */

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Sample2 {

	JFrame f;
	JButton b1;
	JButton b2;
	JLabel label;
	JPanel p;
	public Sample2() {
		f = new JFrame("Container frame..!");
		
		label = new JLabel("Press a Button");
		b1 = new JButton("OK");
		b2 = new JButton("Cancel");

		f.add(label);
		f.add(b1);
		f.add(b2);
		
		f.setLayout(new FlowLayout());
		f.setSize(300,300);
		f.setVisible(true);
		
		
		
		b1.addActionListener(listener);
		b2.addActionListener(listener);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	ActionListener listener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == b1) {
				label.setText("OK Pressed..!");
			}
			
			if(e.getSource() == b2) {
				label.setText("Cancel Pressed..!");
			}			
		}
	};

	public static void main (String[] args) {
		Sample2 s2 = new Sample2();		
	}
}
