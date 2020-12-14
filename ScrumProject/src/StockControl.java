
import java.awt.BorderLayout;
	import java.awt.GridLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.ArrayList;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;

	public class StockControl extends JFrame {
		JFrame stockFrame;
		JPanel panel;
		JButton btnCreate, btnDisplay, btnReturn;
		// making ArrayList static so that it can be accessed globally in each class.
		
		static ArrayList<Items> list;


		public StockControl() {
			list = new ArrayList<Items>();
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			panel = new JPanel();
			panel = new JPanel(new GridLayout(3, 2));
			btnCreate = new JButton("Add Item");
			btnDisplay = new JButton("View All Items");
			btnReturn = new JButton("Return");
			panel.add(btnCreate);
			panel.add(btnDisplay);
			panel.add(btnReturn);
			
			add(panel, BorderLayout.CENTER);
			

			
			btnCreate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					AddItem stockFrame = new AddItem();
					stockFrame.setTitle("Add Item Details");
					stockFrame.setSize(400, 400);
					stockFrame.setVisible(true);

				}
			});

			btnDisplay.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ViewAllItems itemDisplayframe = new ViewAllItems();
					itemDisplayframe.setTitle("Show Product Details: ");
					itemDisplayframe.setSize(400, 400);
					itemDisplayframe.setVisible(true);

				}
			});

			btnReturn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});

		}

		
	}
