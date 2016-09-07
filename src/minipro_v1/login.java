package minipro_v1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnSignIn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(192, 79, 137, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(192, 120, 137, 20);
		panel.add(textField_1);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblLogin.setBounds(91, 82, 46, 17);
		panel.add(lblLogin);
		
		JLabel label = new JLabel("Password");
		label.setFont(new Font("Arial Black", Font.PLAIN, 14));
		label.setBounds(91, 123, 79, 14);
		panel.add(label);
		
		btnSignIn = new JButton("Sign In");
		btnSignIn.setBounds(142, 175, 89, 23);
		panel.add(btnSignIn);
		
		JLabel jLabel1 = new javax.swing.JLabel();
		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("prog/eclipse1/minishit/src/login.jpg"))); // NOI18N
		add(jLabel1, java.awt.BorderLayout.CENTER);
	}

}
