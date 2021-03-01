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
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

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
		lblNewLabel_1_3_4.setBounds(184, 155, 105, 21);
		panel_1_1.add(lblNewLabel_1_3_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("");
		lblNewLabel_2_5.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		lblNewLabel_2_5.setBounds(167, 176, 122, 19);
		panel_1_1.add(lblNewLabel_2_5);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Home Delevery");
		chckbxNewCheckBox.setBounds(18, 209, 107, 21);
		panel_1_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxTax = new JCheckBox("TAX");
		chckbxTax.setBounds(197, 209, 107, 21);
		panel_1_1.add(chckbxTax);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select a Item", "Cock", "Pepsi", "mango", "orange", "pine", "water", "mink"}));
		comboBox.setBounds(20, 174, 105, 21);
		panel_1_1.add(comboBox);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 136, 300, 4);
		panel_1_1.add(separator);
		
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
		
		JLabel lblNewLabel_1_2_1 = new JLabel("cost of delevry ");
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
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(35, 57, 269, 353);
		panel_1_2.add(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Recipt", null, panel_3, null);
		panel_3.setLayout(null);
		
		textField_4 = new JTextField();
		textField_4.setBounds(48, 34, 181, 269);
		panel_3.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_2, null);
		panel_2.setLayout(null);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(20, 67, 39, 34);
		panel_2.add(btn7);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 10, 197, 39);
		panel_2.add(textField_3);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(69, 67, 39, 21);
		panel_2.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(118, 67, 39, 21);
		panel_2.add(btn9);
		
		JButton btnplus = new JButton("+");
		btnplus.setBackground(Color.BLACK);
		btnplus.setBounds(140, 231, 50, 21);
		panel_2.add(btnplus);
		
		JButton btndiv = new JButton("/");
		btndiv.setBounds(167, 104, 47, 30);
		panel_2.add(btndiv);
		
		JButton btnClear = new JButton("C");
		btnClear.setBounds(80, 226, 50, 30);
		panel_2.add(btnClear);
		
		JButton btnsub = new JButton("-");
		btnsub.setBounds(20, 226, 50, 30);
		panel_2.add(btnsub);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(118, 108, 39, 27);
		panel_2.add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(69, 108, 39, 27);
		panel_2.add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(20, 111, 39, 21);
		panel_2.add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(20, 145, 39, 27);
		panel_2.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(69, 145, 39, 27);
		panel_2.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(123, 145, 45, 27);
		panel_2.add(btn3);
		
		JButton btnmul = new JButton("*");
		btnmul.setBounds(175, 144, 50, 30);
		panel_2.add(btnmul);
		
		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.setBounds(167, 69, 54, 30);
		panel_2.add(btnBackSpace);
		
		JButton btnequal = new JButton("=");
		btnequal.setBounds(177, 195, 50, 21);
		panel_2.add(btnequal);
		
		JButton btnPM = new JButton("+/-");
		btnPM.setBounds(118, 195, 47, 21);
		panel_2.add(btnPM);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(58, 195, 54, 21);
		panel_2.add(btn0);
		
		JButton btndot = new JButton(".");
		btndot.setBounds(20, 195, 39, 21);
		panel_2.add(btndot);
		
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
				
			}
		});
		btnTotal.setBounds(124, 53, 85, 21);
		panel_1_1_1_1.add(btnTotal);
		
		JButton btnRecipt = new JButton("Recipt");
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
				lblNewLabel_2_5.setText(null);
				
				comboBox.setSelectedItem("Select a Item");
				chckbxNewCheckBox.setText(null);
				chckbxTax.setText(null);
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
		
		JLabel lblNewLabel = new JLabel("              Loan managment System");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 46));
		lblNewLabel.setBounds(35, 35, 1078, 51);
		frame.getContentPane().add(lblNewLabel);
	}
}
