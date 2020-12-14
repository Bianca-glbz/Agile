import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ViewAllItems extends JFrame {
	// JTextArea txtArea;
	JPanel panel, panel2, panel3;
	JLabel lbl;
	JButton retBtn;
    JTextArea txtArea;
	ArrayList<Items> list;
 
	public ViewAllItems() {

		list = MainGuiWindow.list;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();

		// displaying Item details in a Text Area
		JTextArea txtArea = new JTextArea();
		txtArea.setText(list.toString());

		lbl = new JLabel("ITEM DETAILS ");
		retBtn = new JButton("RETURN");
		
	    
		panel.add(lbl);
		panel.add(txtArea);
		panel.add(retBtn);
		
		add(panel, BorderLayout.NORTH);
		add(txtArea, BorderLayout.CENTER);
		add(retBtn, BorderLayout.SOUTH);

		retBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
						
					
			}


}

