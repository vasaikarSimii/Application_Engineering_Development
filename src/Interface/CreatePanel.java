package Interface;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import Business.Product;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreatePanel extends JPanel {
	private JTextField nameTextField;
	private JTextField priceTextField;
	private JTextField availNumTextField;
	private JTextField descriptionTextField;

	/**
	 * Create the panel.
	 */
	
	private Product product;
	
	public CreatePanel(Product product) {
		
		JLabel CreateHeadinglbl = new JLabel("CREATE YOUR PRODUCT");
		CreateHeadinglbl.setHorizontalAlignment(SwingConstants.CENTER);
		CreateHeadinglbl.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		
		JLabel Namelbl = new JLabel("Name :");
		Namelbl.setFont(new Font("Yu Gothic", Font.PLAIN, 14));
		
		JLabel Pricelbl = new JLabel("Price : ");
		Pricelbl.setFont(new Font("Yu Gothic", Font.PLAIN, 14));
		
		JLabel Availabilitylbl = new JLabel("Availability :");
		Availabilitylbl.setFont(new Font("Yu Gothic", Font.PLAIN, 14));
		
		JLabel Descriptionlbl = new JLabel(" Description :");
		Descriptionlbl.setFont(new Font("Yu Gothic", Font.PLAIN, 14));
		
		nameTextField = new JTextField();
		nameTextField.setColumns(10);
		
		priceTextField = new JTextField();
		priceTextField.setColumns(10);
		
		availNumTextField = new JTextField();
		availNumTextField.setColumns(10);
		
		descriptionTextField = new JTextField();
		descriptionTextField.setColumns(10);
		
		JButton Createbtn = new JButton("Create");
		Createbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Binding the user input to the product object
				product.setName(nameTextField.getText());
				product.setAvailNum(availNumTextField.getText());
				product.setPrice(priceTextField.getText());
				product.setDescription(descriptionTextField.getText());
				
				//Prompt user that product was successfully created
				
				JOptionPane.showMessageDialog(null, "Product created successfully");
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(201, Short.MAX_VALUE)
					.addComponent(Createbtn)
					.addGap(178))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(51)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(Availabilitylbl)
						.addComponent(Descriptionlbl)
						.addComponent(Namelbl, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
						.addComponent(Pricelbl))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(nameTextField, GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
						.addComponent(priceTextField)
						.addComponent(availNumTextField)
						.addComponent(descriptionTextField))
					.addContainerGap(87, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(125, Short.MAX_VALUE)
					.addComponent(CreateHeadinglbl, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE)
					.addGap(62))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(29)
					.addComponent(CreateHeadinglbl)
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(Namelbl)
						.addComponent(nameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(Pricelbl)
						.addComponent(priceTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(Availabilitylbl)
						.addComponent(availNumTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(Descriptionlbl)
						.addComponent(descriptionTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(Createbtn)
					.addContainerGap(29, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
