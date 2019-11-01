import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class calculator {

	private JFrame frame;
	private JTextField t1;
	double num1;
	double num2;
	double result;
	String op;
	String ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setForeground(Color.GRAY);
		frame.setBounds(-26, -38, 721, 402);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setBounds(66, 11, 490, 95);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=t1.getText()+b1.getText();
				t1.setText(Number);
			}
		});
		b1.setFont(new Font("Castellar", Font.BOLD, 22));
		b1.setBounds(68, 117, 65, 40);
		frame.getContentPane().add(b1);
		
		JButton b4= new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=t1.getText()+b4.getText();
				t1.setText(Number);
			}
		});
		b4.setFont(new Font("Castellar", Font.BOLD, 22));
		b4.setBounds(68, 172, 65, 40);
		frame.getContentPane().add(b4);
		
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=t1.getText()+b7.getText();
				t1.setText(Number);
				
			}
		});
		b7.setFont(new Font("Castellar", Font.BOLD, 22));
		b7.setBounds(68, 223, 65, 40);
		frame.getContentPane().add(b7);
		
		JButton bdot= new JButton(".");
		bdot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=t1.getText()+bdot.getText();
				t1.setText(Number);
			}
		});
		bdot.setFont(new Font("Castellar", Font.BOLD, 22));
		bdot.setBounds(68, 274, 65, 40);
		frame.getContentPane().add(bdot);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=t1.getText()+b2.getText();
				t1.setText(Number);
			}
		});
		b2.setFont(new Font("Castellar", Font.BOLD, 22));
		b2.setBounds(143, 117, 65, 40);
		frame.getContentPane().add(b2);
		
		JButton b5= new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=t1.getText()+b5.getText();
				t1.setText(Number);
			}
		});
		b5.setFont(new Font("Castellar", Font.BOLD, 22));
		b5.setBounds(143, 170, 65, 42);
		frame.getContentPane().add(b5);
		
		JButton b8= new JButton("8");
		b8.setFont(new Font("Castellar", Font.BOLD, 22));
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=t1.getText()+b8.getText();
				t1.setText(Number);
			}
		});
		b8.setBounds(143, 223, 65, 40);
		frame.getContentPane().add(b8);
		
		JButton b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=t1.getText()+b0.getText();
				t1.setText(Number);
			}
		});
		b0.setFont(new Font("Castellar", Font.BOLD, 22));
		b0.setBounds(143, 274, 65, 40);
		frame.getContentPane().add(b0);
		
		JButton b3 = new JButton("3");
		b3.setFont(new Font("Castellar", Font.BOLD, 22));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=t1.getText()+b3.getText();
				t1.setText(Number);
			}
		});
		b3.setBounds(218, 117, 70, 40);
		frame.getContentPane().add(b3);
		
		JButton b6= new JButton("6");
		b6.setFont(new Font("Castellar", Font.BOLD, 22));
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=t1.getText()+b6.getText();
				t1.setText(Number);
			}
		});
		b6.setBounds(218, 172, 70, 40);
		frame.getContentPane().add(b6);
		
		JButton b9= new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=t1.getText()+b9.getText();
				t1.setText(Number);
			}
		});
		b9.setFont(new Font("Castellar", Font.BOLD, 22));
		b9.setBounds(218, 223, 70, 40);
		frame.getContentPane().add(b9);
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Castellar", Font.BOLD, 22));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText(null);
			}
		});
		btnC.setBounds(218, 274, 70, 40);
		frame.getContentPane().add(btnC);
		
		JButton button_11 = new JButton("+");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1=Double.parseDouble(t1.getText());
				t1.setText(" ");
				op="+";
			
			}
		});
		button_11.setFont(new Font("Castellar", Font.BOLD, 22));
		button_11.setBounds(358, 117, 76, 49);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("-");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(t1.getText());
				t1.setText(" ");
				op="-";
			}
		});
		button_12.setFont(new Font("Castellar", Font.BOLD, 22));
		button_12.setBounds(472, 117, 76, 49);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("*");
		button_13.setFont(new Font("Castellar", Font.BOLD, 22));
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(t1.getText());
				t1.setText(" ");
				op="*";
			}
		});
		button_13.setBounds(358, 193, 76, 49);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("/");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(t1.getText());
				t1.setText(" ");
				op="/";
			}
		});
		button_14.setFont(new Font("Castellar", Font.BOLD, 22));
		button_14.setBounds(472, 193, 76, 49);
		frame.getContentPane().add(button_14);
		
		JButton btnNewButton_1 = new JButton("=");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				num2=Double.parseDouble(t1.getText());
				if(op=="+")
				{
					result=num1+num2;
					ans=String.format("%.2f",result);
					t1.setText(ans);
				}
				if(op=="-")
				{
					result=num1-num2;
					ans=String.format("%.2f",result);
					t1.setText(ans);
				}
				if(op=="*")
				{
					result=num1*num2;
					ans=String.format("%.2f",result);
					t1.setText(ans);
				}
				if(op=="/")
				{
					result=num1/num2;
					ans=String.format("%.2f",result);
					t1.setText(ans);
				}
				if(op=="%")
				{
					result=num1%num2;
					ans=String.format("%.2f",result);
					t1.setText(ans);
				}
			}
		});
		btnNewButton_1.setFont(new Font("Cooper Black", Font.BOLD, 38));
		btnNewButton_1.setBounds(558, 117, 113, 202);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("%");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(t1.getText());
				t1.setText(" ");
				op="%";
			}
		});
		btnNewButton_2.setFont(new Font("Castellar", Font.BOLD, 22));
		btnNewButton_2.setBounds(417, 270, 76, 49);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("B");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder strB=new StringBuilder(t1.getText());
			strB.deleteCharAt(t1.getText().length()-1);
			String b = strB.toString();
			t1.setText(b);
			}
		});
		btnNewButton_3.setFont(new Font("Castellar", Font.BOLD, 22));
		btnNewButton_3.setBounds(564, 11, 82, 95);
		frame.getContentPane().add(btnNewButton_3);
	}

}
