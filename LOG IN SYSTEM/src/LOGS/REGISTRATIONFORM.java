package LOGS;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Choice;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class REGISTRATIONFORM extends JFrame {

	private JPanel contentPane;
	private JTextField nameTextfield;
	private JTextField birthdayTextfield;
	private JTextField genderTextfield;
	private JTextField emailTextfield;
	private JTextField usernameTextfield;

	// Launcher
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					REGISTRATIONFORM frame = new REGISTRATIONFORM();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//registration part hays kastress
	public REGISTRATIONFORM() {
		setTitle("REGISTER");
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\Downloads\\earth.png"));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nameLabel = new JLabel("Name : ");
		nameLabel.setForeground(Color.WHITE);
		nameLabel.setFont(new Font("Agency FB", Font.BOLD, 20));
		nameLabel.setBounds(95, 91, 65, 31);
		contentPane.add(nameLabel);
		
		JLabel bdayLabel = new JLabel("Birthday : ");
		bdayLabel.setForeground(Color.WHITE);
		bdayLabel.setFont(new Font("Agency FB", Font.BOLD, 20));
		bdayLabel.setBounds(95, 139, 107, 26);
		contentPane.add(bdayLabel);
		
		JLabel genderLabel = new JLabel("Gender : ");
		genderLabel.setForeground(Color.WHITE);
		genderLabel.setFont(new Font("Agency FB", Font.BOLD, 20));
		genderLabel.setBounds(95, 176, 55, 31);
		contentPane.add(genderLabel);
		
		JLabel emailLabel = new JLabel("Email : ");
		emailLabel.setForeground(Color.WHITE);
		emailLabel.setFont(new Font("Agency FB", Font.BOLD, 20));
		emailLabel.setBounds(95, 218, 46, 24);
		contentPane.add(emailLabel);
		
		JLabel passwordLabel = new JLabel("Password : ");
		passwordLabel.setForeground(Color.WHITE);
		passwordLabel.setFont(new Font("Agency FB", Font.BOLD, 20));
		passwordLabel.setBounds(95, 297, 78, 26);
		contentPane.add(passwordLabel);
		
		JLabel usernameLabel = new JLabel("Username : ");
		usernameLabel.setForeground(Color.WHITE);
		usernameLabel.setFont(new Font("Agency FB", Font.BOLD, 20));
		usernameLabel.setBounds(95, 261, 73, 25);
		contentPane.add(usernameLabel);
		
		nameTextfield = new JTextField();
		nameTextfield.setBounds(139, 97, 169, 26);
		contentPane.add(nameTextfield);
		nameTextfield.setColumns(10);
		
		birthdayTextfield = new JTextField();
		birthdayTextfield.setBounds(159, 139, 149, 27);
		contentPane.add(birthdayTextfield);
		birthdayTextfield.setColumns(10);
		
		genderTextfield = new JTextField();
		genderTextfield.setColumns(10);
		genderTextfield.setBounds(159, 182, 149, 27);
		contentPane.add(genderTextfield);
		
		emailTextfield = new JTextField();
		emailTextfield.setColumns(10);
		emailTextfield.setBounds(139, 218, 169, 27);
		contentPane.add(emailTextfield);
		
		usernameTextfield = new JTextField();
		usernameTextfield.setColumns(10);
		usernameTextfield.setBounds(168, 259, 140, 27);
		contentPane.add(usernameTextfield);
		
		JLabel REGISTER = new JLabel("REGISTER");
		REGISTER.setForeground(Color.WHITE);
		REGISTER.setHorizontalAlignment(SwingConstants.CENTER);
		REGISTER.setFont(new Font("Agency FB", Font.BOLD, 63));
		REGISTER.setBounds(106, 35, 356, 51);
		contentPane.add(REGISTER);
		
		// the password should be private dont forget tinatamad nako maglipat
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(178, 297, 130, 27);
		contentPane.add(passwordField);
		
		JButton RegButton = new JButton("REGISTER");
		RegButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logingui","root","tuto123");
					String query = "insert into infousers values(?,?,?,?,?,?,?)";
					PreparedStatement ps = con.prepareStatement(query);
					int value = 0;
					ps.setLong(1, value);
					ps.setString(2, nameTextfield.getText());
					ps.setString(3, birthdayTextfield.getText());
					ps.setString(4, genderTextfield.getText());
					ps.setString(5, emailTextfield.getText());
					ps.setString(6, usernameTextfield.getText());
					ps.setString(7, passwordField.getText());
					int i = ps.executeUpdate();			
					ps.close();
					con.close();
					
					// If user leaves a blank TEXTFIELD
					
					if(nameTextfield.getText().isEmpty() || birthdayTextfield.getText().isEmpty()){
						JOptionPane.showMessageDialog(null,"DON'T LEAVE  BLANK","NOTE",JOptionPane.WARNING_MESSAGE);
					}else if(genderTextfield.getText().isEmpty() || emailTextfield.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null,"DON'T LEAVE  BLANK","NOTE",JOptionPane.WARNING_MESSAGE);
					}else if (usernameTextfield.getText().isEmpty() || passwordField.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null,"DON'T LEAVE  BLANK","NOTE",JOptionPane.WARNING_MESSAGE);			
					}else { JOptionPane.showMessageDialog(RegButton, "REGISTER SUCCESSFULLY");
					
					
					
					}} catch (Exception e1) {
					
					e1.printStackTrace();
				}
				
				dispose();
						
			
			}

			private JTextField setText(String string) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		RegButton.setBackground(Color.WHITE);
		RegButton.setForeground(Color.DARK_GRAY);
		RegButton.setFont(new Font("Agency FB", Font.BOLD, 18));
		RegButton.setBounds(95, 334, 89, 58);
		contentPane.add(RegButton);
		
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBackground(Color.WHITE);
		btnReset.setForeground(Color.DARK_GRAY);
		btnReset.setFont(new Font("Agency FB", Font.BOLD, 18));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nameTextfield.setText("");
				birthdayTextfield.setText("");
				genderTextfield.setText("");
				emailTextfield.setText("");
				usernameTextfield.setText("");
				passwordField.setText("");
				
				
			}
		});
		btnReset.setBounds(328, 334, 89, 58);
		contentPane.add(btnReset);
		
		JLabel arrowicon = new JLabel("");
		arrowicon.setIcon(new ImageIcon("E:\\Downloads\\icons8-arrow-40.png"));
		arrowicon.setBounds(308, 89, 65, 40);
		contentPane.add(arrowicon);
		
		JLabel arrowicon1 = new JLabel("");
		arrowicon1.setIcon(new ImageIcon("E:\\Downloads\\icons8-arrow-40.png"));
		arrowicon1.setBounds(308, 137, 65, 36);
		contentPane.add(arrowicon1);
		
		JLabel arrowicon2 = new JLabel("");
		arrowicon2.setIcon(new ImageIcon("E:\\Downloads\\icons8-arrow-40.png"));
		arrowicon2.setBounds(308, 176, 40, 36);
		contentPane.add(arrowicon2);
		
		JLabel arrowicon3 = new JLabel("");
		arrowicon3.setIcon(new ImageIcon("E:\\Downloads\\icons8-arrow-40.png"));
		arrowicon3.setBounds(308, 207, 65, 50);
		contentPane.add(arrowicon3);
		
		JLabel arrowicon4 = new JLabel("");
		arrowicon4.setIcon(new ImageIcon("E:\\Downloads\\icons8-arrow-40.png"));
		arrowicon4.setBounds(308, 249, 65, 50);
		contentPane.add(arrowicon4);
		
		JLabel arrowicon5 = new JLabel("");
		arrowicon5.setIcon(new ImageIcon("E:\\Downloads\\icons8-arrow-40.png"));
		arrowicon5.setBounds(308, 286, 65, 50);
		contentPane.add(arrowicon5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("E:\\Downloads\\icons8-plane-20 (1).png"));
		lblNewLabel.setBounds(68, 97, 29, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("E:\\Downloads\\icons8-plane-20 (1).png"));
		lblNewLabel_1.setBounds(68, 140, 29, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("E:\\Downloads\\icons8-plane-20 (1).png"));
		lblNewLabel_2.setBounds(68, 182, 29, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("E:\\Downloads\\icons8-plane-20 (1).png"));
		lblNewLabel_2_1.setBounds(68, 218, 29, 25);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setIcon(new ImageIcon("E:\\Downloads\\icons8-plane-20 (1).png"));
		lblNewLabel_2_2.setBounds(68, 261, 29, 25);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setIcon(new ImageIcon("E:\\Downloads\\icons8-plane-20 (1).png"));
		lblNewLabel_2_3.setBounds(68, 298, 29, 25);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("E:\\Downloads\\family.png"));
		lblNewLabel_3.setBounds(397, 158, 73, 78);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("E:\\Downloads\\airplane.png"));
		lblNewLabel_4.setBounds(6, 11, 184, 91);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("E:\\Downloads\\hello.png"));
		lblNewLabel_5.setBounds(431, 35, 70, 64);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("E:\\Downloads\\hello (1).png"));
		lblNewLabel_6.setBounds(7, 334, 78, 71);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("E:\\Downloads\\bear.png"));
		lblNewLabel_7.setBounds(455, 334, 88, 71);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("HAVE A NICE DAY!!");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Agency FB", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(194, 351, 114, 26);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_10 = new JLabel("is there any problem?");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setBounds(383, 270, 142, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_9 = new JLabel("CONTACT : ");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setBounds(383, 285, 65, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_11 = new JLabel("FB: John Albert Villanueva");
		lblNewLabel_11.setFont(new Font("Agency FB", Font.BOLD, 16));
		lblNewLabel_11.setForeground(Color.GRAY);
		lblNewLabel_11.setBounds(383, 303, 142, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setIcon(new ImageIcon("E:\\Downloads\\pexels-lumn-399160.jpg"));
		lblNewLabel_12.setBounds(0, 0, 525, 409);
		contentPane.add(lblNewLabel_12);
	}
}
