import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class AfterLogin extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Container c;
	private JLabel welcome;
	private Font f;
	AfterLogin()
	{
		initDemo();
	}
	
	public void initDemo()
	{
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setBounds(20,30,400,300);
		this.setTitle("After Login");
		
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.CYAN);
		
		f = new Font("Arial",Font.ITALIC+Font.BOLD,18);
		welcome = new JLabel("Welcome! ");
		welcome.setBounds(120,100,100,40);
		welcome.setFont(f);
		c.add(welcome);
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AfterLogin frame = new AfterLogin();
		frame.setVisible(true);
	}

}
