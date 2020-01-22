import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextAreaDemo extends JFrame{

		private Container c;
		private JTextArea jt;
		private Font font;
		private JScrollPane scroll;
		TextAreaDemo()
		{
			initDemo();
		}
		
		public void initDemo() 
		{
			c = this.getContentPane();
			c.setLayout(null);
			c.setBackground(Color.cyan);
			
			font = new Font("Arial", Font.ITALIC+Font.BOLD, 16);
			
			jt = new JTextArea();
			
			jt.setLineWrap(true);
			jt.setWrapStyleWord(true);
			jt.setFont(font);
			
			
			scroll = new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			scroll.setBounds(20,40,300,200);
			c.add(scroll);
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextAreaDemo frame = new TextAreaDemo();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setBounds(150,100,500,500);
		frame.setResizable(false);
	}

}
