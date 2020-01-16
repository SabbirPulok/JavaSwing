import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

public class JLabelDemo extends JFrame{

	private ImageIcon icon,img;
	private Container c;
	private JLabel userLabel,passLabel,imgLabel;
	private Font f;
	private JTextField tf1,tf2;
	
	JLabelDemo()
	{
		initDemo();
	}
	public void initDemo()
	{
		icon = new ImageIcon("C:\\Users\\Sabbir\\eclipse-workspace\\Java Swing\\src\\images\\jigsaw.png");
		this.setIconImage(icon.getImage());
		
		f = new Font("Arial",Font.BOLD,16);
		
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.BLUE);
		
		
		userLabel = new JLabel();
		userLabel.setText("Enter your name? ");
		userLabel.setBounds(30,1,200,40);
		userLabel.setFont(f);
		userLabel.setForeground(Color.ORANGE);
		userLabel.setOpaque(true);
		userLabel.setBackground(Color.cyan);
		userLabel.setToolTipText("Type your name here");
		c.add(userLabel);
		
		tf1 = new JTextField("Type your name here");
		tf1.setBounds(30,50,200,40);
		tf1.setFont(f);
		c.add(tf1);
		
		//System.out.println(" "+userLabel.getText());
		//System.out.println(" "+userLabel.getToolTipText());
		
		passLabel = new JLabel();
		passLabel.setText("Enter your password? ");
		passLabel.setBounds(30,100,200,40);
		passLabel.setFont(f);
		//passLabel.setForeground(Color.ORANGE);
		//passLabel.setOpaque(true);
		//passLabel.setBackground(Color.cyan);
		c.add(passLabel);
		
		img = new ImageIcon("C:\\Users\\Sabbir\\eclipse-workspace\\Java Swing\\src\\images\\image.png");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(30,240,img.getIconWidth(),img.getIconHeight());
		c.add(imgLabel);
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JLabelDemo frame = new JLabelDemo();
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(150,100,600,600);
		frame.setTitle("Pulok");
		frame.setResizable(false);
		
	}

}
