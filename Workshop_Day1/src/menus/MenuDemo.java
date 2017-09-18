package menus;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MenuDemo {
		JFrame frame;
		JMenuBar jmenubar;
		JMenu file,options,help;
		JMenuItem itemnew, itemopen, itemsave, itemsaveas, itemabout;
		
		MenuDemo()
		{
			frame=new JFrame("JFrame");
			frame.setLayout(null);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			frame.setResizable(false);
			frame.setSize(500,500);
			frame.setLocation(450,150);
			
			jmenubar = new JMenuBar();
			jmenubar.setBounds(0,0,500,30);
			frame.getContentPane().add(jmenubar);
			
			file= new JMenu("File");
			options= new JMenu("Options");
			options.setToolTipText("This is an option menu.");
			help=new JMenu("Help");
			
			itemnew = new JMenuItem("New");
			itemopen = new JMenuItem("Open");
			itemsave = new JMenuItem("Save");
			itemsaveas = new JMenuItem("Save As");
			file.add(itemnew);
			file.addSeparator();
			file.add(itemopen);
			file.addSeparator();
			file.add(itemsave);
			file.addSeparator();
			file.add(itemsaveas);
			
			itemabout = new JMenuItem("About");
			help.add(itemabout);
			itemabout.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(frame, "Java dialogue!");
					
				}
			});
			
			jmenubar.add(file);
			jmenubar.add(options);
			jmenubar.add(help);
		
		}
		public static void main(String args[])
		{
			EventQueue.invokeLater(new Runnable()
					{
						public void run()
						{
							new MenuDemo();
						}
					});
		}

}
