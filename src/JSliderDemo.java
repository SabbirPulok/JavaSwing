import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderDemo extends JFrame implements ChangeListener{

	private Container c;
	private JLabel redL,blueL,greenL,previewL;
	private JSlider redS,blueS,greenS;
	private JTextField redT,blueT,greenT;
	private JPanel panel;
	
	JSliderDemo()
	{
		initComponents();
	}
	public void initComponents()
	{
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.cyan);
		
		redL = new JLabel("Red");
		redL.setBounds(10,30,50,30);
		c.add(redL);
		
		redS = new JSlider(0,255,0);
		redS.setBounds(70,30,270,50);
		redS.setMinorTickSpacing(1);
		redS.setMajorTickSpacing(48);
		redS.setPaintTicks(true);
		redS.setPaintLabels(true);
		c.add(redS);
		
		redT = new JTextField();
		redT.setBounds(350,30,80,50);
		redT.setHorizontalAlignment(JTextField.CENTER);
		c.add(redT);
		
		blueL = new JLabel("Blue");
		blueL.setBounds(10,120,50,30);
		c.add(blueL);
		
		blueS = new JSlider(0,255,0);
		blueS.setBounds(70,120,270,50);
		blueS.setMinorTickSpacing(1);
		blueS.setMajorTickSpacing(48);
		blueS.setPaintTicks(true);
		//blueS.setPaintLevels(true);
		c.add(blueS);
		
		blueT = new JTextField();
		blueT.setBounds(350,120,80,50);
		blueT.setHorizontalAlignment(JTextField.CENTER);
		c.add(blueT);
		
		greenL = new JLabel("Green");
		greenL.setBounds(10,200,50,30);
		c.add(greenL);
		
		greenS = new JSlider(0,255,0);
		greenS.setBounds(70,200,270,50);
		greenS.setMinorTickSpacing(1);
		greenS.setMajorTickSpacing(48);
		greenS.setPaintTicks(true);
		//greenS.setPaintLevels(true);
		c.add(greenS);
		
		greenT = new JTextField();
		greenT.setBounds(350,200,80,50);
		greenT.setHorizontalAlignment(JTextField.CENTER);
		c.add(greenT);
		
		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(480, 30, 200, 200);
		c.add(panel);
		
		previewL = new JLabel("Preview");
		previewL.setBounds(550,220,100,50);
		c.add(previewL);
		
		redS.addChangeListener(this);
		blueS.addChangeListener(this);
		greenS.addChangeListener(this);
		
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		
		int redValue = redS.getValue();
		int blueValue = blueS.getValue();
		int greenValue = greenS.getValue();
		
		redT.setText(""+redValue);
		blueT.setText(""+blueValue);
		greenT.setText(""+greenValue);
		
		Color color = new Color(redValue, greenValue, blueValue);
		panel.setBackground(color);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JSliderDemo frame = new JSliderDemo();
		frame.setVisible(true);
		frame.setBounds(100,70,750,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Slider Demo");
	}
	

}
