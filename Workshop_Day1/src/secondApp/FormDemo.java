package secondApp;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class FormDemo {

	private JFrame frame;
	private JTextField nameTextField;
	private JLabel nameLabel;
	private JLabel sexLabel;
	private JRadioButton maleRdbtn;
	private JRadioButton femaleRdbtn;
	private JButton btnOk;
	private JLabel lblName;
	private JLabel lblSex;
	private JComboBox<String> comboBox;
	private JLabel lblBranch;
	private JLabel branchLabel;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormDemo window = new FormDemo();
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
	public FormDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Form Example");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		nameLabel = new JLabel("Name : ");
		nameLabel.setBounds(31, 11, 46, 14);
		frame.getContentPane().add(nameLabel);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(87, 8, 130, 20);
		frame.getContentPane().add(nameTextField);
		nameTextField.setColumns(10);
		
		sexLabel = new JLabel("Sex : ");
		sexLabel.setBounds(31, 48, 46, 14);
		frame.getContentPane().add(sexLabel);
		
		maleRdbtn = new JRadioButton("Male");
		maleRdbtn.setBounds(80, 44, 70, 23);
		maleRdbtn.setActionCommand("Male");
		
		femaleRdbtn = new JRadioButton("Female");
		femaleRdbtn.setBounds(152, 44, 85, 23);
		femaleRdbtn.setActionCommand("Female");
		
		ButtonGroup sexGroup = new ButtonGroup();
		sexGroup.add(maleRdbtn);
		sexGroup.add(femaleRdbtn);
		
		frame.getContentPane().add(maleRdbtn);
		frame.getContentPane().add(femaleRdbtn);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 164, 414, 2);
		frame.getContentPane().add(separator);
		
		lblName = new JLabel("Name : ");
		lblName.setBounds(31, 177, 186, 14);
		frame.getContentPane().add(lblName);
		
		lblSex = new JLabel("Sex : ");
		lblSex.setBounds(31, 202, 186, 14);
		frame.getContentPane().add(lblSex);
		
		btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name, sex, branch;
				name = nameTextField.getText();
				sex = sexGroup.getSelection().getActionCommand();
				//branch = String.valueOf(comboBox.getSelectedItem());
				branch = comboBox.getSelectedItem().toString();
				lblName.setText("Name : "+name);
				lblSex.setText("Sex : "+sex);
				lblBranch.setText("Branch : "+branch);
			}
		});
		btnOk.setBounds(277, 27, 89, 23);
		frame.getContentPane().add(btnOk);
		
		comboBox = new JComboBox<>();
		comboBox.addItem("CSE");
		comboBox.addItem("IT");
		comboBox.addItem("ECM");
		comboBox.setBounds(90, 74, 77, 20);
		frame.getContentPane().add(comboBox);
		
		branchLabel = new JLabel("Branch : ");
		branchLabel.setBounds(31, 77, 61, 14);
		frame.getContentPane().add(branchLabel);
		
		lblBranch = new JLabel("Branch : ");
		lblBranch.setBounds(31, 227, 186, 14);
		frame.getContentPane().add(lblBranch);
		
		
	}
}
