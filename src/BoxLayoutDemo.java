import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BoxLayoutDemo extends JFrame{

	private Container c;

	private JButton[] btn = new JButton[10];
	private BoxLayout bLayout;
	
	BoxLayoutDemo()
	{
		initDemo();
	}
	public void initDemo()
	{
		c = this.getContentPane();
		bLayout = new BoxLayout(c,BoxLayout.Y_AXIS);
	
		c.setLayout(bLayout);
		c.setBackground(Color.ORANGE);
		
		for(int i=0; i<10; i++)
		{
			btn[i]  = new JButton(""+ (i+1) );
			c.add(btn[i]);
			c.add(Box.createHorizontalStrut(5));
			c.add(Box.createVerticalStrut(5));
			//c.add(bLayout.createHorizontalStrut(10));
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BoxLayoutDemo frame =new BoxLayoutDemo();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,150,500,550);
		frame.setTitle("Flow Layout Demo");

	}

}
