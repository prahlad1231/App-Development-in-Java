package firstApp;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DemoDialogue {
	
	JButton okButton;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new DemoDialogue();
			}
		});
		
	}
	
	public DemoDialogue(){
		makeGUI();
	}
	
	private void makeGUI(){
		JFrame frame = new JFrame("Demo Dialogue");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setLocation(500, 150);
		frame.setLayout(null);
		
		okButton = new JButton("OK");
		okButton.setBounds(10, 10, 100, 50);
		frame.getContentPane().add(okButton);
		okButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(frame, "This is a demo dialogue.");
				
			}
		});
		
		
		frame.setVisible(true);
	}

}
