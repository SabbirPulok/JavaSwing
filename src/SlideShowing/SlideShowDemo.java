package SlideShowing;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlideShowDemo extends JFrame implements ActionListener{

	private Container c;
	private JPanel panel;
	private JButton prevBtn,nextBtn;
	private ImageIcon icon;
	private JLabel label;
	private CardLayout cdL;
	
	SlideShowDemo()
	{
		initComponents();
		showImages();
		
	}
	
	public void showImages()
	{
		String[] imageNames = {"1.png","2.png","3.png"};
		for(String n:imageNames)
		{
			icon = new ImageIcon("C:\\Users\\Sabbir\\eclipse-workspace\\Java Swing\\src\\SlideShowing\\"+n);
			
			Image image =icon.getImage();
			Image scaleImage = image.getScaledInstance(panel.getWidth(),panel.getHeight(), Image.SCALE_SMOOTH);
			icon = new ImageIcon(scaleImage);
			
			label = new JLabel(icon);
			panel.add(label);
		}
		
	}
	public void initComponents()
	{
		c = this.getContentPane();
		
		cdL = new CardLayout();
		c.setLayout(null);
		
		c.setBackground(Color.cyan);
		
		panel = new JPanel(cdL);
		panel.setBounds(20,30,450,380);
		c.add(panel);
		
		prevBtn = new JButton("Previous");
		prevBtn.setBounds(20,420,100,40);
		c.add(prevBtn);
		
		nextBtn = new JButton("Next");
		nextBtn.setBounds(360,420,100,40);
		c.add(nextBtn);
		
		prevBtn.addActionListener(this);
		nextBtn.addActionListener(this);
			
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==prevBtn)
		{
			cdL.previous(panel);
		}
		if(e.getSource()==nextBtn)
		{
			cdL.next(panel);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SlideShowDemo frame = new SlideShowDemo();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Slide Show Demo");
		frame.setBounds(100,150,500,550);
		

	}


	

}
