package firstApp;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonCounter {
	
	// Variables
	JButton countButton;
	JButton resetButton;
	JLabel counterLabel;
	int counter = 0;
	
	public ButtonCounter(){
		init();
	}
	
	public void init(){
		JFrame frame = new JFrame("Button Counter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(500, 150);
		frame.setSize(300, 300);
		frame.setLayout(null);
		
		countButton = new JButton("COUNT");
		countButton.setBounds(100, 40, 100, 50);
		frame.getContentPane().add(countButton);
		countButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				counter++;
				counterLabel.setText("Counter = "+counter);
			}
		});
		
		counterLabel = new JLabel("Counter = "+counter);
		counterLabel.setBounds(100, 120, 200, 20);
		frame.getContentPane().add(counterLabel);
		
		resetButton = new JButton("RESET");
		resetButton.setBounds(100, 200, 100, 50);
		frame.getContentPane().add(resetButton);
		resetButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				counter = 0;
				counterLabel.setText("Counter = "+counter);
				
			}
		});
		
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new ButtonCounter();
				
			}
		});
	}

}
