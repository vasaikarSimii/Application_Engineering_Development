package Interface;

import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Business.Product;

@SuppressWarnings("serial")
public class ViewPanel extends JPanel {
	/**
	 * 
	 */
	private JTextField nameTextField;
	private JTextField priceTextField;
	private JTextField availNumTextField;
	private JTextField descriptionTextField;
    
	@SuppressWarnings("unused")
	private Product product;
	
	//product = new Product();
	
	//voidPanel constructor
	public ViewPanel(Product product) {
		
		
		
		JLabel ViewHeadinglbl = new JLabel("VIEW YOUR PRODUCT");
		ViewHeadinglbl.setHorizontalAlignment(SwingConstants.CENTER);
		ViewHeadinglbl.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		
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
		
		displayProduct(product,nameTextField,priceTextField,availNumTextField,descriptionTextField);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
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
					.addComponent(ViewHeadinglbl, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE)
					.addGap(62))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(29)
					.addComponent(ViewHeadinglbl)
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
					.addContainerGap(72, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
	private void displayProduct(Product product,JTextField nameTextField,JTextField priceTextField,JTextField availNumTextField ,JTextField descriptionTextField)
	{   
		//create new variable for each object to display the value set in Textfield 
		
		String productName=product.getName();
		//System.out.println(product.getName());
		nameTextField.setText(productName);
		
		String productPrice=product.getPrice();
		priceTextField.setText(productPrice);
		
		String productDescription=product.getDescription();
		descriptionTextField.setText(productDescription);
		
		String productAvailNum=product.getAvailNum();
		availNumTextField.setText(productAvailNum);	
		
	} 

	
}
