import java.awt.Color;
import java.awt.Container;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class WindowListenerDemo extends JFrame{

	private Container c;
	
	
	WindowListenerDemo()
	{
		initDemo();
	}
	
	public void initDemo()
	{
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.cyan);
		
		this.addWindowListener(new WindowListener() {

			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Window Activated.\n");
			}

			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Window Closed.\n");
				
			}

			@Override
			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Window Closing.\n");
				
			}

			@Override
			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Window Deactivated.\n");
			}

			@Override
			public void windowDeiconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Window Deiconified\n");
			}

			@Override
			public void windowIconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Window Iconified\n");
			}

			@Override
			public void windowOpened(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Window Opened\n");
			}
			
		});
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WindowListenerDemo frame = new WindowListenerDemo();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,150,500,500);
		frame.setTitle("Window Listener Demo");
		
		
		
	}

	

}
