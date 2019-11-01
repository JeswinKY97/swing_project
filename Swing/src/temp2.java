

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class temp2 {

private JFrame frame;
private JTextField textField;
double n1;
double n2;
double n3;


/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
temp2 window = new temp2();
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
public temp2() {
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

JRadioButton r1 = new JRadioButton("Celsius");
r1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
	}
});

r1.setBounds(0, 136, 109, 23);
frame.getContentPane().add(r1);



JRadioButton r2 = new JRadioButton("Farhenheit");
r2.setBounds(0, 162, 109, 23);
frame.getContentPane().add(r2);

JRadioButton r3 = new JRadioButton("Kelvin");
r3.setBounds(0, 188, 109, 23);
frame.getContentPane().add(r3);

JRadioButton rdbtnCelsius = new JRadioButton("Celsius");
rdbtnCelsius.setBounds(317, 136, 109, 23);
frame.getContentPane().add(rdbtnCelsius);

JRadioButton rdbtnFarhenheit_1 = new JRadioButton("Farhenheit");
rdbtnFarhenheit_1.setBounds(317, 162, 109, 23);
frame.getContentPane().add(rdbtnFarhenheit_1);

JRadioButton rdbtnKelvin = new JRadioButton("Kelvin");
rdbtnKelvin.setBounds(317, 188, 109, 23);
frame.getContentPane().add(rdbtnKelvin);


JLabel lblNewLabel = new JLabel("Input");
lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
lblNewLabel.setForeground(new Color(0, 0, 0));
lblNewLabel.setBounds(80, 11, 88, 23);
frame.getContentPane().add(lblNewLabel);

JLabel lblInputScale = new JLabel("Input Scale");
lblInputScale.setFont(new Font("Tahoma", Font.PLAIN, 14));
lblInputScale.setBounds(10, 90, 122, 23);
frame.getContentPane().add(lblInputScale);

JLabel lblOutput = new JLabel("Output");
lblOutput.setFont(new Font("Tahoma", Font.PLAIN, 14));
lblOutput.setBounds(80, 218, 88, 27);
frame.getContentPane().add(lblOutput);

JLabel lblOutputScale = new JLabel("OutpuScale");
lblOutputScale.setFont(new Font("Tahoma", Font.PLAIN, 14));
lblOutputScale.setBounds(302, 90, 122, 23);
frame.getContentPane().add(lblOutputScale);

textField = new JTextField();
textField.setBounds(159, 14, 154, 20);
frame.getContentPane().add(textField);
textField.setColumns(10);

JLabel lblNewLabel_1 = new JLabel("");
lblNewLabel_1.setBounds(159, 218, 154, 22);
frame.getContentPane().add(lblNewLabel_1);
}
}
