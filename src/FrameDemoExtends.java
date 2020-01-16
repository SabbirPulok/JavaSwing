import javax.swing.JFrame;

public class FrameDemoExtends extends JFrame{
	
	FrameDemoExtends()
	{
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(400,300);
		//frame.setLocationRelativeTo(null);
		//frame.setLocation(300,300);
		
		setBounds(300,300,400,300);
		setTitle("Pulok");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameDemoExtends frame = new FrameDemoExtends();
		frame.setResizable(false);

	}

}
