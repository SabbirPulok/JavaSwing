import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CheckBox extends JFrame {

	private Container c;
	private JRadioButton male,female, no_gender;
	private JCheckBox dhk, ctg, raj;
	private JLabel region;
	private ButtonGroup grp,regGrp;
	private JTextArea jt;
	private Font font;
	private JScrollPane scroll;
	
	CheckBox()
	{
		initDemo();
	}
	public void initDemo()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(10,40,700,500);
		
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.ORANGE);
		
		font = new Font("Arial", Font.ITALIC+Font.BOLD, 18);
		
		region = new JLabel("What's your region?");
		region.setBounds(10,30,200,40);
		region.setForeground(Color.RED);
		region.setFont(font);
		c.add(region);
		
		dhk = new JCheckBox("Dhaka");
		dhk.setBounds(210,30,80,40);
		dhk.setBackground(Color.ORANGE);
		dhk.setFont(font);
		dhk.setSelected(true);
		c.add(dhk);
		
		ctg = new JCheckBox("Chittagong");
		ctg.setBounds(320,30,160,40);
		ctg.setBackground(Color.ORANGE);
		ctg.setFont(font);
		c.add(ctg);
		
		raj = new JCheckBox("Rajshahi");
		raj.setBounds(470,30,160,40);
		raj.setBackground(Color.ORANGE);
		raj.setFont(font);
		c.add(raj);
		
		regGrp = new ButtonGroup();
		regGrp.add(dhk);
		regGrp.add(ctg);
		regGrp.add(raj);
		
		male = new JRadioButton("Male");
		male.setBackground(Color.ORANGE);
		male.setBounds(30,100,100,40);
		male.setFont(font);
		male.setSelected(true);
		c.add(male);
		
		female = new JRadioButton("Female");
		female.setBackground(Color.ORANGE);
		female.setBounds(150,100,100,40);
		female.setFont(font);
		c.add(female);
		
		no_gender = new JRadioButton("No Gender");
		no_gender.setBackground(Color.ORANGE);
		no_gender.setBounds(250,100,100,40);
		no_gender.setEnabled(false);
		c.add(no_gender);
		
		grp = new ButtonGroup();
		grp.add(male);
		grp.add(female);
		grp.add(no_gender);
		
		c.add(female);
		
		
		jt = new JTextArea();
		
		jt.setLineWrap(true);
		jt.setWrapStyleWord(true);
		jt.setFont(font);
		//jt.setBounds(30,100,250,250);
		
		scroll =new JScrollPane(jt, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setBounds(30,150,450,250);
		c.add(scroll);
		
		Handle handler = new Handle();
		dhk.addActionListener(handler);
		ctg.addActionListener(handler);
		raj.addActionListener(handler);
		male.addActionListener(handler);
		female.addActionListener(handler);
		
		
	}
	
	class Handle implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==dhk)
			{
				jt.append("Your Region is Dhaka.\n");
			}
			else if(ctg.isSelected())
			{
				jt.append("Your Region is Chittagong.\n");
			}
			else if(e.getSource()==raj)
			{
				jt.append("Your Region is Rajshahi.\n");
			}
			else if(male.isSelected())
			{
				jt.append("You have selected Male.\n");
			}
			else
			{
				jt.append("You have selected Female.\n");
			} 
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBox frame = new CheckBox();
		frame.setVisible(true);
		frame.setTitle("CheckBox");

	}

}
