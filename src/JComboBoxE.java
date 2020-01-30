import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JComboBoxE extends JFrame{

	JComboBoxE()
	{
		initDemo();
	}
	
	private Container c;
	private JComboBox cb;
	private JLabel jb;
	private JButton btn;
	
	String[] lang = {"c","c++","php","Java","Prolog","R"};
	
	public void initDemo()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Combo Box");
		this.setBounds(100,100,500,500);
		
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.cyan);
		
		cb = new JComboBox(lang);
		cb.setEditable(true);
		cb.setBounds(50,50,100,20);
		cb.setSelectedIndex(3);
		//cb.setSelectedItem("Java");
		cb.addItem("JS");
		cb.addItem("GO");
		cb.removeItem("R");
		//cb.removeItemAt(3);
		//cb.removeAllItems();
		c.add(cb);
		
		btn = new JButton("Submit");
		btn.setBounds(160,50,100,20);
		c.add(btn);
		
		jb = new JLabel();
		jb.setBounds(50,80,200,20);
		c.add(jb);
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s = cb.getSelectedItem().toString(); 
				jb.setText("You have selected "+s);
			}
			
		});
		
		System.out.println("Total Items: "+cb.getItemCount());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JComboBoxE frame = new JComboBoxE();
		frame.setVisible(true);
		

	}

}
