import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;

public class prob2 {

	private JFrame frame;
	private JTextField tsid;
	private JTextField tfn;
	private JTextField tsn;
	private JTextField tmat;
	private JTextField teng;
	private JTextField tbio;
	private JTextField tcom;
	private JTextField tchem;
	private JTextField tphy;
	private JTextField tts;
	private JTextField ta;
	private JTextField tr;
	private JTextField ttam;
	private JTextField tmal;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prob2 window = new prob2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public prob2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setBounds(0, -38, 1085, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Student Details", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 11, 434, 332);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		tsid = new JTextField();
		tsid.setBounds(114, 30, 86, 20);
		panel.add(tsid);
		tsid.setColumns(10);
		
		tfn = new JTextField();
		tfn.setColumns(10);
		tfn.setBounds(114, 61, 86, 20);
		panel.add(tfn);
		
		tsn = new JTextField();
		tsn.setColumns(10);
		tsn.setBounds(114, 92, 86, 20);
		panel.add(tsn);
		
		JComboBox cbox = new JComboBox();
		cbox.setModel(new DefaultComboBoxModel(new String[] {"11032EE", "11035EE", "11033EE"}));
		cbox.setBounds(114, 123, 86, 20);
		panel.add(cbox);
		
		JLabel lblStudentid = new JLabel("Student_ID");
		lblStudentid.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblStudentid.setBounds(10, 30, 77, 14);
		panel.add(lblStudentid);
		
		JLabel lblNewLabel = new JLabel("Firstname");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 61, 77, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Surname");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 92, 77, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblCourseCode = new JLabel("Course Code");
		lblCourseCode.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblCourseCode.setBounds(10, 123, 94, 14);
		panel.add(lblCourseCode);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(187, 148, -182, 31);
		panel.add(separator);
		
		JLabel lblStudentid_2 = new JLabel("Maths");
		lblStudentid_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblStudentid_2.setBounds(223, 30, 77, 14);
		panel.add(lblStudentid_2);
		
		tmat = new JTextField();
		tmat.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 char num=evt.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    evt.consume();
				 
			}}
		});
		tmat.setColumns(10);
		tmat.setBounds(310, 27, 86, 20);
		panel.add(tmat);
		
		teng = new JTextField();
		teng.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }}
		});
		teng.setColumns(10);
		teng.setBounds(310, 58, 86, 20);
		panel.add(teng);
		
		JLabel lblFirstname = new JLabel("English");
		lblFirstname.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblFirstname.setBounds(223, 61, 77, 14);
		panel.add(lblFirstname);
		
		JLabel lblSurname = new JLabel("Biology");
		lblSurname.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblSurname.setBounds(223, 92, 77, 14);
		panel.add(lblSurname);
		
		tbio = new JTextField();
		tbio.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
			}}
		});
		tbio.setColumns(10);
		tbio.setBounds(310, 89, 86, 20);
		panel.add(tbio);
		
		JLabel lblComputer = new JLabel("Computer");
		lblComputer.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblComputer.setBounds(223, 123, 77, 14);
		panel.add(lblComputer);
		
		tcom = new JTextField();
		tcom.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
			}}
		});
		tcom.setColumns(10);
		tcom.setBounds(310, 120, 86, 20);
		panel.add(tcom);
		
		tchem = new JTextField();
		tchem.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
			}}
		});
		tchem.setColumns(10);
		tchem.setBounds(310, 151, 86, 20);
		panel.add(tchem);
		
		JLabel lblChemistry = new JLabel("Chemistry");
		lblChemistry.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblChemistry.setBounds(223, 154, 77, 14);
		panel.add(lblChemistry);
		
		JLabel lblPhysics = new JLabel("Physics");
		lblPhysics.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPhysics.setBounds(223, 185, 77, 14);
		panel.add(lblPhysics);
		
		tphy = new JTextField();
		tphy.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
			}}
		});
		tphy.setColumns(10);
		tphy.setBounds(310, 182, 86, 20);
		panel.add(tphy);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(10, 164, 160, 7);
		panel.add(separator_1);
		
		tts = new JTextField();
		tts.setColumns(10);
		tts.setBounds(114, 185, 86, 20);
		panel.add(tts);
		
		JLabel label = new JLabel("Total Score");
		label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label.setBounds(10, 188, 86, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Average");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_1.setBounds(10, 219, 77, 14);
		panel.add(label_1);
		
		ta = new JTextField();
		ta.setColumns(10);
		ta.setBounds(114, 216, 86, 20);
		panel.add(ta);
		
		tr = new JTextField();
		tr.setColumns(10);
		tr.setBounds(114, 247, 86, 20);
		panel.add(tr);
		
		JLabel label_2 = new JLabel("Ranking");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_2.setBounds(10, 250, 77, 14);
		panel.add(label_2);
		
		ttam = new JTextField();
		ttam.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
			}}
		});
		ttam.setColumns(10);
		ttam.setBounds(310, 215, 86, 20);
		panel.add(ttam);
		
		tmal = new JTextField();
		tmal.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
			}}
		});
		tmal.setColumns(10);
		tmal.setBounds(310, 246, 86, 20);
		panel.add(tmal);
		
		JLabel lblMalayalam = new JLabel("Malayalam");
		lblMalayalam.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblMalayalam.setBounds(223, 249, 77, 14);
		panel.add(lblMalayalam);
		
		JLabel lblTamil = new JLabel("Tamil");
		lblTamil.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTamil.setBounds(223, 218, 77, 14);
		panel.add(lblTamil);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBorder(new TitledBorder(null, "Student Report", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
		panel_1.setBounds(467, 11, 585, 368);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 21, 565, 293);
		panel_1.add(textArea);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
		btnClear.setBounds(249, 325, 89, 23);
		panel_1.add(btnClear);
		
		JButton btnNewButton = new JButton("Add Report");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String studid=tsid.getText();
				String fn=tfn.getText();
				String sn=tsn.getText();
				int mat=Integer.parseInt(tmat.getText());
				int eng=Integer.parseInt(teng.getText());
				int bio=Integer.parseInt(tbio.getText());
				int com=Integer.parseInt(tcom.getText());
				int chem=Integer.parseInt(tchem.getText());
				int phy=Integer.parseInt(tphy.getText());
				int tam=Integer.parseInt(ttam.getText());
				int mal=Integer.parseInt(tmal.getText());
				int ts=mat+eng+bio+com+chem+phy+tam+mal;
				tts.setText(String.valueOf(ts));
				int avg=(mat+eng+bio+com+chem+phy+tam+mal)/8;
			ta.setText(String.valueOf(avg));
				
				if(ts<200)
				{
					tr.setText("Fail");
				}
				if(ts>=200 && ts<400)
				{
					tr.setText("3");
				}
				if(ts>=400 && ts<700)
				{
					tr.setText("2");
				}
				if(ts>=700 && ts<800)
				{
					tr.setText("1");
				}
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new String[] {
						tsid.getText(),
						(String)cbox.getSelectedItem(),
						tmat.getText(),
						teng.getText(),
						tbio.getText(),
						tcom.getText(),
						tchem.getText(),
						tphy.getText(),
						ttam.getText(),
						tmal.getText(),
						tts.getText(),
						ta.getText(),
						tr.getText(),
						
						
				});
				
				}
			
		});
		btnNewButton.setBounds(195, 516, 107, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row=table.getSelectedRow();
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				model.removeRow(row);
			}
		});
		btnDelete.setForeground(Color.RED);
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnDelete.setBounds(312, 516, 89, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnShowReport = new JButton("Show Report");
		btnShowReport.setForeground(Color.BLUE);
		btnShowReport.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnShowReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("Student Record\n"
						+"Student Name:\t\t"+tfn.getText()+" "+tsn.getText()+"\n"
						+"=====================================\n"
						+"Maths:\t\t"+tmat.getText()+"\n"
						+"English:\t\t"+teng.getText()+"\n"
						+"Biology:\t\t"+tbio.getText()+"\n"
						+"Computer\t\t"+tcom.getText()+"\n"
						+"Chemistry:\t\t"+tchem.getText()+"\n"
						+"Physics:\t\t"+tphy.getText()+"\n"
						+"Tamil:\t\t"+ttam.getText()+"\n"
						+"Malayalam:\t\t"+tmal.getText()+"\n"

						+"=====================================\n"

						+"Total Score:\t\t"+tts.getText()+"\n"
						+"Average:\t\t"+ta.getText()+"\n"
						+"Ranking:\t\t"+tr.getText()+"\n"

						);
			}
		});
		btnShowReport.setBounds(411, 516, 119, 23);
		frame.getContentPane().add(btnShowReport);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(Color.MAGENTA);
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame=new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION) {
				System.exit(0);
			}}
		});
		btnExit.setBounds(540, 516, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setForeground(new Color(204, 0, 102));
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tsid.setText("");
				tfn.setText("");
				tsn.setText("");
				tts.setText("");
				ta.setText("");
				tr.setText("");
				tmat.setText("");
				teng.setText("");
				tbio.setText("");
				tcom.setText("");
				tchem.setText("");
				tphy.setText("");
				ttam.setText("");
				tmal.setText("");
			}
		});
		btnReset.setBounds(639, 516, 89, 23);
		frame.getContentPane().add(btnReset);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				
				{"Student_ID", "Couse_Name", "Maths", "English", "Biology", "Computer", "Chemistry", "Physics", "Tamil", "Malayalam", "Total Score", "Average", "Ranking"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(36, 417, 712, 63);
		frame.getContentPane().add(table);
	}
}
