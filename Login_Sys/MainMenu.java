package Login_Sys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.BorderLayout;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.ImageIcon;

public class MainMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
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
	public MainMenu() {
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
		
		JLabel lblStudentMenu = new JLabel("Student Menu");
		lblStudentMenu.setFont(new Font("Arial", Font.BOLD, 24));
		lblStudentMenu.setBounds(38, 6, 219, 40);
		frame.getContentPane().add(lblStudentMenu);
		
		JButton btnNewButton = new JButton(">");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(251, 117, 44, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton(">");
		button.setBounds(251, 173, 44, 29);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton(">");
		button_1.setBounds(251, 228, 44, 29);
		frame.getContentPane().add(button_1);
		
		JLabel lblNewLabel = new JLabel("Edit Profile");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setBounds(136, 116, 137, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblSeeGrades = new JLabel("See Grades");
		lblSeeGrades.setFont(new Font("Arial", Font.PLAIN, 20));
		lblSeeGrades.setBounds(136, 172, 137, 24);
		frame.getContentPane().add(lblSeeGrades);
		
		JLabel lblAddCourse = new JLabel("Add Course");
		lblAddCourse.setFont(new Font("Arial", Font.PLAIN, 20));
		lblAddCourse.setBounds(137, 227, 137, 24);
		frame.getContentPane().add(lblAddCourse);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(MainMenu.class.getResource("/Login_Sys/Images/icons8-plus-48.png")));
		lblNewLabel_1.setBounds(85, 217, 61, 40);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(MainMenu.class.getResource("/Login_Sys/Images/icons8-report-card-48.png")));
		lblNewLabel_2.setBounds(85, 162, 61, 40);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(MainMenu.class.getResource("/Login_Sys/Images/icons8-edit-48.png")));
		lblNewLabel_3.setBounds(85, 100, 61, 40);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Please make a selection:");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(110, 59, 219, 16);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
