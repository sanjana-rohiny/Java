package appletest;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletTest extends Applet implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	TextField num1 = new TextField();
	TextField num2 = new TextField();
	TextField sum = new TextField();
	
	public AppletTest() throws HeadlessException {
	
		System.out.println("---inside Constructor()");

		Label l1 = new Label("First number ");
		Label l2 = new Label("Second number ");
		Label l3 = new Label("Sum ");

		setLayout(new GridLayout(3,2));
		add(l1);
		add(num1);
		add(l2);
		add(num2);
		add(l3);
		add(sum);
		num2.addActionListener(this);
	}
	
	public void init() {
		System.out.println("---inside init()");
	}

    public void start() {
		System.out.println("---inside start()");
	}
    
    public void stop() {
		System.out.println("---inside stop()");
	}
    
    public void paint(Graphics g) {
		System.out.println("---inside Paint()");
	}
    
    public void distroy() {
		System.out.println("---inside distroy()");
	}
    
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		int sum = Integer.parseInt(num1.getText()) + Integer.parseInt(num2.getText());
		this.sum.setText(String.valueOf(sum));
		
	}

}