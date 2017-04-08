import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DashBoard {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashBoard window = new DashBoard();
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
	public DashBoard() {
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
		
		JButton btnNetworkProviders = new JButton("Network Providers");
		btnNetworkProviders.setBounds(114, 29, 204, 45);
		frame.getContentPane().add(btnNetworkProviders);
		
		JButton btnUpload = new JButton("Upload Pin");
		btnUpload.setToolTipText("View All batches");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUpload.setBounds(114, 101, 204, 45);
		frame.getContentPane().add(btnUpload);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(114, 187, 204, 38);
		frame.getContentPane().add(btnLogout);
	}
}
