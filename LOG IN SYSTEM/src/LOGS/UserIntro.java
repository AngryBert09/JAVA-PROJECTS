package LOGS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Window.Type;
import javax.swing.JPanel;

public class UserIntro {

	private JFrame Loginandregister;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserIntro window = new UserIntro();
					window.Loginandregister.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UserIntro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Loginandregister = new JFrame();
		Loginandregister.setFont(new Font("Agency FB", Font.BOLD | Font.ITALIC, 12));
		Loginandregister.setAlwaysOnTop(true);
		Loginandregister.setForeground(Color.BLACK);
		Loginandregister.setBackground(Color.BLACK);
		Loginandregister.setType(Type.POPUP);
		Loginandregister.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\Downloads\\earth.png"));
		Loginandregister.setResizable(false);
		Loginandregister.getContentPane().setForeground(Color.BLACK);
		Loginandregister.setTitle("WELCOME");
		Loginandregister.setBounds(100, 100, 450, 300);
		Loginandregister.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Loginandregister.getContentPane().setLayout(null);
		
		JButton ButtonLogin = new JButton("LOG IN");
		ButtonLogin.setBackground(Color.WHITE);
		ButtonLogin.setFont(new Font("Agency FB", Font.BOLD, 20));
		ButtonLogin.setIcon(null);
		ButtonLogin.setForeground(Color.GRAY);
		ButtonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LOGINFORM login = new LOGINFORM();
				login.setVisible(true);
				Loginandregister.dispose();
				
			}
		});
		ButtonLogin.setBounds(152, 107, 126, 23);
		Loginandregister.getContentPane().add(ButtonLogin);
		
		JButton RegisterButton = new JButton("REGISTER");
		RegisterButton.setBackground(Color.WHITE);
		RegisterButton.setFont(new Font("Agency FB", Font.BOLD, 20));
		RegisterButton.setForeground(Color.GRAY);
		RegisterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				REGISTRATIONFORM register = new REGISTRATIONFORM();
				register.setVisible(true);
				Loginandregister.dispose();
			         
		
				}
				
			
		});
		RegisterButton.setBounds(152, 142, 126, 23);
		Loginandregister.getContentPane().add(RegisterButton);
		
		JLabel Intro = new JLabel("WELCOME !!!");
		Intro.setFont(new Font("Agency FB", Font.BOLD, 30));
		Intro.setForeground(Color.WHITE);
		Intro.setHorizontalAlignment(SwingConstants.CENTER);
		Intro.setBounds(87, 62, 263, 47);
		Loginandregister.getContentPane().add(Intro);
		
		JLabel facebookIcon = new JLabel("");
		facebookIcon.setIcon(new ImageIcon("E:\\Downloads\\icons8-facebook-48.png"));
		facebookIcon.setBounds(0, 205, 58, 56);
		Loginandregister.getContentPane().add(facebookIcon);
		
		JLabel igIcon = new JLabel("");
		igIcon.setFont(new Font("Tahoma", Font.BOLD, 11));
		igIcon.setIcon(new ImageIcon("E:\\Downloads\\icons8-instagram-63.png"));
		igIcon.setBounds(376, 203, 58, 58);
		Loginandregister.getContentPane().add(igIcon);
		
		JLabel planeIcon = new JLabel("");
		planeIcon.setIcon(new ImageIcon("E:\\Downloads\\icons8-plane-64.png"));
		planeIcon.setBounds(318, 35, 83, 74);
		Loginandregister.getContentPane().add(planeIcon);
		
		JLabel paperplaneIcon2 = new JLabel("");
		paperplaneIcon2.setIcon(new ImageIcon("E:\\Downloads\\icons8-plane-20 (1).png"));
		paperplaneIcon2.setBounds(123, 108, 20, 22);
		Loginandregister.getContentPane().add(paperplaneIcon2);
		
		JLabel paperplaneIcon = new JLabel("");
		paperplaneIcon.setIcon(new ImageIcon("E:\\Downloads\\icons8-plane-20 (1).png"));
		paperplaneIcon.setBounds(122, 142, 20, 23);
		Loginandregister.getContentPane().add(paperplaneIcon);
		
		JLabel helloIcon = new JLabel("");
		helloIcon.setIcon(new ImageIcon("E:\\Downloads\\icons8-hello-48.png"));
		helloIcon.setBounds(37, 24, 48, 51);
		Loginandregister.getContentPane().add(helloIcon);
		
		JLabel fbAccount = new JLabel("John Albert Villanueva");
		fbAccount.setForeground(Color.WHITE);
		fbAccount.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		fbAccount.setBounds(53, 225, 177, 14);
		Loginandregister.getContentPane().add(fbAccount);
		
		JLabel igAccount = new JLabel("@albertsuperduper");
		igAccount.setForeground(Color.WHITE);
		igAccount.setFont(new Font("Bahnschrift", Font.BOLD, 14));
		igAccount.setBounds(240, 225, 147, 14);
		Loginandregister.getContentPane().add(igAccount);
		
		JLabel pinkBackground = new JLabel("");
		pinkBackground.setIcon(new ImageIcon("E:\\Downloads\\pexels-lumn-399160.jpg"));
		pinkBackground.setBounds(0, 0, 434, 261);
		Loginandregister.getContentPane().add(pinkBackground);
	}
}
