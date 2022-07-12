package LOGS;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;

public class LOGINFORM extends JFrame {

	private JPanel contentPane;
	private JTextField userTextfield;
	private JPasswordField passPasswordField;
	private JLabel userLabel;
	private JLabel passLabel;
	private JButton loginButton;
	private JButton exitButton;
	private String username,password;
	private JLabel retrieveLabel;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGINFORM frame = new LOGINFORM();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//log in part
	public LOGINFORM() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\Downloads\\earth.png"));
		setTitle("LOGIN");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 634, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	    userLabel = new JLabel("USERNAME : ");
	    userLabel.setForeground(Color.WHITE);
		userLabel.setFont(new Font("Agency FB", Font.BOLD, 20));
		userLabel.setBounds(168, 127, 147, 24);
		contentPane.add(userLabel);
		
		 passLabel = new JLabel("PASSWORD : ");
		passLabel.setForeground(Color.WHITE);
		passLabel.setFont(new Font("Agency FB", Font.BOLD, 20));
		passLabel.setBounds(168, 203, 110, 36);
		contentPane.add(passLabel);
		
		userTextfield = new JTextField();
		userTextfield.setBounds(271, 131, 147, 24);
		contentPane.add(userTextfield);
		userTextfield.setColumns(10);
		
	    loginButton = new JButton("LOGIN");
		loginButton.setForeground(Color.DARK_GRAY);
		loginButton.setBackground(Color.WHITE);
		loginButton.setFont(new Font("Agency FB", Font.BOLD, 18));
		loginButton.setBounds(198, 275, 89, 36);
		contentPane.add(loginButton);
		loginButton.addActionListener(new ActionListener() {
			private Object addKeyListener;

			public void actionPerformed(ActionEvent e){
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logingui","root","tuto123");
					
					
			    	 username = userTextfield.getText();
					 password = passPasswordField.getText();
					 
					// pagkuha ng mga details ng mga bobo
					 
					java.sql.Statement state = con.createStatement();
					String sql = "select * from infousers where username='"+username+"' and password='"+password+"'";
					ResultSet rs = state.executeQuery(sql);
					
					if(((ResultSet) rs).next()) {
						JOptionPane.showMessageDialog(null, "LOGIN SUCESSFULLY");	
					}else if (userTextfield.getText().isEmpty() || passPasswordField.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null,"DONT LEAVE A BLANK","WARNING",JOptionPane.WARNING_MESSAGE);
					}else if(userTextfield.getText().isEmpty() && passPasswordField.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null,"NO INPUT","WARNING",JOptionPane.WARNING_MESSAGE);
					}else JOptionPane.showMessageDialog(null,"INVALID CREDENTIALS","ERROR",JOptionPane.ERROR_MESSAGE);
					con.close();
					
			
					
				} catch (Exception e1) {
				
					
					e1.printStackTrace();
				}
				
				dispose();
		           
			}					
				}
			
			
		);
		
	    exitButton = new JButton("EXIT");
		exitButton.setBackground(Color.WHITE);
		exitButton.setForeground(Color.DARK_GRAY);
		exitButton.setFont(new Font("Agency FB", Font.BOLD, 18));
		exitButton.setBounds(322, 275, 89, 36);
		contentPane.add(exitButton);
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//exit part
				dispose();
			
		}
			
			});
		
		
		passPasswordField = new JPasswordField();
		passPasswordField.setBounds(271, 211, 147, 24);
		contentPane.add(passPasswordField);
		
		JLabel forgotdetailsLabel = new JLabel("Forgot your password?");
		forgotdetailsLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		forgotdetailsLabel.setBounds(230, 246, 117, 24);
		contentPane.add(forgotdetailsLabel);
		
		
	    retrieveLabel = new JLabel("Retrieve");
		retrieveLabel.setForeground(Color.BLUE);
		retrieveLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		retrieveLabel.setBounds(340, 248, 65, 20);
		contentPane.add(retrieveLabel);
        retrieveLabel.addMouseListener(new MouseListener() {
        	

			@Override
			public void mouseClicked(MouseEvent e) {
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

		
        });
        
		JLabel arrowLabel = new JLabel("");
		arrowLabel.setIcon(new ImageIcon("E:\\Downloads\\icons8-arrow-40.png"));
		arrowLabel.setBounds(415, 118, 65, 50);
		contentPane.add(arrowLabel);
		
		JLabel arrow2Label = new JLabel("");
		arrow2Label.setIcon(new ImageIcon("E:\\Downloads\\icons8-arrow-40.png"));
		arrow2Label.setBounds(415, 203, 59, 42);
		contentPane.add(arrow2Label);
		
		JLabel comIcon = new JLabel("");
		comIcon.setIcon(new ImageIcon("E:\\Downloads\\icons8-this-pc-100.png"));
		comIcon.setBounds(491, 273, 219, 173);
		contentPane.add(comIcon);
		
		JLabel tittleLabel = new JLabel("LOGIN");
		tittleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tittleLabel.setForeground(Color.WHITE);
		tittleLabel.setFont(new Font("Agency FB", Font.BOLD, 56));
		tittleLabel.setBounds(244, 29, 127, 87);
		contentPane.add(tittleLabel);
		
		JLabel human = new JLabel("");
		human.setIcon(new ImageIcon("E:\\Downloads\\icons8-human-98.png"));
		human.setBounds(30, 295, 117, 106);
		contentPane.add(human);
		
		JLabel bag = new JLabel("");
		bag.setIcon(new ImageIcon("E:\\Downloads\\school-bag.png"));
		bag.setBounds(466, 29, 142, 132);
		contentPane.add(bag);
		
		JLabel planeIcon = new JLabel("");
		planeIcon.setIcon(new ImageIcon("E:\\Downloads\\icons8-plane-64.png"));
		planeIcon.setBounds(63, 45, 100, 87);
		contentPane.add(planeIcon);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("E:\\Downloads\\icons8-plane-20 (1).png"));
		lblNewLabel.setBounds(143, 123, 20, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("E:\\Downloads\\icons8-plane-20 (1).png"));
		lblNewLabel_1.setBounds(143, 207, 20, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel pinkBackground = new JLabel("");
		pinkBackground.setIcon(new ImageIcon("E:\\Downloads\\pexels-lumn-399160.jpg"));
		pinkBackground.setBounds(0, 0, 618, 426);
		contentPane.add(pinkBackground);
	}


		
	}
	
	
	
	
	
	
	

