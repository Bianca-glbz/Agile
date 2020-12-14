import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.*;

public class ShoppingBasket extends JFrame {
	ArrayList<Items> list;
	ArrayList<Basket> basket;
	JFrame f;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ShoppingBasket(){
		list = MainGuiWindow.list;
		basket= new ArrayList<Basket>();
		f = new JFrame();
		
		JPanel panel = new JPanel();
		JPanel middle = new JPanel();
		JPanel bottom = new JPanel();
		
		 //Creating ComboBox
		 JComboBox luxuryCB = new JComboBox();
		 JComboBox essentialCB = new JComboBox();
		 JComboBox giftCB = new JComboBox();
		
		//Using test strings
		for(int i =0; i<list.size(); i++) {
			if(list.get(i).getType().equalsIgnoreCase("Luxury")) {
				luxuryCB.addItem(list.get(i).getName());
				}
			else if(list.get(i).getType().equalsIgnoreCase("Essential")) {
				essentialCB.addItem(list.get(i).getName());
			}
			else
				giftCB.addItem(list.get(i).getName());
		}
		
		 

		
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
		JButton AddBasket = new JButton("Add to Basket");
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
		JTextField itemTextField = new JTextField(10);
		itemTextField.setEditable(false);
		itemTextField.setBorder(BorderFactory.createEmptyBorder(15, 5, 15, 5));
		middle.add(itemTextField);
		
		// Price label and textfield
		JLabel priceLabel = new JLabel("(€)Price:");
		middle.add(priceLabel);
		JTextField priceTextField = new JTextField(10);
		priceTextField.setEditable(false);
		priceTextField.setBorder(BorderFactory.createEmptyBorder(15, 5, 15, 5));
		middle.add(priceTextField);
		
		// VAT label and textfield
		JLabel vatLabel = new JLabel("(%)VAT Rate:");
		middle.add(vatLabel);
		JTextField vatTextField = new JTextField(10);
		vatTextField.setEditable(false);
		vatTextField.setBorder(BorderFactory.createEmptyBorder(15, 5, 15, 5));
		middle.add(vatTextField);
		
		// Quantity label and textfield
		JLabel quanitityLabel = new JLabel("Quantity:");
		middle.add(quanitityLabel);
		JTextField quantityTextField = new JTextField(10);
		middle.add(quantityTextField);
		
		
		JButton calculate= new JButton("Calculate Total");
		middle.add(calculate);
		JTextArea finalCal= new JTextArea();
		middle.add(finalCal);
		
	    middle.add(AddBasket);
		JTextArea finalBasket= new JTextArea();
		middle.add(finalBasket);
		



		add(panel, BorderLayout.NORTH);
		add(middle, BorderLayout.CENTER);
	
		add(btnReturn,BorderLayout.SOUTH);
		

		
		luxuryCB.setVisible(true);
	    essentialCB.setVisible(true);
	    giftCB.setVisible(true);

	    search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//need to change get what category of goods the user wants to browse
				int quantity = list.get(0).getQuantity();
				String quant= Integer.toString(quantity);
				itemTextField.setText((String)luxuryCB.getSelectedItem());
				vatTextField.setText("20");
				priceTextField.setText("50");
				quantityTextField.setText(quant);
			}
		});

	    search1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//need to change get what category of goods the user wants to browse

				itemTextField.setText((String)essentialCB.getSelectedItem());
				vatTextField.setText("10");
				priceTextField.setText("30");
			}
		});
	    
	    search2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//need to change get what category of goods the user wants to browse
				itemTextField.setText((String)giftCB.getSelectedItem());
				vatTextField.setText("5");
				priceTextField.setText("20");
			}
		});
	    
	    calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//need to change get what category of goods the user wants to browse
				double one = Double.parseDouble( priceTextField.getText());
				double two = Double.parseDouble( vatTextField.getText());
				double calculate= ((two+100)/100)*one;
				String finalC= Double.toString(calculate);
				finalCal.setText(finalC);
			}
		});
	    
	    AddBasket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = itemTextField.getText();
				int quantity = Integer.parseInt(quantityTextField.getText());
				double vat = Double.parseDouble(vatTextField.getText());
				double price = Double.parseDouble(priceTextField.getText());
				
				Basket AddBasket = new Basket(name, quantity, vat, price);
				basket.add(AddBasket);
				
				itemTextField.setText("");
				quantityTextField.setText("");
				vatTextField.setText("");
				priceTextField.setText("");
				
				finalBasket.setText(basket.toString());
			   
			}
		});
		
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
  }
}
