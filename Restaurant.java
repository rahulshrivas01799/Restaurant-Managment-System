package Restaurant_S;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Restaurant {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurant window = new Restaurant();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Restaurant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1354, 10);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.DARK_GRAY, 10));
		panel_1.setBounds(475, 96, 314, 251);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"choose one ", "india", "aus", "pak", "ban", "eng"}));
		comboBox_1.setBounds(37, 71, 250, 28);
		panel_1.add(comboBox_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(37, 109, 250, 28);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(37, 147, 250, 28);
		panel_1.add(textField_6);
		
		JButton btnNewButton = new JButton("convert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(37, 198, 85, 21);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.setBounds(175, 198, 85, 21);
		panel_1.add(btnNewButton_1);
		
		JTextPane txtpnCorrencyConverter = new JTextPane();
		txtpnCorrencyConverter.setText("Corrency Converter");
		txtpnCorrencyConverter.setBounds(69, 32, 191, 19);
		panel_1.add(txtpnCorrencyConverter);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new LineBorder(Color.DARK_GRAY, 10));
		panel_1_1.setBounds(35, 96, 430, 251);
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("chicken burger");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(20, 30, 105, 21);
		panel_1_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("chicken burger meal");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(20, 71, 105, 21);
		panel_1_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("cheese burger ");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(20, 105, 105, 21);
		panel_1_1.add(lblNewLabel_1_2);
		
		textField = new JTextField();
		textField.setBounds(168, 33, 163, 19);
		panel_1_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(168, 74, 163, 19);
		panel_1_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(168, 108, 163, 19);
		panel_1_1.add(textField_2);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("Drink");
		lblNewLabel_1_3_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3_3.setBounds(20, 136, 105, 21);
		panel_1_1.add(lblNewLabel_1_3_3);
		
		JLabel lblNewLabel_1_3_4 = new JLabel("Qty");
		lblNewLabel_1_3_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3_4.setBounds(178, 137, 105, 21);
		panel_1_1.add(lblNewLabel_1_3_4);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Home Delevery");
		chckbxNewCheckBox.setBounds(18, 209, 107, 21);
		panel_1_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxTax = new JCheckBox("TAX");
		chckbxTax.setSelected(true);
		chckbxTax.setBounds(207, 209, 107, 21);
		panel_1_1.add(chckbxTax);
		
		JComboBox Selectaitem = new JComboBox();
		Selectaitem.setModel(new DefaultComboBoxModel(new String[] {"Select a Item", "Tea", "Ice Tea", "Coffee", "Ice Coffee", "Cola","Coke", "Orange", "Apple Juice"}));
		Selectaitem.setBounds(20, 167, 105, 21);
		panel_1_1.add(Selectaitem);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 136, 300, 4);
		panel_1_1.add(separator);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(168, 168, 163, 19);
		panel_1_1.add(textField_7);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBorder(new LineBorder(Color.DARK_GRAY, 10));
		panel_1_1_1.setBounds(35, 357, 430, 158);
		frame.getContentPane().add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("Cost of drinks");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(29, 40, 105, 21);
		panel_1_1_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("cost of  meal");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(29, 81, 105, 21);
		panel_1_1_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("cost of delivery ");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2_1.setBounds(29, 115, 105, 21);
		panel_1_1_1.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(202, 40, 122, 19);
		lblNewLabel_2.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		panel_1_1_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		lblNewLabel_2_1.setBounds(202, 81, 122, 19);
		panel_1_1_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		lblNewLabel_2_2.setBounds(202, 115, 122, 19);
		panel_1_1_1.add(lblNewLabel_2_2);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBorder(new LineBorder(Color.DARK_GRAY, 10));
		panel_1_1_2.setBounds(475, 357, 314, 158);
		frame.getContentPane().add(panel_1_1_2);
		panel_1_1_2.setLayout(null);
		
		JPanel panel_1_1_1_2 = new JPanel();
		panel_1_1_1_2.setBounds(156, 15, 1, 1);
		panel_1_1_1_2.setLayout(null);
		panel_1_1_1_2.setBorder(new LineBorder(Color.DARK_GRAY, 10));
		panel_1_1_2.add(panel_1_1_1_2);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Cost of drinks");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3_1.setBounds(29, 40, 105, 21);
		panel_1_1_1_2.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("cost of  meal");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1.setBounds(29, 81, 105, 21);
		panel_1_1_1_2.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("cost of delevry ");
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2_1_1.setBounds(29, 115, 105, 21);
		panel_1_1_1_2.add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		lblNewLabel_2_3.setBounds(202, 40, 122, 19);
		panel_1_1_1_2.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		lblNewLabel_2_1_1.setBounds(202, 81, 122, 19);
		panel_1_1_1_2.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("");
		lblNewLabel_2_2_1.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		lblNewLabel_2_2_1.setBounds(202, 115, 122, 19);
		panel_1_1_1_2.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Tax");
		lblNewLabel_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3_2.setBounds(33, 33, 105, 21);
		panel_1_1_2.add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Sub Total");
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_2.setBounds(33, 74, 105, 21);
		panel_1_1_2.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("Total");
		lblNewLabel_1_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2_1_2.setBounds(33, 108, 105, 21);
		panel_1_1_2.add(lblNewLabel_1_2_1_2);
		
		JLabel lblNewLabel_2_4 = new JLabel("");
		lblNewLabel_2_4.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		lblNewLabel_2_4.setBounds(156, 35, 122, 19);
		panel_1_1_2.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("");
		lblNewLabel_2_4_1.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		lblNewLabel_2_4_1.setBounds(156, 76, 122, 19);
		panel_1_1_2.add(lblNewLabel_2_4_1);
		
		JLabel lblNewLabel_2_4_2 = new JLabel("");
		lblNewLabel_2_4_2.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		lblNewLabel_2_4_2.setBounds(156, 114, 122, 19);
		panel_1_1_2.add(lblNewLabel_2_4_2);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBorder(new LineBorder(Color.DARK_GRAY, 10));
		panel_1_2.setBounds(799, 96, 314, 420);
		frame.getContentPane().add(panel_1_2);
		panel_1_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Recipt");
		lblNewLabel_3.setBounds(122, 20, 46, 38);
		panel_1_2.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(26, 68, 263, 323);
		panel_1_2.add(textField_3);
		textField_3.setColumns(10);
		
		
		
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setBorder(new LineBorder(Color.DARK_GRAY, 10));
		panel_1_1_1_1.setBounds(35, 525, 1078, 126);
		frame.getContentPane().add(panel_1_1_1_1);
		panel_1_1_1_1.setLayout(null);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ChicBurger =Double.parseDouble(textField.getText());
				double iChicBurger =60.39;
				double Burger;
				Burger=(ChicBurger*iChicBurger);
				String pMeal =String.format("%.2f", Burger);
				lblNewLabel_2_1.setText(pMeal);
				
				double ChicBurgerMeal =Double.parseDouble(textField_1.getText());
				double iChicBurgerMeal =50.39;
				double BurgerMeal =50.39 ;
				Burger=(ChicBurgerMeal*iChicBurgerMeal);
				String cpMeal =String.format("%.2f",BurgerMeal + Burger);
				lblNewLabel_2_1.setText(cpMeal);
				
				double CheeseBurger =Double.parseDouble(textField_2.getText());
				double CheeseBurgerPrice =40.39;
				double CheeseBurgerMeal =40.39; 
				Burger=(CheeseBurger*CheeseBurgerPrice);
				String ipMeal =String.format("%.2f", CheeseBurgerMeal+ BurgerMeal + Burger);
				lblNewLabel_2_1.setText(ipMeal);
				
				//.......home .......//
				
				double iDelivery=3.63;
				if(chckbxNewCheckBox.isSelected())
				{
					String pDelivery=String.format("%.2f", iDelivery);
					lblNewLabel_2_2.setText(pDelivery);
					
				}else
				{
					lblNewLabel_2_2.setText("0");
				}
				
						//.......Drinks.......textField_7    comboBox //
				double Drinks=Double.parseDouble(textField_7.getText());
				double Tea =1.552*Drinks;
				double Ice_Tea = 2.2*Drinks;
				double Coffee = 15.2*Drinks;
				double Ice_Coffee = 51.2*Drinks;
				double Cola = 15.2*Drinks;
				double Coke = 1.2*Drinks;
				double Orange = 1.2*Drinks;
				double Apple_Juice = 1.2*Drinks;
				
			
				if(Selectaitem.getSelectedItem().equals("Tea"));
				{
					String cTea=String.format("%.2f",Tea);
					lblNewLabel_2.setText(cTea);
					}
				
				if(Selectaitem.getSelectedItem().equals("Ice Tea"));
				{
					String cIce_Tea=String.format("%.2f", Ice_Tea);
					lblNewLabel_2.setText(cIce_Tea);
					}
				
				if(Selectaitem.getSelectedItem().equals("Coke"));
				{
					String cCoke=String.format("%.2f", Coke);
					lblNewLabel_2.setText(cCoke);
					}
				
				if(Selectaitem.getSelectedItem().equals("Cola"));
				{
					String cCola=String.format("%.2f",Cola);
					lblNewLabel_2.setText(cCola);
					}
				
				if(Selectaitem.getSelectedItem().equals("Orange"));
				{
					String cOrange=String.format("%.2f", Orange);
					lblNewLabel_2.setText(cOrange);
					}
				
				if(Selectaitem.getSelectedItem().equals("Coffee"));
				{
					String cCoffee=String.format("%.2f", Coffee);
					lblNewLabel_2.setText(cCoffee);
					}
				
				if(Selectaitem.getSelectedItem().equals("Ice Coffee"));
				{
					String cIce_Coffee=String.format("%.2f", Ice_Coffee);
					lblNewLabel_2.setText(cIce_Coffee);
					}
				
				if(Selectaitem.getSelectedItem().equals("Apple Juice"));
				{
					String cApple_Juice=String.format("%.2f", Apple_Juice);
					lblNewLabel_2.setText(cApple_Juice);
					}
				
				
				if(Selectaitem.getSelectedItem().equals("Select a Item"));
				{
					
					lblNewLabel_2.setText("0");
					}
				
				//.........tax............//
				
				double cTotal1=Double.parseDouble(lblNewLabel_2.getText());
				double cTotal2=Double.parseDouble(lblNewLabel_2_1.getText());
				double cTotal3=Double.parseDouble(lblNewLabel_2_2.getText());

				double Alltotal=(cTotal1+cTotal2+cTotal3)/100;
				if(chckbxTax.isSelected())
				{
					String iTotal= String.format("%.2f", Alltotal);
					lblNewLabel_2_4.setText(iTotal);
					
				}
				
				//...........total............?
				
				
				double cTotal4=Double.parseDouble(lblNewLabel_2_4.getText());
				
				double subTotal=(cTotal1+cTotal2+cTotal3);
				String isubTotal= String.format("$ %.2f", subTotal);
				lblNewLabel_2_4_1.setText(isubTotal);
				
				
				double allTotal=(cTotal1+cTotal2+cTotal3+cTotal4);
				String iTotal= String.format("$ %.2f", allTotal);
				lblNewLabel_2_4_2.setText(iTotal);
				
				String iTaxTotal= String.format("$ %.2f", cTotal4);
				lblNewLabel_2_4.setText(iTaxTotal);
				


				
			}
		});
		btnTotal.setBounds(124, 53, 85, 21);
		panel_1_1_1_1.add(btnTotal);
		
		JButton btnRecipt = new JButton("Recipt");
		btnRecipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Qty1=Double.parseDouble(textField.getText());
				double Qty2=Double.parseDouble(textField_1.getText());
				double Qty3=Double.parseDouble(textField_2.getText());
				
				textField_3.append("\t\nRestaurant Managment System:\n\n" + "Chicken Burger:\t\t"
				+Qty1 + "\n Chicken Burger Meal:\t\t" + Qty2 +"\n Bacon and Cheese Burger:\t\t" +Qty3 + "\n\n Thanks for Job Estimator");
				


				
			}
		});
		btnRecipt.setBounds(287, 53, 85, 21);
		panel_1_1_1_1.add(btnRecipt);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_2_2.setText(null);
				lblNewLabel_2_1.setText("0");
				lblNewLabel_2.setText(null);
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				//lblNewLabel_2_5.setText(null);
				//chckbxNewCheckBox
				//chckbxTax
				//chckbxNewCheckBox
				textField_7.setText(null);
				
				Selectaitem.setSelectedItem("Select a Item");
				//chckbxNewCheckBox.setText(null);
				//chckbxTax.setText(null);
				comboBox_1.setSelectedItem("Choose one");
				textField_5.setText(null);
				textField_6.setText(null);
				lblNewLabel_2_4.setText(null);
				lblNewLabel_2_4_1.setText(null);
				lblNewLabel_2_4_2.setText(null);
				 
			}
		});
		btnReset.setBounds(454, 53, 85, 21);
		panel_1_1_1_1.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(672, 53, 85, 21);
		panel_1_1_1_1.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("              Restaurants managment System");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 46));
		lblNewLabel.setBounds(35, 35, 1078, 51);
		frame.getContentPane().add(lblNewLabel);
	}
}
