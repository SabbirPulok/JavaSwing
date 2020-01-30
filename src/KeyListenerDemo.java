import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KeyListenerDemo extends JFrame{

	private Container c;
	private JTextField tf;
	private JTextArea ta;
	private JScrollPane scroll;
	
	KeyListenerDemo()
	{
		initDemo();
	}
	public void initDemo()
	{
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.cyan);
		
		tf = new JTextField();
		tf.setBounds(50,50,300,40);
		
		c.add(tf);
		
		ta = new JTextArea();
		ta.setLineWrap(true);
		ta.setWrapStyleWord(true);
		
		scroll = new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setBounds(50,120,350,200);
		c.add(scroll);
		
		tf.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				ta.append("Key Pressed "+e.getKeyChar()+"\n");
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				ta.append("Key Released "+e.getKeyChar()+"\n");
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				ta.append("Key Typed "+e.getKeyChar()+"\n");
			}

		});
	}
	public static void main(String[] args) {
		
		KeyListenerDemo frame = new KeyListenerDemo();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setBounds(100,150,500,500);
		frame.setTitle("Key Listener Demo");
	}

}
