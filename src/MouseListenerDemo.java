import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MouseListenerDemo extends JFrame{
	
	private Container c;
	private JTextField tf;
	private JTextArea ta;
	private JScrollPane scroll;
	
	MouseListenerDemo()
	{
		initDemo();
	}
	public void initDemo()
	{
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.cyan);
		
		tf = new JTextField();
		tf.setBounds(30,20,200,40);
		c.add(tf);
		
		ta = new JTextArea();
		ta.setLineWrap(true);
		ta.setWrapStyleWord(true);
		
		scroll = new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll.setBounds(30,80,200,300);
		c.add(scroll);
		
		tf.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				ta.append("Mouse Entered.\n");
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				ta.append("Mouse Exited.\n");
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				ta.append("Mouse Pressed.\n");
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				ta.append("Mouse Released.\n");
				
			}
			
		});
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MouseListenerDemo frame = new MouseListenerDemo();
		frame.setVisible(true);
		frame.setBounds(100,150,500,550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Mouse Listener Demo");
	}

}
