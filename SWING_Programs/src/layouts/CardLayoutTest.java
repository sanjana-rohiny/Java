package layouts;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CardLayoutTest extends JFrame{

	CardLayout card;
	JButton b1,b2,b3;
	Container panel;
	public CardLayoutTest() {
		panel = getContentPane();
		card=new CardLayout(4,30);
		this.setLayout(card);
		
		b1=new JButton("Apple");
		b2=new JButton("Boy");
		b3=new JButton("Cat");
		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		
		setSize(400, 400);
		setVisible(true);
		b1.addActionListener(listener);
		b2.addActionListener(listener);
		b3.addActionListener(listener);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	ActionListener listener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			card.next(panel);
		}
		
	};
	public static void main(String[] args) {
		CardLayoutTest c = new CardLayoutTest();
	}

}
