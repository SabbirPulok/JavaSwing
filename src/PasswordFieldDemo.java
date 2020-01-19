import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class PasswordFieldDemo extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private Container c;
	private JPasswordField pf;
	private Font f;
	
	PasswordFieldDemo()
	{
		initDemo();
	}
	public void initDemo()
	{
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.CYAN);
		
		f = new Font("Arial",Font.BOLD,18);
		
		pf = new JPasswordField();
		pf.setEchoChar('*');
		pf.setBounds(50,30,160,27);
		pf.setFont(f);
		pf.setForeground(Color.RED);
		pf.setBackground(Color.BLUE);
		c.add(pf);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PasswordFieldDemo frame = new PasswordFieldDemo();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setBounds(10,30,500,500);
		frame.setTitle("Pulok");
		frame.setResizable(false);
	}

}
