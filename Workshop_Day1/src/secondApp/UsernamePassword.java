package secondApp;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class UsernamePassword implements ActionListener{
	
	// Variable Declaration
	JLabel nameLabel;
	JTextField nameField;
	JLabel passwordLabel;
	JPasswordField passwordField;
	JButton okButton;
	
	JLabel nameDisplayLabel;
	JTextField nameDisplayField;
	JLabel passwordDisplayLabel;
	JTextField passwordDisplayField;
	
	
	public UsernamePassword() {
		initialize();
	}
	
	private void initialize(){
		JFrame frame = new JFrame("Adding Components");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 300);
		frame.setLocation(350, 200);
		frame.setLayout(null);
		
		nameLabel = new JLabel("Enter your name : ");
		nameLabel.setBounds(10, 10, 120, 20);
		frame.getContentPane().add(nameLabel);		
		
		nameField = new JTextField(20);
		nameField.setBounds(140, 10, 120, 20);
		frame.getContentPane().add(nameField);
		
		passwordLabel = new JLabel("Enter your password : ");
		passwordLabel.setBounds(10, 50, 140, 20);
		frame.getContentPane().add(passwordLabel);
		
		passwordField = new JPasswordField(20);
		passwordField.setBounds(160, 50, 120, 20);
		frame.getContentPane().add(passwordField);
		
		okButton = new JButton("OK");
		okButton.setBounds(180, 100, 100, 30);
		frame.getContentPane().add(okButton);
		okButton.addActionListener(this);
		
		// Displaying the entered values
		nameDisplayLabel = new JLabel("Entered name : ");
		nameDisplayLabel.setBounds(10, 150, 100, 20);
		frame.getContentPane().add(nameDisplayLabel);
		
		nameDisplayField = new JTextField(20);
		nameDisplayField.setBounds(140, 150, 100, 20);
		nameDisplayField.setEditable(false);
		frame.getContentPane().add(nameDisplayField);
		
		passwordDisplayLabel = new JLabel("Entered Password : ");
		passwordDisplayLabel.setBounds(10, 180, 130, 20);
		frame.getContentPane().add(passwordDisplayLabel);
		
		passwordDisplayField = new JTextField(20);
		passwordDisplayField.setBounds(150, 180, 100, 20);
		passwordDisplayField.setEditable(false);
		frame.getContentPane().add(passwordDisplayField);
		
		
		
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae){
		String name;
		String password;
		name = nameField.getText();
		password = new String(passwordField.getPassword());
		
		nameDisplayField.setText(name);
		passwordDisplayField.setText(password);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new UsernamePassword();	
			}
		});
	}
}
