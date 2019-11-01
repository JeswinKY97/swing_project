import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class tempconv {

	private JFrame frame;
	private JTextField t1;
	double n1;
	double r1;
	double r2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tempconv window = new tempconv();
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
	public tempconv() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Degrees");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(53, 37, 79, 20);
		frame.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBounds(168, 34, 112, 23);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel l1 = new JLabel("");
		l1.setFont(new Font("Tahoma", Font.BOLD, 12));
		l1.setBounds(142, 98, 169, 40);
		frame.getContentPane().add(l1);
		
		JButton btnNewButton = new JButton("To Celsius");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a1;
			
				n1=Double.parseDouble(t1.getText());
				r1=n1-273;
				a1=String.format("%.2f",r1);
				l1.setText("Result = "+a1);
				
			}
		});
		btnNewButton.setBounds(58, 178, 112, 32);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("To Fahrenheit");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a2;
				n1=Double.parseDouble(t1.getText());
				r2= (5/9*(n1-32)+273);
				a2=String.format("%.2f",r2);
				l1.setText("Result = "+a2);
			}
		});
		btnNewButton_1.setBounds(235, 178, 117, 32);
		frame.getContentPane().add(btnNewButton_1);
	}

}
