import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VowelCounter extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Container c;
	private JLabel ipLabel,vowelLabel,aLabel,eLabel,iLabel, oLabel, uLabel;
	private JTextArea jt;
	private JScrollPane scroll;
	int totalVowel = 0;
	int letter_a=0;
	int letter_e=0;
	int letter_i=0;
	int letter_o=0;
	int letter_u=0;
	
	
	VowelCounter()
	{
		initDemo();
	}
	
	public void initDemo()
	{
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.cyan);
		
		ipLabel = new JLabel("Enter Your Text Here..");
		ipLabel.setBounds(20,30,130,30);
		c.add(ipLabel);
		
		jt = new JTextArea();
		jt.setLineWrap(true);
		jt.setWrapStyleWord(true);
		
		scroll = new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll.setBounds(160,30,300,150);
		c.add(scroll);
		
		vowelLabel = new JLabel();
		vowelLabel.setBounds(20,180,180,30);
		c.add(vowelLabel);
		
		aLabel = new JLabel();
		aLabel.setBounds(20,220,180,30);
		c.add(aLabel);
		
		eLabel = new JLabel();
		eLabel.setBounds(20,260,180,30);
		c.add(eLabel);
		
		iLabel = new JLabel();
		iLabel.setBounds(20,300,180,30);
		c.add(iLabel);
		
		oLabel = new JLabel();
		oLabel.setBounds(20,340,180,30);
		c.add(oLabel);
		
		uLabel = new JLabel();
		uLabel.setBounds(20,380,180,30);
		c.add(uLabel);
		
		jt.addKeyListener(new KeyListener()
				{

					@Override
					public void keyPressed(KeyEvent e) {
						// TODO Auto-generated method stub
						if(e.getSource()==jt)
						{
							if(e.VK_A==e.getKeyCode())
							{
								totalVowel++;
								letter_a++;
							}
							else if(e.VK_E==e.getKeyCode())
							{
								totalVowel++;
								letter_e++;
							}
							else if(e.VK_I==e.getKeyCode())
							{
								totalVowel++;
								letter_i++;
							}
							else if(e.VK_O==e.getKeyCode())
							{
								totalVowel++;
								letter_o++;
							}
							else if(e.VK_U==e.getKeyCode())
							{
								totalVowel++;
								letter_u++;
							}
							else
							{
								
							}
							
							vowelLabel.setText("Total no of vowel: "+totalVowel);
							aLabel.setText("No of a :"+letter_a);
							eLabel.setText("No of e :"+letter_e);
							iLabel.setText("No of i :"+letter_i);
							oLabel.setText("No of o :"+letter_o);
							uLabel.setText("No of u :"+letter_u);
							
						}
					}

					@Override
					public void keyReleased(KeyEvent arg0) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void keyTyped(KeyEvent arg0) {
						// TODO Auto-generated method stub
						
					}
			
				});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VowelCounter frame = new VowelCounter();
		frame.setVisible(true);
		frame.setBounds(40,50,500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Vowel Counter");

	}

}
