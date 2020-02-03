import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FlowLayoutDemo extends JFrame{

	private Container c;

	private JButton[] btn = new JButton[10];
	private FlowLayout fLayout;
	
	FlowLayoutDemo()
	{
		initDemo();
	}
	public void initDemo()
	{
		c = this.getContentPane();
		fLayout = new FlowLayout(FlowLayout.LEFT,10,15);
		c.setLayout(fLayout);
		c.setBackground(Color.ORANGE);
		
		for(int i=0; i<10; i++)
		{
			btn[i]  = new JButton(""+ (i+1) );
			c.add(btn[i]);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FlowLayoutDemo frame =new FlowLayoutDemo();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,150,500,550);
		frame.setTitle("Flow Layout Demo");

	}

}
