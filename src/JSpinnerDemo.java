import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

public class JSpinnerDemo extends JFrame implements ChangeListener{

	private ImageIcon icon,img;
	private Container c;
	private JLabel userLabel,ageLabel;
	private Font f;
	private JSpinner age;
	
	JSpinnerDemo()
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
		userLabel.setText("Enter your age? ");
		userLabel.setBounds(30,10,200,40);
		userLabel.setFont(f);
		userLabel.setForeground(Color.ORANGE);
		userLabel.setOpaque(true);
		userLabel.setBackground(Color.cyan);
		userLabel.setToolTipText("Type your age here");
		c.add(userLabel);
		
		SpinnerNumberModel value = new SpinnerNumberModel(18,12,70,1);
		age = new JSpinner(value);
		age.setBounds(30,60,50,30);
		age.setFont(f);
		c.add(age);
		
		age.addChangeListener(this);
		
		ageLabel = new JLabel();
		
		ageLabel.setBounds(30,100,200,40);
		ageLabel.setFont(f);
		ageLabel.setForeground(Color.RED);
		ageLabel.setOpaque(true);
		ageLabel.setBackground(Color.cyan);
		
		c.add(ageLabel);
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		
		String number = age.getValue().toString();
		int value = Integer.parseInt(number);
		ageLabel.setText("Your age is "+value);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSpinnerDemo frame = new JSpinnerDemo();
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(150,100,300,300);
		frame.setTitle("Spinner Demo");
		
		
	}
	

}
