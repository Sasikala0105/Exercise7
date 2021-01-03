import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class customer extends JFrame {

	private JPanel contentPane;
	private JTextField txtFname;
	private JTextField txtAdd;
	private JTextField txtPhone;
	private JTextField txtUser;
	private JTextField txtPass;
	private JTextField txtLname;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customer frame = new customer();
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
	public customer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(null, "Customer Registration", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setBounds(10, 59, 58, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Address");
		lblNewLabel_1.setBounds(10, 109, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Phone");
		lblNewLabel_2.setBounds(10, 174, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Username");
		lblNewLabel_3.setBounds(10, 234, 58, 14);
		contentPane.add(lblNewLabel_3);
		
		txtFname = new JTextField();
		txtFname.setBounds(66, 56, 139, 20);
		contentPane.add(txtFname);
		txtFname.setColumns(10);
		
		txtAdd = new JTextField();
		txtAdd.setBounds(66, 109, 139, 20);
		contentPane.add(txtAdd);
		txtAdd.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setBounds(66, 171, 139, 20);
		contentPane.add(txtPhone);
		txtPhone.setColumns(10);
		
		txtUser = new JTextField();
		txtUser.setBounds(66, 234, 139, 20);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Last Name");
		lblNewLabel_4.setBounds(227, 59, 58, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Gender");
		lblNewLabel_5.setBounds(227, 112, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Model");
		lblNewLabel_6.setBounds(227, 174, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Password");
		lblNewLabel_7.setBounds(227, 234, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JComboBox cmbModel = new JComboBox();
		cmbModel.setModel(new DefaultComboBoxModel(new String[] {"Proton Saga", "Proton Persona", "Proton X50", "Proton X70"}));
		cmbModel.setBounds(292, 170, 110, 22);
		contentPane.add(cmbModel);
		
		JComboBox cmbGender = new JComboBox();
		cmbGender.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Others"}));
		cmbGender.setBounds(292, 108, 110, 22);
		contentPane.add(cmbGender);
		
		txtPass = new JTextField();
		txtPass.setBounds(292, 231, 110, 20);
		contentPane.add(txtPass);
		txtPass.setColumns(10);
		
		txtLname = new JTextField();
		txtLname.setBounds(295, 56, 107, 20);
		contentPane.add(txtLname);
		txtLname.setColumns(10);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFname.getText();
				txtLname.getText();
				txtAdd.getText();
				cmbGender.getSelectedItem();
				cmbModel.getSelectedItem();
				txtPhone.getText();
				txtUser.getText();
				txtPass.getText();
				JOptionPane.showMessageDialog(btnNewButton, "Registered Successfully!");
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(161, 283, 106, 42);
		contentPane.add(btnNewButton);
	}

}
