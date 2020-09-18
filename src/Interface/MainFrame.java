package Interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Business.Product;

import javax.swing.BoxLayout;
import javax.swing.JSplitPane;
import java.awt.Color;
import java.awt.CardLayout;
import java.awt.Panel;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	private Product product;
	
	public MainFrame() {
		getContentPane().setBackground(Color.GRAY);
		
		product = new Product();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setContinuousLayout(true);
		
		JPanel displayJPanel = new JPanel();
		splitPane.setRightComponent(displayJPanel);
		displayJPanel.setLayout(new BoxLayout(displayJPanel, BoxLayout.X_AXIS));
		
		JPanel controlJPanel = new JPanel();
		splitPane.setLeftComponent(controlJPanel);
		
		JButton Createbtn = new JButton("Create");
		
		Createbtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				
				CreatePanel createpanel = new CreatePanel(product);
				splitPane.setRightComponent(createpanel);
				
			}
			
		});
		Createbtn.setFont(new Font("Yu Gothic", Font.PLAIN, 14));
		
		JButton Viewbtn = new JButton("View");
		
		
		Viewbtn.addActionListener(new ActionListener()
		{			
			public void actionPerformed(ActionEvent e) {
				
				ViewPanel viewpanel = new ViewPanel(product);
				splitPane.setRightComponent(viewpanel);
			}
		});
		Viewbtn.setHorizontalAlignment(SwingConstants.LEFT);
		Viewbtn.setFont(new Font("Yu Gothic", Font.PLAIN, 14));
		GroupLayout gl_controlJPanel = new GroupLayout(controlJPanel);
		gl_controlJPanel.setHorizontalGroup(
			gl_controlJPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_controlJPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_controlJPanel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(Viewbtn, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(Createbtn, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_controlJPanel.setVerticalGroup(
			gl_controlJPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_controlJPanel.createSequentialGroup()
					.addGap(84)
					.addComponent(Createbtn)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(Viewbtn)
					.addGap(74))
		);
		controlJPanel.setLayout(gl_controlJPanel);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(splitPane, GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(splitPane, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
		);
		panel.setLayout(gl_panel);
	}
}
