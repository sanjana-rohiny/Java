package layouts;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridBagLayoutTest {
	JTextField tf1;
	JTextField tf2;
	JTextField tf3;

	JLabel l1;
	JLabel l2;
	JLabel l3;
	
	JButton add;
	JButton sub;
	JFrame f;
	public GridBagLayoutTest() {
		JFrame f = new JFrame("Gridlayout...!");
		tf1 = new JTextField(30);
		tf2 = new JTextField(30);
		tf3 = new JTextField(30);
		
		l1 = new JLabel("Enter No 1");
		l2 = new JLabel("Enter No 2");
		l3 = new JLabel("Result");
		
		add = new JButton("add");
		sub = new JButton("sub");

		//f.add(l2); f.add(tf2);
		//f.add(l3); f.add(tf3);
		//f.add(add); f.add(sub);
		
		GridBagLayout gbag = new GridBagLayout();
		
		// define gridbagconstraints
		//location and size of each component in a grid bag are
		//determined by a set of constraints linked to it
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.weightx = 1.0;
		// use a column weight of 1
		gbc.ipadx = 20;
		// pad by 200 units
		gbc.insets = new Insets(4, 4, 10, 10); // inset slightly from top left
		gbc.anchor = GridBagConstraints.WEST;
		gbc.gridwidth = GridBagConstraints.RELATIVE;
		gbag.setConstraints(l1,gbc);
		f.add(l1);

		gbc.anchor = GridBagConstraints.WEST;
		
		gbag.setConstraints(tf1,gbc);
		f.add(tf1);
		
		f.setLayout(gbag);
		f.setSize(400,400);
		f.setVisible(true);
	}
	
	public static void main (String[] args) {
		GridBagLayoutTest s = new GridBagLayoutTest();		
	}
}
