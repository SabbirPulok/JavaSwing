import javax.swing.ImageIcon;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Container;

public class FrameDemo extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private ImageIcon icon;
	private Container c;
	
	FrameDemo()
	{
		initIcon();
	}
	public void initIcon()
	{
		c = this.getContentPane();
		c.setBackground(Color.cyan);
		
		icon = new ImageIcon("C:\\Users\\Sabbir\\eclipse-workspace\\Java Swing\\src\\images\\jigsaw.png");
		this.setIconImage(icon.getImage());
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameDemo frame = new FrameDemo();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(400,300);
		//frame.setLocationRelativeTo(null);
		//frame.setLocation(300,300);
		
		frame.setBounds(300,300,400,300);
		frame.setTitle("Pulok");
		frame.setResizable(false);
	}

}
