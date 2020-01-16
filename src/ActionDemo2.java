import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ActionDemo2 extends JFrame{

	private Container c;
	private JTextField tf1,tf2; 
	private Font f;
	
	ActionDemo2()
	{
		initDemo();
	}
	
	public void initDemo()
	{
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.CYAN);
		
		f = new Font("Arial",Font.BOLD + Font.ITALIC,16);
		
		tf1 = new JTextField();
		tf1.setBounds(20,20,150,40);
		tf1.setBackground(Color.DARK_GRAY);
		tf1.setForeground(Color.WHITE);
		tf1.setFont(f);
		tf1.setHorizontalAlignment(JTextField.CENTER);
		c.add(tf1);
		
		tf2 = new JTextField();
		tf2.setBounds(20,80,150,40);
		tf2.setBackground(Color.DARK_GRAY);
		tf2.setForeground(Color.WHITE);
		tf2.setFont(f);
		tf2.setHorizontalAlignment(JTextField.CENTER);
		c.add(tf2);
		
		Handler handle = new Handler();
		tf1.addActionListener(handle);
		tf2.addActionListener(handle);
		
		
	}
	
	 class Handler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==tf1)
			{
				String s = tf1.getText();
				if(s.isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Type something on 1st Text Field.");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "1st Text Field : "+s);
				}
			}
			else
			{
				String s = tf2.getText();
				if(s.isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Type something on 2nd Text Field.");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "2nd Text Field : "+s);
				}
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionDemo2 frame = new ActionDemo2();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setBounds(10,10,500,500);
		frame.setTitle("Pulok");
		frame.setResizable(false);
	}

}
