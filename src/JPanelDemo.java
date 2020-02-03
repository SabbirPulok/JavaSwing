import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelDemo extends JFrame{

	private Container c;
	private JLabel label;
	private JButton btn1,btn2,btn3;
	private JPanel panel1,panel2;
	JPanelDemo()
	{
		initDemo();
	}
	public void initDemo()
	{
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.DARK_GRAY);
		
		label = new JLabel("JPanel");
		label.setBounds(20,30,120,30);
		label.setForeground(Color.WHITE);
		c.add(label);
		
		btn1 = new JButton("Checkout");
		btn2 = new JButton("Add to cart");
		btn3 = new JButton("Confirm");
		
		
		panel1 = new JPanel();
		panel1.setBounds(20,100,200,300);
		panel1.setBackground(Color.BLUE);
		c.add(panel1);
		
		
		
		panel2 = new JPanel();
		panel2.setBounds(230,100,200,300);
		panel2.setBackground(Color.RED);
		c.add(panel2);
		
		panel1.add(btn1);
		panel1.add(btn2);
		panel2.add(btn3);
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JPanelDemo frame =new JPanelDemo();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,150,500,550);
		frame.setTitle("JPanel Demo");

	}

}
