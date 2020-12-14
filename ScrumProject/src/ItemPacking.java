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

public class ItemPacking extends JFrame{
	
	private int weight;
	private int dimensions;
	private int weightItem;
	private int dimensionsItem;
	private int noOfItems;
	
	JPanel pnlMain, pnlInput, pnlButtons, pnlComboBox;
	JLabel lblWeight, lblDimensions, lblWeightItem, lblDimensionsItem ,lblNoOfItems;
	JButton btnReturn;
	JTextField txtWeight,txtDimensions,txtWeightItem, txtDimensionsItem, txtNoOfItems;
	JTextArea txtArea;
	ArrayList<Items> list;
	JFrame f;
	
	public ItemPacking() {
		list = MainGuiWindow.list;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		 lblWeight = new JLabel("Box's Weight: ");
		 lblDimensions = new JLabel("Box's Dimensions(width x height x depth): ");
		 lblWeightItem = new JLabel("Item's Weight: ");
		 lblDimensionsItem = new JLabel("Item's Dimensions(width x height x depth): ");
		 lblNoOfItems = new JLabel ("Number of items to be packed: ");
	     txtArea = new JTextArea();
		
	     JComboBox weight = new JComboBox();
	        weight.addItem("");
			weight.addItem("10");
			weight.addItem("25");
			weight.addItem("50");
			
	     JComboBox dimensions = new JComboBox();
	        dimensions.addItem("");
			dimensions.addItem("8 x 8 x 6");
			dimensions.addItem("12 x 6 x 6");
			dimensions.addItem("12 x 12 x 3");
			
			
	     JComboBox weightItem = new JComboBox();
	        weightItem.addItem("");
			weightItem.addItem("10");
			weightItem.addItem("25");
			weightItem.addItem("50");
			
	     JComboBox dimensionsItem = new JComboBox();
	        dimensionsItem.addItem("");
			dimensionsItem.addItem("8 x 8 x 8");
			dimensionsItem.addItem("12 x 6 x 6");
			dimensionsItem.addItem("12 x 12 x 3");	
			

		txtWeight = new JTextField(10);
		txtDimensions = new JTextField(10);
		txtWeightItem = new JTextField(10);
		txtDimensionsItem = new JTextField(10);
		txtNoOfItems = new JTextField(10);
		btnReturn = new JButton("Return");
		pnlMain = new JPanel(new GridLayout(2, 1));
		pnlInput = new JPanel(new GridLayout(9, 1));
		pnlComboBox= new JPanel(new GridLayout(8,1));
		pnlButtons = new JPanel();
		
			    
		
		pnlInput.add(lblWeight);
		pnlInput.add(weight);
		pnlInput.add(lblDimensions);
        pnlInput.add(dimensions);
        pnlInput.add(lblWeightItem);
		pnlInput.add(weightItem);
		pnlInput.add(lblDimensionsItem);
        pnlInput.add(dimensionsItem);
		pnlInput.add(lblNoOfItems);
		pnlInput.add(txtNoOfItems);
		
		pnlButtons.add(btnReturn);

		pnlMain.add(pnlInput);
		pnlMain.add(pnlButtons);
		add(pnlMain, BorderLayout.SOUTH);
		add(pnlInput, BorderLayout.CENTER);
		
		

		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}