import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TabbedPaneDemo extends JFrame implements ChangeListener,ActionListener{

	private ImageIcon icon,homeIcon,helpIcon,contactIcon;
	private Container c;
	private JLabel userLabel,ageLabel;
	private Font f;
	private JSpinner age;
	private JTabbedPane tp;
	private JPanel pHome,pHelp,pContact;
	private JButton btn;
	
	TabbedPaneDemo()
	{
		initDemo();
	}
	public void initDemo()
	{
		icon = new ImageIcon("C:\\Users\\Sabbir\\eclipse-workspace\\Java Swing\\src\\images\\jigsaw.png");
		this.setIconImage(icon.getImage());
		
		homeIcon = new ImageIcon("C:\\Users\\Sabbir\\eclipse-workspace\\Java Swing\\src\\images\\home.png");
		Image image =homeIcon.getImage();
		Image scaleImage = image.getScaledInstance(50,50, Image.SCALE_SMOOTH);
		homeIcon = new ImageIcon(scaleImage);
		
		helpIcon = new ImageIcon("C:\\Users\\Sabbir\\eclipse-workspace\\Java Swing\\src\\images\\help.jpg");
		Image imag =helpIcon.getImage();
		Image scaleImag = imag.getScaledInstance(50,50, Image.SCALE_SMOOTH);
		helpIcon = new ImageIcon(scaleImag);
		
		contactIcon = new ImageIcon("C:\\Users\\Sabbir\\eclipse-workspace\\Java Swing\\src\\images\\conact.jpg");
		Image ima =contactIcon.getImage();
		Image scaleIma = ima.getScaledInstance(50,50, Image.SCALE_SMOOTH);
		contactIcon = new ImageIcon(scaleIma);
		
		f = new Font("Arial",Font.BOLD,16);
		
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.BLUE);
		

		tp = new JTabbedPane(JTabbedPane.LEFT);
		tp.setBounds(50,30,350,350);
		tp.setFont(f);
		c.add(tp);
		
		pHome = new JPanel();
		pHome.setBackground(Color.cyan);
		
		pHelp = new JPanel();
		pHelp.setBackground(Color.red);
		
		pContact = new JPanel();
		pContact.setBackground(Color.green);
		
		
		tp.addTab("Home", homeIcon, pHome,"You are in Home!");
		tp.addTab("Help", helpIcon, pHelp);
		tp.addTab("Contact", contactIcon, pContact);
		
		userLabel = new JLabel();
		userLabel.setText("Choose Your Color");
		userLabel.setBounds(70,50,250,40);
		userLabel.setFont(f);
		userLabel.setForeground(Color.BLUE);
		userLabel.setOpaque(true);
		userLabel.setBackground(Color.cyan);
		userLabel.setToolTipText("Type your age here");
		pHome.add(userLabel);

		btn = new JButton("Change Background");
		btn.setBounds(70,120,200,50);
		btn.setFont(f);
		btn.setBackground(Color.BLACK);
		btn.setForeground(Color.GREEN);
		pHome.add(btn);
		btn.addActionListener(this);
		
		SpinnerNumberModel value = new SpinnerNumberModel(18,12,70,1);
		age = new JSpinner(value);
		age.setBounds(30,60,50,30);
		age.setFont(f);
		pHelp.add(age);
		
		
		age.addChangeListener(this);
		
		ageLabel = new JLabel();
		
		ageLabel.setBounds(30,100,200,40);
		ageLabel.setFont(f);
		ageLabel.setForeground(Color.RED);
		ageLabel.setOpaque(true);
		ageLabel.setBackground(Color.cyan);
		
		pContact.add(ageLabel);
		
		
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		
		String num  = age.getValue().toString();
		int val = Integer.parseInt(num);
		ageLabel.setText("Your age is "+val);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		Color color = JColorChooser.showDialog(null,"Select a Color", Color.blue);
		pHome.setBackground(color);
		pHelp.setBackground(color);
		pContact.setBackground(color);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TabbedPaneDemo frame = new TabbedPaneDemo();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(150,100,550,500);
		frame.setTitle("Tabbed Pane Demo");
		
	}
	
	
	

}
