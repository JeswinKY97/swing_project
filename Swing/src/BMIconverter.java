import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSplitPane;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;

public class BMIconverter {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	double n1;
	double n2;
	double r1;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMIconverter window = new BMIconverter();
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
	public BMIconverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, -18, 471, 651);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setBounds(195, 197, 144, 35);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(195, 254, 144, 35);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Height(m)");
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 19));
		lblNewLabel_1.setBounds(28, 200, 117, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Weight(kg)");
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 19));
		lblNewLabel_2.setBounds(28, 254, 130, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("BMI");
		lblNewLabel_3.setFont(new Font("Tempus Sans ITC", Font.BOLD, 22));
		lblNewLabel_3.setBounds(28, 316, 95, 30);
		frame.getContentPane().add(lblNewLabel_3);
		
		t3 = new JTextField();
		t3.setBounds(133, 316, 102, 35);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		
		JLabel l1 = new JLabel("");
		l1.setForeground(Color.RED);
		l1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		l1.setBounds(265, 316, 166, 35);
		frame.getContentPane().add(l1);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a1;
				n1=Double.parseDouble(t1.getText());
				n2=Double.parseDouble(t2.getText());
				r1=n2/(n1*n1);
				a1=String.format("%.2f",r1);
				t3.setText(a1);
				if(r1<18.5)
				{
					l1.setText("Underweight");
				}
				if(r1>18.5 && r1<24.9)
				{
					l1.setText("Normal Weight");
				}
				if(r1>25 && r1<29.9)
				{
					l1.setText("Owerweight");
				}
				if(r1>30)
				{
					l1.setText("Obese");
				}
				
			}
		});
		btnNewButton.setBounds(25, 372, 117, 35);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 17));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText(null);
				t2.setText(null);
				t3.setText(null);
				l1.setText(null);
			}
		});
		btnNewButton_1.setBounds(195, 372, 89, 35);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 17));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(327, 374, 89, 35);
		frame.getContentPane().add(btnNewButton_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setBounds(0, 0, 455, 137);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblBo = new JLabel("Body Mass Index");
		lblBo.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblBo.setBounds(140, 59, 210, 36);
		panel.add(lblBo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GREEN);
		panel_1.setBounds(0, 436, 455, 177);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GREEN);
		panel_2.setBounds(0, 148, 455, 276);
		frame.getContentPane().add(panel_2);
	}
}
