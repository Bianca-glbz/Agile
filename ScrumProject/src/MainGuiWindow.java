import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.JFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.JFrame;

public class MainGuiWindow extends JFrame
{
	JFrame frame;
	JPanel panel;
	JButton btnStock, btnBasket, btnCalculator, btnItemPacking, btnExit;
	//making ArrayList static so that it can be accessed globally in each class.
	static ArrayList<Items> list;
	
	public MainGuiWindow()
	{
		windowGUI();
	}
	
	public void windowGUI()
	{
		list = new ArrayList<Items>();
		
    	panel = new JPanel();
    	panel = new JPanel(new GridLayout(5,4));
    	btnStock = new JButton("Stock Control");
    	btnBasket = new JButton("Shopping Basket");
    	btnCalculator = new JButton("Correct Change Calculator");
    	btnItemPacking = new JButton ("Item Packing");
    	btnExit = new JButton("Exit");
    	panel.add(btnStock);
    	panel.add(btnBasket);
    	panel.add(btnCalculator);
    	panel.add(btnItemPacking);
    	panel.add(btnExit);
    	
    	frame = new JFrame();
    	frame.setTitle("Main Window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
    	frame.getContentPane().add(BorderLayout.CENTER, panel);
		
    	btnStock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StockControl stockFrame = new StockControl();
				stockFrame.setTitle("Add Items");
				stockFrame.setSize(400, 400);
				stockFrame.setVisible(true);
				
			}
		});
    	
    	btnBasket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShoppingBasket basketframe = new ShoppingBasket();
				basketframe.setTitle("");
				basketframe.setSize(755, 400);
				basketframe.setVisible(true);
				
			}
    	});
    	
    	btnCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculator calculate = new Calculator();
				calculate.setTitle("");
				calculate.setSize(755, 400);
				calculate.setVisible(true);
			}
    	});
    	
    	btnItemPacking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ItemPacking packing = new ItemPacking();
				packing.setTitle("");
				packing.setSize(400, 400);
				packing.setVisible(true);
			}
    	});
    	
    	btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int option = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?");
				if(option== JOptionPane.YES_OPTION)
					System.exit(0);
				}
    	});
	}
	
	public static void main(String[] args) 
	{
	 new MainGuiWindow();
		
	}
}

