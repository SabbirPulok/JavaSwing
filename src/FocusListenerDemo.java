import java.awt.Color;
import java.awt.Container;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FocusListenerDemo extends JFrame{

	private Container c;
	private JButton btn,btn1;
	private JTextArea ta;
	private JScrollPane scroll;
	
	
	FocusListenerDemo()
	{
		initDemo();
	}
	
	public void initDemo()
	{
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.cyan);
		
		btn = new JButton("Green Baret");
		btn.setBounds(10,20,150,50);
		btn.setBackground(Color.green);
		btn.setForeground(Color.black);
		c.add(btn);
		
		btn1 = new JButton("Red Baret");
		btn1.setBounds(10,100,150,50);
		btn1.setBackground(Color.red);
		btn1.setForeground(Color.black);
		c.add(btn1);
		
		ta  = new JTextArea();
		ta.setLineWrap(true);
		ta.setWrapStyleWord(true);
		
		scroll = new JScrollPane(ta);
		scroll.setBounds(170,20,250,350);
		c.add(scroll);
		
		Handler handle = new Handler();
		btn.addFocusListener(handle);
		btn1.addFocusListener(handle);
		
		
	}
	
	class Handler implements FocusListener{
		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==btn)
			{
				ta.append("Focus Gained on Green Button\n");
			}
			else if(e.getSource()==btn1)
			{
				ta.append("Focus Gained on Red Button\n");
			}
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==btn)
			{
				ta.append("Focus Lost on Green Button\n");
			}
			else if(e.getSource()==btn1)
			{
				ta.append("Focus Lost on Red Button\n");
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FocusListenerDemo frame = new FocusListenerDemo();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,150,500,500);
		frame.setTitle("Focus Listener Demo");
		frame.setResizable(false);
	}

	

}
