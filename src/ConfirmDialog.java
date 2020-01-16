import javax.swing.JOptionPane;
public class ConfirmDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = JOptionPane.showConfirmDialog(null, "Do you want to quit?", "Exit", JOptionPane.YES_NO_OPTION);  
		
		if(choice == JOptionPane.YES_OPTION)
		{
			System.exit(0);
		}
		else
		{
			System.out.println("No is selected.");
		}
	}

}
