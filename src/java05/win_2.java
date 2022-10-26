package java05;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class win_2 extends Frame {
	
	public win_2() {
		setSize(500,500);
		setVisible(true);
		addWindowListener(new WinExit());
	}
	class WinExit extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
}
