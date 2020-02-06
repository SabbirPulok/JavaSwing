import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class ToggleButtonDemo extends JFrame implements ActionListener{

	private Container c;
	private JToggleButton tbR, tbO, tbD;
	
	
	ToggleButtonDemo()
	{
		initDemo();
	}
	public void initDemo()
	{
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.BLUE);
		
		tbR = new JToggleButton("Red");
		tbR.setBounds(310,30,150,30);
		tbR.setBackground(Color.RED);
		c.add(tbR);
		
		tbR.addActionListener(this);
		
		
		tbO = new JToggleButton("Orange");
		tbO.setBounds(310,70,150,30);
		tbO.setBackground(Color.ORANGE);
		c.add(tbO);
		
		tbO.addActionListener(this);
		

		tbD = new JToggleButton("No Color");
		tbD.setBounds(310,110,150,30);
		c.add(tbD);
		
		tbD.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(tbR.isSelected())
		{
			tbR.setText("Now Red");
			c.setBackground(Color.RED);
		}
		
		
		else if(tbO.isSelected())
		{
			tbO.setText("Now Orange");
			c.setBackground(Color.ORANGE);
		}
		
		else if(tbD.isSelected())
		{
			tbD.setText("No Color ON");
			c.setBackground(Color.WHITE);
		}
		
		else
		{
			tbR.setText("Red");
			tbO.setText("Orange");
			tbD.setText("No Color");
			c.setBackground(Color.BLUE);
		}
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ToggleButtonDemo frame =new ToggleButtonDemo();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,150,500,550);
		frame.setTitle("Toggle Button Demo");

	}
	
	
}
