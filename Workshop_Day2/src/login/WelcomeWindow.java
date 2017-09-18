package login;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.JButton;

public class WelcomeWindow {
	JLabel welcomeLabel;
	JLabel textLabel;

	public void initialize(){
		JFrame window = new JFrame("Welcome Screen");
		window.setSize(650, 500);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.CYAN);
		window.setVisible(true);
		window.getContentPane().setLayout(null);
		
		welcomeLabel = new JLabel("WELCOME");
		welcomeLabel.setBounds(140, 40, 300, 80);
		welcomeLabel.setFont(new Font(null, Font.BOLD, 50));
		window.getContentPane().add(welcomeLabel);
		
		textLabel = new JLabel("You are welcome to the welcome screen. Please Enjoy !");
		textLabel.setBounds(0, 0, 644, 471);
		textLabel.setFont(new Font(null, 0, 20));
		window.getContentPane().add(textLabel);
		
		//Uncomment this to show the logout button and return to main login page
		/*JButton btnLogout = new JButton("LOGOUT");
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLogout.setBounds(486, 11, 148, 52);
		window.getContentPane().add(btnLogout);
		btnLogout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				window.dispose();
				LoginPage.main(null);
				
			}
		});*/
	}
	
	public WelcomeWindow() {
	
		initialize();
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new WelcomeWindow();
				
			}
		});

	}
}
