import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MouseMotionListenerDemo extends JFrame{
	
	private Container c;
	private JTextField tf;
	private JTextArea ta;
	
	MouseMotionListenerDemo()
	{
		initDemo();
	}
	
	public void initDemo()
	{
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.cyan);
		
		ta = new JTextArea();
		ta.setBounds(20,30,300,300);
		c.add(ta);
		
		tf = new JTextField();
		tf.setBounds(330,30,160,50);
		c.add(tf);
		
		ta.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent arg0) {
				// TODO Auto-generated method stub
				tf.setText("Mouse Dragged");
				
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				tf.setText("Mouse Moved at ("+e.getX()+","+e.getY()+") ");
				
			}
			
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MouseMotionListenerDemo frame = new MouseMotionListenerDemo();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Mouse Motion Listener Demo");
		frame.setBounds(100,150,500,500);
		frame.setResizable(false);
	}

}
