import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AddItem extends JFrame 
{

	JPanel pnlMain, pnlInput, pnlButtons, pnlComboBox;
	JLabel lblName, lblType, lblExDate, lblQuantity, lblUniqueID, LABEL;
	JButton btnAdd, btnDelete, btnReturn, SEARCH;
	JTextField txtName, txtQuantity, txtUID, txtDate;
	JTextArea txtArea;
	ArrayList<Items> list;
	JFrame f;
	
	public AddItem() {
		list = MainGuiWindow.list;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		
		
		 
		 lblName = new JLabel("Item Name: ");
		 lblType = new JLabel("Item Type: ");
		 lblQuantity= new JLabel("Quantity");
		 lblUniqueID = new JLabel("Item ID: ");
		 lblExDate = new JLabel("Expiration Date: ");
		 LABEL = new JLabel("Enter Item to check if its in STOCK: ");
		 SEARCH = new JButton ("SEARCH");
	     txtArea = new JTextArea();
		
	  // combo box for Item type
			JComboBox type = new JComboBox();
			type.addItem("Luxury");
			type.addItem("Essential");
			type.addItem("Gift");
		

		txtName = new JTextField(10);
		txtQuantity = new JTextField(10);
		txtUID = new JTextField(10);
		txtDate = new JTextField(10);
		btnAdd = new JButton("Add");
		btnDelete = new JButton("Delete");
		btnReturn = new JButton("Return");
		pnlMain = new JPanel(new GridLayout(2, 1));
		pnlInput = new JPanel(new GridLayout(9, 1));
		pnlComboBox= new JPanel(new GridLayout(8,1));
		pnlButtons = new JPanel();
		
			    
		
		pnlInput.add(lblName);
		pnlInput.add(txtName);
		pnlInput.add(lblType);
		pnlInput.add(type);
		pnlInput.add(lblQuantity);
		pnlInput.add(txtQuantity);
		pnlInput.add(lblUniqueID);
		pnlInput.add(txtUID);
		pnlInput.add(lblExDate);
		pnlInput.add(txtDate);
		pnlInput.add(LABEL);
		pnlInput.add(SEARCH);
		
		pnlButtons.add(btnAdd);
		pnlButtons.add(btnDelete);
		pnlButtons.add(btnReturn);

		pnlMain.add(pnlInput);
		pnlMain.add(pnlButtons);
		add(pnlMain, BorderLayout.SOUTH);
		add(pnlInput, BorderLayout.NORTH);
		
		
		
	
		
		// action listener
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				String types= (String)type.getSelectedItem();
				String exDate = txtDate.getText();
				int quantity = Integer.parseInt(txtQuantity.getText());
				String uniqueID= txtUID.getText();
				
				Items item = new Items(name,types,exDate, quantity, uniqueID);
				list.add(item);
			   
			}
		});
		SEARCH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean find = false;
				txtArea.setText("");
				for (Items ins : MainGuiWindow.list) {
					if (ins.getName().equals(txtName.getText())) {
						txtArea.setText(ins.toString());
						find = true;
					}
				}
					if (!find) {
						 JOptionPane.showMessageDialog(f, "Apologies but Item not in Stock at the moment !", "ERROR!",JOptionPane.WARNING_MESSAGE);
						
					
			}
		}
	});

		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}