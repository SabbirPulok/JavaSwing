import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;


import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo extends JFrame{

	private Container c;

	private JButton[] btn = new JButton[10];
	private GridLayout gLayout;
	
	GridLayoutDemo()
	{
		initDemo();
	}
	public void initDemo()
	{
		c = this.getContentPane();
		gLayout = new GridLayout(5,5,5,5);
	
		c.setLayout(gLayout);
		c.setBackground(Color.BLUE);
		
		for(int i=0; i<10; i++)
		{
			btn[i]  = new JButton(""+ (i+1) );
			c.add(btn[i]);
			
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GridLayoutDemo frame =new GridLayoutDemo();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,150,500,550);
		frame.setTitle("Grid Layout Demo");

	}

}
