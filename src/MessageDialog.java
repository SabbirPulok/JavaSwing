import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.*;

public class MessageDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageIcon img = new ImageIcon(new ImageIcon("C:\\Users\\Sabbir\\eclipse-workspace\\Java Swing\\src\\metro.png").getImage().getScaledInstance(200, 100, Image.SCALE_DEFAULT));
		JOptionPane.showMessageDialog(null, "Msg", "Title", JOptionPane.QUESTION_MESSAGE, img);
		
		//Icon IDE Value
		//JOptionPane.PLAIN_MESSAGE -1
		//JOptionPane.ERROR_MESSAGE 0
		//JOptionPane.INFORMATION_MESSAGE 1
		//JOptionPane.WARNING_MESSAGE 2
		//JOptionPane.QUESTION_MESSAGE 3

	}

}
