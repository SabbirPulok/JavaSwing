import javax.swing.JOptionPane;

public class InputDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String f_name = JOptionPane.showInputDialog(null,"Enter Your First Name: ","First Name",JOptionPane.QUESTION_MESSAGE);
		String l_name = JOptionPane.showInputDialog(null,"Enter Your Last Name: ","Last Name",JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Welcome! "+f_name+" "+l_name);
	}
	

}
