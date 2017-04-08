import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField txtUserName;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(52, 65, 86, 16);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(52, 103, 86, 16);
		frame.getContentPane().add(lblPassword);
		
		txtUserName = new JTextField();
		txtUserName.setToolTipText("Username");
		txtUserName.setBounds(147, 60, 215, 36);
		frame.getContentPane().add(txtUserName);
		txtUserName.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// get inputs
				String userName =  txtUserName.getText();
				@SuppressWarnings("deprecation")
				String pwd =  txtPassword.getText();
				
				if (userName.trim().isEmpty() || pwd.trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please suppy your username and password");
					return;
				}
				
				
				System.out.println(txtUserName.getText());
			}
		});
		btnLogin.setBounds(147, 143, 215, 36);
		frame.getContentPane().add(btnLogin);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(147, 95, 215, 33);
		frame.getContentPane().add(txtPassword);
	}
}
