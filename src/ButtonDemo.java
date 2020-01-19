import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ButtonDemo extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private Container c;
	private JTextField tf;
	private JButton btn1,btn2,btn3;
	private Font f;
	private Cursor cursor;
	private ImageIcon img;
	
	ButtonDemo()
	{
		initDemo();
	}
	public void initDemo()
	{
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.CYAN);
		
		f = new Font("Arial",Font.BOLD,18);
		
		cursor = new Cursor(Cursor.HAND_CURSOR);
		
		img = new ImageIcon(new ImageIcon("C:\\Users\\Sabbir\\eclipse-workspace\\Java Swing\\src\\jigsaw.png").getImage().getScaledInstance(100, 40, Image.SCALE_DEFAULT));
		
		tf = new JTextField();
		tf.setBounds(30,50,400,40);
		tf.setFont(f);
		c.add(tf);
		
		btn1 = new JButton("Submit");
		btn1.setBounds(30,100,100,40);
		btn1.setFont(f);
		btn1.setCursor(cursor);
		btn1.setForeground(Color.white);
		btn1.setBackground(Color.blue);
		c.add(btn1);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e)
			{
				String s = tf.getText();
				if(s.isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Type something on text field.");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Submitted Message: "+s);
				}
				
			}
		});
		
		
		btn2 = new JButton("Clear");
		btn2.setBounds(160,100,100,40);
		btn2.setFont(f);
		btn2.setCursor(cursor);
		btn2.setForeground(Color.white);
		btn2.setBackground(Color.red);
		c.add(btn2);
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e)
			{
				tf.setText(" ");
			}
		});
		
		btn3 = new JButton(img);
		btn3.setBounds(280,100,100,40);
		btn3.setFont(f);
		btn3.setCursor(cursor);
		c.add(btn3);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ButtonDemo frame = new ButtonDemo();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setBounds(10,30,500,500);
		frame.setTitle("Pulok");
		frame.setResizable(false);
	}

}
