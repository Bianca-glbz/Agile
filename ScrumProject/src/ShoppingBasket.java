import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class ShoppingBasket extends JFrame {
	ArrayList<Items> list;
	JFrame f;
	
	public ShoppingBasket(){
		list = MainGuiWindow.list;
		
		f = new JFrame();
		
		JPanel panel = new JPanel();
		JPanel middle = new JPanel();
		
		//Using test strings
		 String[] luxury = { "Rolex", "Cartier", "Benson"};
		 String[] essential = {"Wine", "Vodka", "Rum"};
		 String[] gift = {"Hoodie", "Shoes", "Coat"};
		 
		 //Creating ComboBox
		final JComboBox<String> luxuryCB = new JComboBox<String>(luxury);
		final JComboBox<String> essentialCB = new JComboBox<String>(essential);
		final JComboBox<String> giftCB = new JComboBox<String>(gift);
		
		//Creating item type labels
		JLabel luxuryLabel = new JLabel("Luxury:");
		JLabel essentialLabel = new JLabel("Essential:");
		JLabel giftLabel = new JLabel("Gift:");
		
		//Setting fonts for item Type labels
		luxuryLabel.setFont(new Font("Serif", Font.BOLD, 17));
		essentialLabel.setFont(new Font("Serif", Font.BOLD, 17));
		giftLabel.setFont(new Font("Serif", Font.BOLD, 17));
		
		//Creation of necessary buttons
		JButton search = new JButton ("SEARCH");
		JButton search1 = new JButton ("SEARCH");
		JButton search2 = new JButton ("SEARCH");
		JButton btnReturn = new JButton("RETURN");

		//Luxury ComboBox display
		panel.add(luxuryLabel);
	    panel.add(luxuryCB);
		panel.add(search);
		

		//Essential ComboBox display
		panel.add(essentialLabel);
		panel.add(essentialCB);
		panel.add(search1);
		
		//Gift ComboBox display
		panel.add(giftLabel);
		panel.add(giftCB);
		panel.add(search2);

		panel.add(btnReturn);
		
		
		//Middle Displays
		// Item label and textfield
		JLabel itemLabel = new JLabel("Item:");
		middle.add(itemLabel);
		JTextField itemTextField = new JTextField(20);
		itemTextField.setEditable(false);
		itemTextField.setBorder(BorderFactory.createEmptyBorder(15, 5, 15, 5));
		middle.add(itemTextField);
		
		// Price label and textfield
		JLabel priceLabel = new JLabel("Price:");
		middle.add(priceLabel);
		JTextField priceTextField = new JTextField(20);
		priceTextField.setEditable(false);
		priceTextField.setBorder(BorderFactory.createEmptyBorder(15, 5, 15, 5));
		middle.add(priceTextField);
		
		// VAT label and textfield
		JLabel vatLabel = new JLabel("VAT Rate:");
		middle.add(vatLabel);
		JTextField vatTextField = new JTextField(10);
		vatTextField.setEditable(false);
		vatTextField.setBorder(BorderFactory.createEmptyBorder(15, 5, 15, 5));
		middle.add(vatTextField);
		
		// Quantity label and textfield
		JLabel quanitityLabel = new JLabel("Quantity:");
		middle.add(quanitityLabel);
		JTextField quanitityTextField = new JTextField(20);
		middle.add(quanitityTextField);
		



		add(panel, BorderLayout.NORTH);
		add(middle, BorderLayout.CENTER);
		add(btnReturn,BorderLayout.SOUTH);
		

		
		luxuryCB.setVisible(true);
	    essentialCB.setVisible(true);
	    giftCB.setVisible(true);

	    search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//need to change get what category of goods the user wants to browse

				itemTextField.setText((String)luxuryCB.getSelectedItem());
				vatTextField.setText("20%");
				priceTextField.setText("€50");
			}
		});

	    search1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//need to change get what category of goods the user wants to browse

				itemTextField.setText((String)essentialCB.getSelectedItem());
				vatTextField.setText("10%");
				priceTextField.setText("€30");
			}
		});
	    
	    search2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//need to change get what category of goods the user wants to browse
				itemTextField.setText((String)giftCB.getSelectedItem());
				vatTextField.setText("5%");
				priceTextField.setText("€20");
			}
		});
		
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
  }
}
