import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ItemPacking extends JFrame{
	ArrayList<Items> list;
	JFrame f;
	
	public ItemPacking(){
		list = MainGuiWindow.list;
		
		f = new JFrame();
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("");
		JTextField text = new JTextField(10);
		JButton search = new JButton ("SEARCH");
		JButton btnReturn = new JButton("RETURN");
		JTextArea txtArea = new JTextArea();
		
		panel.add(label);
		panel.add(text);
		panel.add(search);
		panel.add(btnReturn);
		panel.add(txtArea);
		
		add(panel, BorderLayout.NORTH);
		add(txtArea,BorderLayout.CENTER);
		add(btnReturn,BorderLayout.SOUTH);
		
		
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
  }
}