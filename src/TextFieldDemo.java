import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class TextFieldDemo extends JFrame {

	private Container c; 
	private JTextField tf1,tf2;
	private Font f;
	TextFieldDemo()
	{
		initDemo();
	}
	
	public void initDemo()
	{
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.cyan);
		
		f = new Font("Arial",Font.ITALIC+Font.BOLD,16);
		
		tf1 = new JTextField();
		tf1.setBounds(50,30,160,40);
		tf1.setFont(f);
		tf1.setBackground(Color.GRAY);
		tf1.setForeground(Color.BLUE);
		tf1.setHorizontalAlignment(JTextField.CENTER);
		c.add(tf1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TextFieldDemo frame = new TextFieldDemo();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setBounds(100,100,500,500);
		frame.setTitle("TextFieldDemo");
	}

}
