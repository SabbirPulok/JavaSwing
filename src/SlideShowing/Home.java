package SlideShowing;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Home extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Container c;
	private JLabel welcome,waferIdL,waferSizeL,thicknessL,productionYearL,weightL;
	private JTextField waferIdtf,waferSizetf,thicknesstf,productionYeartf,weighttf;
	private JButton add,update,delete,clear;
	private JTable table;
	private JScrollPane scroll;
	private DefaultTableModel model;
	
	private Font f,font;
	private ImageIcon icon;
	
	private String[] cols = {"Wafer Id","Wafer Size","Thickness","Production Year","Weight Per Wafer"};
	private String[] rows = new String[5];
	
	Home()
	{
		initDemo();
	}
	
	public void initDemo()
	{
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setBounds(150,80,600,600);
		this.setTitle("Metrosemi Home");
		
		icon = new ImageIcon("C:\\Users\\Sabbir\\eclipse-workspace\\Java Swing\\src\\images\\jigsaw.png");
		this.setIconImage(icon.getImage());
		
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.CYAN);
		
		f = new Font("Arial",Font.ITALIC+Font.BOLD,18);
		font = new Font("Arial",Font.BOLD,16);
		
		welcome = new JLabel("Welcome!  MetroSemi ");
		welcome.setBounds(180,20,200,40);
		welcome.setFont(f);
		welcome.setForeground(Color.blue);
		c.add(welcome);
		
		waferIdL = new JLabel("Wafer Id :");
		waferIdL.setBounds(10,80,100,20);
		waferIdL.setFont(font);
		c.add(waferIdL);
		
		waferIdtf = new JTextField();
		waferIdtf.setBounds(155,80,250,20);
		waferIdtf.setFont(font);
		waferIdtf.setHorizontalAlignment(JTextField.CENTER);
		c.add(waferIdtf);
		
		waferSizeL = new JLabel("Wafer Size :");
		waferSizeL.setBounds(10,110,100,20);
		waferSizeL.setFont(font);
		c.add(waferSizeL);
		
		waferSizetf = new JTextField();
		waferSizetf.setBounds(155,110,250,20);
		waferSizetf.setFont(font);
		waferSizetf.setHorizontalAlignment(JTextField.CENTER);
		c.add(waferSizetf);
		
		add = new JButton("Add");
		add.setFont(font);
		add.setBackground(Color.BLUE);
		add.setForeground(Color.WHITE);
		add.setBounds(450,60,120,30);
		c.add(add);
		
		thicknessL = new JLabel("Thickness :");
		thicknessL.setBounds(10,140,100,20);
		thicknessL.setFont(font);
		c.add(thicknessL);
		
		thicknesstf = new JTextField();
		thicknesstf.setBounds(155,140,250,20);
		thicknesstf.setFont(font);
		thicknesstf.setHorizontalAlignment(JTextField.CENTER);
		c.add(thicknesstf);
		
		update = new JButton("Update");
		update.setFont(font);
		update.setBackground(Color.GREEN);
		update.setForeground(Color.WHITE);
		update.setBounds(450,100,120,30);
		c.add(update);
		
		productionYearL = new JLabel("Production Year :");
		productionYearL.setBounds(10,170,145,20);
		productionYearL.setFont(font);
		c.add(productionYearL);
		
		productionYeartf = new JTextField();
		productionYeartf.setBounds(155,170,250,20);
		productionYeartf.setFont(font);
		productionYeartf.setHorizontalAlignment(JTextField.CENTER);
		c.add(productionYeartf);
		
		clear = new JButton("Clear");
		clear.setFont(font);
		clear.setBackground(Color.LIGHT_GRAY);
		clear.setForeground(Color.WHITE);
		clear.setBounds(450,140,120,30);
		c.add(clear);
		
		weightL = new JLabel("Weight Per Wafer :");
		weightL.setBounds(10,200,145,20);
		weightL.setFont(font);
		c.add(weightL);
		
		weighttf = new JTextField();
		weighttf.setBounds(155,200,250,20);
		weighttf.setFont(font);
		weighttf.setHorizontalAlignment(JTextField.CENTER);
		c.add(weighttf);
		
		delete = new JButton("Delete");
		delete.setFont(font);
		delete.setBackground(Color.RED);
		delete.setForeground(Color.WHITE);
		delete.setBounds(450,180,120,30);
		c.add(delete);
	
		table = new JTable();
		model = new DefaultTableModel();
		model.setColumnIdentifiers(cols);
		table.setModel(model);
		table.setFont(f);
		table.setSelectionBackground(Color.ORANGE);
		table.setBackground(Color.white);
		table.setRowHeight(30);
		
		scroll = new JScrollPane(table);
		scroll.setFont(f);
		scroll.setBounds(10,250,550,270);
		c.add(scroll);
		
		add.addActionListener(this);
		clear.addActionListener(this);
		delete.addActionListener(this);
		update.addActionListener(this);
		
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{
				int rowNo = table.getSelectedRow();
				
				
				String waferId = table.getValueAt(rowNo, 0).toString();
				String waferSize = table.getValueAt(rowNo, 1).toString();
				String thickness = table.getValueAt(rowNo, 2).toString();
				String productionYear = table.getValueAt(rowNo, 3).toString();
				String weight = table.getValueAt(rowNo, 4).toString();
				
				waferIdtf.setText(waferId);
				waferSizetf.setText(waferSize);
				thicknesstf.setText(thickness);
				productionYeartf.setText(productionYear);
				weighttf.setText(weight);
				
				
			}
		});
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==add)
		{
			rows[0]=waferIdtf.getText();
			rows[1]=waferSizetf.getText();
			rows[2]=thicknesstf.getText();
			rows[3]=productionYeartf.getText();
			rows[4]=weighttf.getText();
			
			model.addRow(rows);
		}
		else if(e.getSource()==clear)
		{
			waferIdtf.setText("");
			waferSizetf.setText("");
			thicknesstf.setText("");
			productionYeartf.setText("");
			weighttf.setText("");
		}
		else if(e.getSource()==delete)
		{
			int rowno = table.getSelectedRow();
			if(rowno>=0)
			{
				model.removeRow(rowno);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "You have not selected any row.");
			}
			
		}
		
		else if(e.getSource()==update)
		{
			int rowNo = table.getSelectedRow();
			
			
			String waferId = waferIdtf.getText();
			String waferSize = waferSizetf.getText();
			String thickness = thicknesstf.getText();
			String productionYear = productionYeartf.getText();
			String weight = weighttf.getText();
			
			model.setValueAt(waferId, rowNo, 0 );
			model.setValueAt(waferSize, rowNo, 1);
			model.setValueAt(thickness, rowNo, 2 );
			model.setValueAt(productionYear, rowNo, 3);
			model.setValueAt(weight, rowNo, 4);
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Home frame = new Home();
		frame.setVisible(true);
	}

	

}
