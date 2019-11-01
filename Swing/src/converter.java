import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class converter {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	double n1;
	double n2;
	double r1;
	double r2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					converter window = new converter();
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
	public converter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 494, 405);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLabel = new JLabel("Help");
		lblLabel.setForeground(Color.WHITE);
		lblLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblLabel.setBounds(10, 11, 59, 20);
		frame.getContentPane().add(lblLabel);
		
		JLabel lblAbout = new JLabel("About");
		lblAbout.setForeground(Color.WHITE);
		lblAbout.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblAbout.setBounds(89, 11, 59, 20);
		frame.getContentPane().add(lblAbout);
		
		JLabel lblNewLabel = new JLabel("Height");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel.setBounds(48, 105, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Weight");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(48, 186, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBounds(153, 102, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(153, 183, 86, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JLabel l1 = new JLabel("");
		l1.setForeground(Color.WHITE);
		l1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		l1.setBounds(305, 105, 73, 20);
		frame.getContentPane().add(l1);
		
		JLabel l2 = new JLabel("");
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		l2.setBounds(305, 186, 73, 20);
		frame.getContentPane().add(l2);
		
		JLabel lblNewLabel_4 = new JLabel("US Measurments");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(137, 71, 121, 20);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Metric");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(305, 77, 73, 17);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a1;
				String a2;
				n1=Double.parseDouble(t1.getText());
				n2=Double.parseDouble(t2.getText());
				r1=n1/3.28;
				r2=n2/2.205;
				a1=String.format("%.2f",r1);
				a2=String.format("%.2f",r2);
				l1.setText(a1+"m");
				l2.setText(a2+"kg");
			}
		});
		btnNewButton.setBounds(48, 272, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(289, 272, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText(null);
				t2.setText(null);
				l1.setText(null);
				l2.setText(null);
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnClear.setBounds(166, 272, 89, 23);
		frame.getContentPane().add(btnClear);
	}

}
