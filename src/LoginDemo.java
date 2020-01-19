import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginDemo extends JFrame{

	private Container c;
	private ImageIcon icon;
	private JLabel userLabel, passwordLabel;
	private JTextField usertf;
	private JPasswordField passtf;
	private JButton loginButton ,clearButton;
	private Font f;
	
	
	LoginDemo(){
		initDemo();
	}
	
	public void initDemo()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100,50,400,400);
		this.setTitle("Login Demo");
		this.setResizable(false);
		
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.CYAN);
		
		icon = new ImageIcon("C:\\Users\\Sabbir\\eclipse-workspace\\Java Swing\\src\\images\\jigsaw.png");
		this.setIconImage(icon.getImage());
		
		f = new Font("Arial", Font.BOLD, 18);
		
		userLabel = new JLabel("Username: ");
		userLabel.setBounds(20,80,120,30);
		userLabel.setFont(f);
		c.add(userLabel);
		
		usertf = new JTextField();
		usertf.setBounds(150,80,200,30);
		usertf.setFont(f);
		c.add(usertf);
		
		passwordLabel = new JLabel("Password: ");
		passwordLabel.setBounds(20,120,120,30);
		passwordLabel.setFont(f);
		c.add(passwordLabel);
		
		passtf = new JPasswordField();
		passtf.setBounds(150,120,200,30);
		passtf.setEchoChar('*');
		c.add(passtf);
		
		loginButton = new JButton("Login");
		loginButton.setBounds(30,180,140,40);
		loginButton.setFont(f);
		loginButton.setBackground(Color.BLUE);
		loginButton.setForeground(Color.white);
		c.add(loginButton);
		
		loginButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String username = usertf.getText();
				String password = passtf.getText();
				
				if(username.equals("Pulok") && password.equals("Pulok123"))
				{
					JOptionPane.showMessageDialog(null, "You are logged in.");
					//dispose();
					AfterLogin frame = new AfterLogin();
					frame.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid username or password.");
				}
				
			}
			
		});
	
	
		clearButton = new JButton("Cancel");
		clearButton.setBounds(190,180,140,40);
		clearButton.setFont(f);
		clearButton.setBackground(Color.RED);
		clearButton.setForeground(Color.white);
		c.add(clearButton);
		
		clearButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				usertf.setText("");
				passtf.setText("");
				
			}
			
		});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginDemo frame = new LoginDemo();
		frame.setVisible(true);

	}

}
