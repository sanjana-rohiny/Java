package lesson3;

/* extending from Frame and implementing ActionListener */

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Sample3 extends JFrame implements ActionListener {

	JButton b1;
	JButton b2;
	JButton b3;
	JLabel label;
	
	public Sample3() {
		super("Container frame..!");
		
		label = new JLabel("Press a Button");
		b1 = new JButton("OK");
		b2 = new JButton("Cancel");
		b3 = new JButton("Test Button");
		
		add(label);
		add(b1);
		add(b2);
		add(b3);
		
		setLayout(new FlowLayout());
		setSize(700,300);
		setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("Test Button Pressed..!");
			}
		});
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			label.setText("OK Pressed..!");
		}
		
		if(e.getSource() == b2) {
			label.setText("Cancel Pressed..!");
		}
	}
	
	public static void main (String[] args) {
		Sample3 s3 = new Sample3();		
	}


}
