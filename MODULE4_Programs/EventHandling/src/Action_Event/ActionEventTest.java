package Action_Event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ActionEventTest {
	
	
	public static void main(String[] args) {
		
		Frame frame = new Frame("ActionEventExample");	    
		frame.setLayout(new GridLayout(5,3));
		
		TextField num1 = new TextField();
		TextField num2 = new TextField();
		TextField result = new TextField();
	    
		Label l1 = new Label("First number ");
		Label l2 = new Label("Second number ");
		Label l3 = new Label("Result ");

		Button addButton = new Button("Add");
		Button subButton = new Button("Sub");
		
		frame.add(l1);
		frame.add(num1);
		frame.add(l2);
		frame.add(num2);
		frame.add(l3);
		frame.add(result);
		frame.add(addButton);
		frame.add(subButton);
		
		frame.setSize(400, 400);
	    frame.setVisible(true);
	    
	    
	    // register action listener for button1
		ActionListener add = new ActionListener() {			
			public void actionPerformed(ActionEvent arg0) {
				
				Button b = (Button) arg0.getSource();
				
				System.out.println("Source =" + b.getActionCommand());
				System.out.println("Source =" + arg0.getActionCommand());

				int sum = Integer.parseInt(num1.getText()) + 
						Integer.parseInt(num2.getText());
				result.setText(String.valueOf(sum));	
				System.out.println("Sum =" + sum);
				}
		};
		
		addButton.addActionListener(add);

	    // register action listener for button2
		ActionListener sub = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            
				int sum = Integer.parseInt(num1.getText()) - Integer.parseInt(num2.getText());
				result.setText(String.valueOf(sum));
				}
			};
		subButton.addActionListener(sub);

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
		        System.exit(0);
		    }
		});
		
	    frame.setSize(400, 400);
	    frame.setVisible(true);
	}

}