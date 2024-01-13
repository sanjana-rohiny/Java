package Mouse_event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MListener implements MouseListener {
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseClicked...!");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("mouseEntered...!");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("mouseExited...!");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mousePressed...!");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("mouseReleased...!");
	}
}
