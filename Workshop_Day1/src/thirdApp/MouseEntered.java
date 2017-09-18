package thirdApp;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseEntered {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new MouseEntered();				
			}
		});
	}
	
	//Declaration of Components
	JPanel panel1, panel2;
	JLabel status;
	
	public MouseEntered(){
		init();
	}
	
	private void init(){
		JFrame frame = new JFrame("Mouse Motions");
		frame.setSize(600, 500);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel1 = new JPanel();
		panel1.setName("Panel 1");
		panel1.setBackground(Color.CYAN);
		//panel1.setSize(250, 250);
		panel1.setBounds(10, 10, 250, 250);
		panel1.setBorder(BorderFactory.createTitledBorder("Cyan Panel"));
		panel1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent me){
				status.setText("Mouse Pointer entered in cyan panel.");
			}
			public void mouseExited(MouseEvent me){
				status.setText("Mouse pointer is not in any of the panels.");
			}
		});
		
		panel2 = new JPanel();
		panel2.setBackground(Color.RED);
		panel2.setBounds(270, 10, 240, 250);
		panel2.setBorder(BorderFactory.createTitledBorder("Red Panel"));
		panel2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent me){
				status.setText("Mouse Pointer entered in red panel.");
			}
			public void mouseExited(MouseEvent me){
				status.setText("Mouse pointer is not in any of the panels.");
			}
		});
		
		frame.getContentPane().add(panel1);
		frame.getContentPane().add(panel2);
		
		status = new JLabel("Mouse pointer is not in any of the panels.");
		status.setBounds(137, 306, 307, 20);
		frame.getContentPane().add(status);
		
		frame.setVisible(true);
	}
}
