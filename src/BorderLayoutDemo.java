import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BorderLayoutDemo extends JFrame{

	private Container c;
	private JLabel label;
	private JButton[] btn = new JButton[5];
	private BorderLayout bLayout;
	
	BorderLayoutDemo()
	{
		initDemo();
	}
	public void initDemo()
	{
		c = this.getContentPane();
		bLayout = new BorderLayout();
		bLayout.setHgap(10);
		bLayout.setVgap(5);
		c.setLayout(bLayout);
		
		btn[0] = new JButton("North");
		btn[1] = new JButton("South");
		btn[2] = new JButton("East");
		btn[3] = new JButton("West");
		btn[4] = new JButton("Center");
		
		c.add(btn[0],BorderLayout.NORTH);
		c.add(btn[1],BorderLayout.SOUTH);
		c.add(btn[2],BorderLayout.EAST);
		c.add(btn[3],BorderLayout.WEST);
		c.add(btn[4],BorderLayout.CENTER);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BorderLayoutDemo frame =new BorderLayoutDemo();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,150,500,550);
		frame.setTitle("JPanel Demo");

	}

}
