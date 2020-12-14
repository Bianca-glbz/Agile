import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Calculator extends JFrame{
	ArrayList<Items> list;
	ArrayList<Basket> basket;
	JFrame f;
	
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    BigDecimal bd = BigDecimal.valueOf(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}

	public Calculator(){
		list = MainGuiWindow.list;
		
		f = new JFrame();
		
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("BasketTotal: ");
		JLabel total= new JLabel("");
		double yes= Basket.calc();
		String totalCal= Double.toString(yes);
		total.setText(totalCal);
		JTextField text = new JTextField(10);
		text.setText(totalCal);
		JButton search = new JButton ("Enter Payment Amount");
		JTextField text2 = new JTextField("0.0");
		String text3= text2.getText();
		double text4= Double.parseDouble(text3);
		double calculate= yes-text4;
		String change= Double.toString(calculate);
		JButton Calculate = new JButton("Calculate change");
		JTextArea finalBasket= new JTextArea();
		
		
		JButton resetBTN = new JButton("RESET");
		
		JButton btnReturn = new JButton("RETURN");
		JTextArea txtArea = new JTextArea();
		JTextArea txtArea2= new JTextArea();
				
		
		panel.add(label);
		panel.add(text);
		panel.add(search);
		panel.add(text2);
		panel.add(Calculate);
		panel.add(txtArea);
		panel.add(resetBTN);
		panel.add(finalBasket);
		panel.add(btnReturn);
	
		
		add(panel, BorderLayout.NORTH);
		add(panel2, BorderLayout.CENTER);
		add(txtArea,BorderLayout.CENTER);
	
		add(btnReturn,BorderLayout.SOUTH);
	
		
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text3= text2.getText();
				double text4= Double.parseDouble(text3);
				double calculate= round((yes-text4),2);
				String change= Double.toString(calculate);
				txtArea.setText("Change:  €"+change);
				txtArea2.setText(change);
			}	
		});
	
		Calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double Payments= text4;
				String BasketAmounts = txtArea2.getText();
				double basketAmounts= Double.parseDouble(BasketAmounts);
		         double fifty = 50.0D;
		         double twenty = 20.0D;
		         double ten = 10.0D;
		         double fiver = 5.0D;
		         double fiftyCents = 0.5D;
		         double twentyCents = 0.2D;
		         double tenCents = 0.1D;
		         double fiveCents = 0.05D;
		         double oneCent = 0.01D;
		         double changeDue = (double)((int)Math.round((Payments - basketAmounts) * 100.0D)) / 100.0D;
		         double modfifty = (double)((int)Math.round(changeDue % fifty * 100.0D)) / 100.0D;
		         double modtwenty = (double)((int)Math.round(modfifty % twenty * 100.0D)) / 100.0D;
		         double modten = (double)((int)Math.round(modfifty % ten * 100.0D)) / 100.0D;
		         double modfive = (double)((int)Math.round(modfifty % fiver * 100.0D)) / 100.0D;
		         double modFiftyCent = (double)((int)Math.round(modfifty % fiftyCents * 100.0D)) / 100.0D;
		         double modTwentyCent = (double)((int)Math.round(modFiftyCent % twentyCents * 100.0D)) / 100.0D;
		         double modTenCent = (double)((int)Math.round(modTwentyCent % tenCents * 100.0D)) / 100.0D;
		         double modFiveCent = (double)((int)Math.round(modTenCent % fiveCents * 100.0D)) / 100.0D;
		         double modoneCent = (double)((int)Math.round(modFiveCent % oneCent * 100.0D)) / 100.0D;
		         int numfifty = (int)((changeDue - modfifty) / fifty);
		         String numFifty= Integer.toString(numfifty);
		         int numtwenty = (int)((modfifty - modtwenty) / twenty);
		         String numTwenty= Integer.toString(numtwenty);
		         int numten = (int)((modtwenty - modten) / ten);
		         String numTen= Integer.toString(numten);
		         int numfive = (int)((modten - modfive) / fiver);
		         String numFive= Integer.toString(numfive);
		         int numfiftyCents = (int)((modfive - modFiftyCent) / fiftyCents);
		         String numFiftyCents= Integer.toString(numfiftyCents);
		         int numtwentyCents = (int)((modFiftyCent - modTwentyCent) / twentyCents);
		         String numTwentyCents= Integer.toString(numtwentyCents);
		         int numtenCents = (int)((modTwentyCent - modTenCent) / tenCents);
		         String numTenCents= Integer.toString(numtenCents);
		         int numfiveCents = (int)((modTenCent - modFiveCent) / fiveCents);
		         String numFiveCents= Integer.toString(numfiveCents);
		         int numoneCent = (int)((modFiveCent - modoneCent) / oneCent);
		         String numOneCent= Integer.toString(numoneCent);
		         
		         finalBasket.setText("\nFiftys: "+numFifty+" \nTwentys: "+numTwenty+" \nTens: "+numTen+" \nFives: "+numFive+" \nFifty cents: "+numFiftyCents+
		        		 " \nTwentyCents: "+ numTwentyCents+ " \nTen Cents: "+numTenCents+ " \nFive Cents: "+numFiveCents+ " \nOne Cents: "+numOneCent);
			}
		});
		
		resetBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text2.setText("0.00");
				txtArea.setText("");
				finalBasket.setText("");
			}
		});
		
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
  }
}
