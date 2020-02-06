import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.CardLayout;


import javax.swing.JButton;
import javax.swing.JFrame;

public class CardLayoutDemo extends JFrame implements ActionListener{

	private Container c;

	private JButton[] btn = new JButton[10];
	private CardLayout cLayout;
	
	CardLayoutDemo()
	{
		initDemo();
	}
	public void initDemo()
	{
		c = this.getContentPane();
		cLayout = new CardLayout(50,50);
	
		c.setLayout(cLayout);
		c.setBackground(Color.BLUE);
		
		for(int i=0; i<10; i++)
		{
			btn[i]  = new JButton(""+ (i+1) );
			c.add(btn[i],"btn"+i);
			btn[i].addActionListener(this);
		}
		
		//cLayout.show(c, "btn5");
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		cLayout.next(c);
		//cLayout.show(c, "btn3");
		//cLayout.last(c);
		//cLayout.first(c);
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CardLayoutDemo frame =new CardLayoutDemo();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,150,500,550);
		frame.setTitle("Card Layout Demo");

	}
	
	
}
