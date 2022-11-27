package layouts;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BorderLayoutTest {
	JFrame f;
	JButton b1;
	JButton b2;
	JLabel label1;
	JLabel label2;

	public BorderLayoutTest() {
		f = new JFrame("Container frame..!");
		
		label1 = new JLabel("Press a Button");
		label2 = new JLabel("Press a Button");

		b1 = new JButton("OK");
		b2 = new JButton("Cancel");
		BorderLayout bl = new BorderLayout();
		
		f.add(b1, BorderLayout.EAST);
		f.add(b2, BorderLayout.WEST);
		f.add(label1, BorderLayout.NORTH);
		f.add(label2, BorderLayout.SOUTH);
		
		f.setSize(300,300);
		f.setVisible(true);
		
		b1.addActionListener(listener);
		b2.addActionListener(listener);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	ActionListener listener = new ActionListener () {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == b1) {
				label1.setText("OK Pressed..!");
			}
			
			if(e.getSource() == b2) {
				label1.setText("Cancel Pressed..!");
			}
		}
	};
	

	public static void main (String[] args) {
		BorderLayoutTest s = new BorderLayoutTest();		
	}
}
