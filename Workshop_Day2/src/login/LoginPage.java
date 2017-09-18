
package login;

import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class LoginPage {

	JFrame window;
	JLabel usernameLabel;
	JLabel passwordLabel;
	JTextField username;
	JPasswordField password;
	
	JButton ok;
	JButton reset;
	
	public LoginPage(){
		initialize();
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new LoginPage();
				
			}
		});
	}
	
	public void initialize(){
		window = new JFrame("Practice 1");
		window.setSize(600, 250);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setVisible(true);
		window.setLayout(null);
		
		usernameLabel = new JLabel("Enter Username : ");
		usernameLabel.setBounds(10, 20, 140, 20);
		window.getContentPane().add(usernameLabel);
		
		username = new JTextField(30);
		username.setBounds(150, 20, 150, 20);
		window.getContentPane().add(username);
		
		passwordLabel = new JLabel("Enter password : ");
		passwordLabel.setBounds(330, 20, 150, 20);
		window.getContentPane().add(passwordLabel);
		
		password = new JPasswordField(15);
		password.setBounds(460, 20, 100, 20);
		window.getContentPane().add(password);
		
		ok = new JButton("Done");
		ok.setBounds(220, 90, 80, 30);
		window.getContentPane().add(ok);
		//window.add(ok);
		ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(new String(password.getPassword()).equals("root")){
					JOptionPane.showMessageDialog(window, "Welcome "+username.getText()+" !");
					// Uncomment this to go to the new window after password is correct
					/*username.setText(null);
					password.setText(null);
					window.dispose();
					WelcomeWindow.main(null);*/
				}
				else{
					JOptionPane.showMessageDialog(window, "Incorrect Password !");
				}
				
			}
		});
		
		reset = new JButton("Reset");
		reset.setBounds(300, 90, 90, 30);
		window.getContentPane().add(reset);
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				username.setText(null);
				password.setText(null);
				JOptionPane.showMessageDialog(window, "Username and Password reset successful.");
				
			}
		});	
	}
		
}
