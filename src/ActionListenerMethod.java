import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionListenerMethod extends JFrame implements ActionListener{
	
	private Container c;
	private JButton redB,greenB,cyanB;
	
	ActionListenerMethod()
	{
		initDemo();
	}
	
	public void initDemo()
	{
		c = this.getContentPane();
		c.setLayout(null);
		
		redB = new JButton("Red");
		redB.setBounds(50,50,80,20);
		c.add(redB);
		
		greenB = new JButton("Green");
		greenB.setBounds(50,140,80,20);
		c.add(greenB);
		
		cyanB = new JButton("Cyan");
		cyanB.setBounds(50,230,80,20);
		c.add(cyanB);
		
		redB.addActionListener(this);
		greenB.addActionListener(this);
		cyanB.addActionListener(this);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ActionListenerMethod frame = new ActionListenerMethod();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Listener Method");
		frame.setBounds(100,100,400,400);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==redB)
		{
			c.setBackground(Color.RED);
		}
		else if(e.getSource()==greenB)
		{
			c.setBackground(Color.GREEN);
		}
		else
		{
			c.setBackground(Color.cyan);
		}
			
	}

}
